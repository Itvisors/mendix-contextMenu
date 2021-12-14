import { Component, Fragment, createElement, createRef } from "react";

import "./ui/ContextMenu.css";

export default class ContextMenu extends Component {
    constructor(props) {
        super(props);
        this.state = {
            showContent: false
        };
        this.locationX = 0;
        this.locationY = 0;
        this.contextMenuRef = createRef();
        this.componentRef = createRef();

        this.handleClick = this.handleClick.bind(this);
    }

    componentDidMount() {
        window.addEventListener("mousedown", this.handleClick);
    }

    componentWillUnmount() {
        window.removeEventListener("mousedown", this.handleClick);
    }

    componentDidUpdate(prevProps) {
        // IsOpenAttribute can be changed outside of the widget
        if (this.props.isOpenAttribute !== prevProps.isOpenAttribute) {
            this.setState({ showContent: this.props.isOpenAttribute });
        }
    }

    /**
     * When window is clicked, check if the context menu is targeted and otherwise close the context menu
     */
    handleClick(e) {
        if (this.props.closeOnClickOutside) {
            if (this.contextMenuRef && this.contextMenuRef.current && !this.contextMenuRef.current.contains(e.target)) {
                this.closeContextDiv(e);
            }
        }
    }

    /**
     * Function called when the context menu will be opened to set the position, set parameters and call a possible action
     * @param {event} e the event
     */
    showContextDiv = e => {
        e.preventDefault();
        if (this.props.isOpenAttribute) {
            this.props.isOpenAttribute.setValue(true);
        }
        if (this.props.onOpenAction && this.props.onOpenAction.canExecute) {
            this.props.onOpenAction.execute();
        }
        // If the context is shown where clicked, get the location of the target elemenet and the position where click, to know where to place the context within the target
        if (this.props.openWhereClicked) {
            const positionTarget = this.componentRef.current.getBoundingClientRect();
            this.locationX = e.pageX - positionTarget.x;
            this.locationY = e.pageY - positionTarget.y;
        }
        this.setState({ showContent: true });
    };

    /**
     * Function called when the context menu will be closed to set parameters and call a possible action
     * @param {event} e the event
     */
    closeContextDiv = e => {
        e.preventDefault();
        if (this.props.isOpenAttribute) {
            this.props.isOpenAttribute.setValue(false);
        }
        if (this.props.onCloseAction && this.props.onCloseAction.canExecute) {
            this.props.onCloseAction.execute();
        }
        this.setState({ showContent: false });
    };

    render() {
        const onClickContextDiv = this.props.closeOnClickContextDiv ? this.closeContextDiv : undefined;
        let className = "customContextInfo";
        if (this.props.styleAsCard) {
            className += " card customContextInfoAsCard";
        }
        let style = {};
        if (this.props.openWhereClicked) {
            // Position is based on target div
            style = { position: "absolute", left: this.locationX, top: this.locationY };
        }
        return (
            <Fragment>
                <div ref={this.componentRef} onContextMenu={e => this.showContextDiv(e)}>
                    {this.props.content}
                </div>
                {this.state.showContent ? (
                    <div ref={this.contextMenuRef} onClick={onClickContextDiv} className={className} style={style}>
                        {this.props.clickContent}
                        {this.props.showCloseButton ? (
                            <button onClick={this.closeContextDiv} className="customClose close">
                                x
                            </button>
                        ) : undefined}
                    </div>
                ) : undefined}
            </Fragment>
        );
    }
}
