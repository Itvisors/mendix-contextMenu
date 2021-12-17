## ContextMenu
Widget used to add a context menu / show extra information for mendix content

## Features
- Show extra information / context menu on right click
- Possibility to close when clicked outside
- Possibility to add close button
- Use attribute to determine whether the context is open or closed
- Call action when open or closed

## Usage
Place the widget on a page. In the top part of the widget, configure the content to be shown that can be right clicked. In the bottom part, configure the information to be shown when right clicked. Configure the properties as desired. If you want to use an attribute to close/open the context, add a context object around the widget that stores this boolean. Make sure the user has got write access for this property.

