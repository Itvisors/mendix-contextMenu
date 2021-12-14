// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the MyFirstModule module
	public static void aCT_ContextMenu_ToggleIsOpen(IContext context, myfirstmodule.proxies.ContextMenu _contextMenu)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContextMenu", _contextMenu == null ? null : _contextMenu.getMendixObject());
		Core.microflowCall("MyFirstModule.ACT_ContextMenu_ToggleIsOpen").withParams(params).execute(context);
	}
	public static myfirstmodule.proxies.ContextMenu dS_ContextMenu(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.DS_ContextMenu").withParams(params).execute(context);
		return result == null ? null : myfirstmodule.proxies.ContextMenu.initialize(context, result);
	}
	public static java.util.List<myfirstmodule.proxies.Item> dS_ItemList(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.List<IMendixObject> objs = Core.microflowCall("MyFirstModule.DS_ItemList").withParams(params).execute(context);
		java.util.List<myfirstmodule.proxies.Item> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(myfirstmodule.proxies.Item.initialize(context, obj));
		}
		return result;
	}
}