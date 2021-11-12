import { Component, createElement, Fragment } from "react";

//import { HelloWorldSample } from "./components/HelloWorldSample";
import "./ui/ContextMenu.css";

export default class ContextMenu extends Component {
    constructor(props) {
        super(props);
        this.state = {
            showContent: false
        };
    }

    handleRightClick = e => {
        e.preventDefault();
        this.setState({ showContent: true });
    };

    handleClick = e => {
        e.preventDefault();
        this.setState({ showContent: false });
    };

    render() {
        return (
            <Fragment>
                <div onClick={e => this.handleClick(e)} onContextMenu={e => this.handleRightClick(e)} on>
                    {this.props.content}
                </div>
                {this.state.showContent ? (
                    <div onClick={e => this.handleClick(e)}>this.props.clickContent</div>
                ) : undefined}
            </Fragment>
        );
    }
}
