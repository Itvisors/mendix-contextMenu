import { Component, createElement } from "react";

import { HelloWorldSample } from "./components/HelloWorldSample";
import "./ui/ContextMenu.css";

export default class ContextMenu extends Component {
    render() {
        return <HelloWorldSample sampleText={this.props.sampleText} />;
    }
}
