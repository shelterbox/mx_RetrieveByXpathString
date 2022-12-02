// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Search
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject searchMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Search";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Xpath("Xpath"),
		Search_Session("MyFirstModule.Search_Session");

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

	public Search(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Search"));
	}

	protected Search(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject searchMendixObject)
	{
		if (searchMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Search", searchMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Search");

		this.searchMendixObject = searchMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Search.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Search initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Search.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Search initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Search(context, mendixObject);
	}

	public static myfirstmodule.proxies.Search load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Search.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Search> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Search> result = new java.util.ArrayList<myfirstmodule.proxies.Search>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Search" + xpathConstraint))
			result.add(myfirstmodule.proxies.Search.initialize(context, obj));
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
	 * @return value of Xpath
	 */
	public final java.lang.String getXpath()
	{
		return getXpath(getContext());
	}

	/**
	 * @param context
	 * @return value of Xpath
	 */
	public final java.lang.String getXpath(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Xpath.toString());
	}

	/**
	 * Set value of Xpath
	 * @param xpath
	 */
	public final void setXpath(java.lang.String xpath)
	{
		setXpath(getContext(), xpath);
	}

	/**
	 * Set value of Xpath
	 * @param context
	 * @param xpath
	 */
	public final void setXpath(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpath)
	{
		getMendixObject().setValue(context, MemberNames.Xpath.toString(), xpath);
	}

	/**
	 * @return value of Search_Session
	 */
	public final system.proxies.Session getSearch_Session() throws com.mendix.core.CoreException
	{
		return getSearch_Session(getContext());
	}

	/**
	 * @param context
	 * @return value of Search_Session
	 */
	public final system.proxies.Session getSearch_Session(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.Session result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Search_Session.toString());
		if (identifier != null)
			result = system.proxies.Session.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Search_Session
	 * @param search_session
	 */
	public final void setSearch_Session(system.proxies.Session search_session)
	{
		setSearch_Session(getContext(), search_session);
	}

	/**
	 * Set value of Search_Session
	 * @param context
	 * @param search_session
	 */
	public final void setSearch_Session(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.Session search_session)
	{
		if (search_session == null)
			getMendixObject().setValue(context, MemberNames.Search_Session.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Search_Session.toString(), search_session.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return searchMendixObject;
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
			final myfirstmodule.proxies.Search that = (myfirstmodule.proxies.Search) obj;
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
		return "MyFirstModule.Search";
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
