// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class ContextMenu
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject contextMenuMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.ContextMenu";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		IsOpen("IsOpen");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ContextMenu(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.ContextMenu"));
	}

	protected ContextMenu(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject contextMenuMendixObject)
	{
		if (contextMenuMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.ContextMenu", contextMenuMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.ContextMenu");

		this.contextMenuMendixObject = contextMenuMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ContextMenu.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.ContextMenu initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.ContextMenu.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.ContextMenu initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.ContextMenu(context, mendixObject);
	}

	public static myfirstmodule.proxies.ContextMenu load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.ContextMenu.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.ContextMenu> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.ContextMenu> result = new java.util.ArrayList<myfirstmodule.proxies.ContextMenu>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.ContextMenu" + xpathConstraint))
			result.add(myfirstmodule.proxies.ContextMenu.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of IsOpen
	 */
	public final java.lang.Boolean getIsOpen()
	{
		return getIsOpen(getContext());
	}

	/**
	 * @param context
	 * @return value of IsOpen
	 */
	public final java.lang.Boolean getIsOpen(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsOpen.toString());
	}

	/**
	 * Set value of IsOpen
	 * @param isopen
	 */
	public final void setIsOpen(java.lang.Boolean isopen)
	{
		setIsOpen(getContext(), isopen);
	}

	/**
	 * Set value of IsOpen
	 * @param context
	 * @param isopen
	 */
	public final void setIsOpen(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isopen)
	{
		getMendixObject().setValue(context, MemberNames.IsOpen.toString(), isopen);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return contextMenuMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.ContextMenu that = (myfirstmodule.proxies.ContextMenu) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.ContextMenu";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
