// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Car
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject carMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Car";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Make("Make"),
		Model("Model"),
		Colour("Colour");

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

	public Car(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Car"));
	}

	protected Car(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject carMendixObject)
	{
		if (carMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Car", carMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Car");

		this.carMendixObject = carMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Car.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Car initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Car.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Car initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Car(context, mendixObject);
	}

	public static myfirstmodule.proxies.Car load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Car.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Car> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Car> result = new java.util.ArrayList<myfirstmodule.proxies.Car>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Car" + xpathConstraint))
			result.add(myfirstmodule.proxies.Car.initialize(context, obj));
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
	 * @return value of Make
	 */
	public final java.lang.String getMake()
	{
		return getMake(getContext());
	}

	/**
	 * @param context
	 * @return value of Make
	 */
	public final java.lang.String getMake(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Make.toString());
	}

	/**
	 * Set value of Make
	 * @param make
	 */
	public final void setMake(java.lang.String make)
	{
		setMake(getContext(), make);
	}

	/**
	 * Set value of Make
	 * @param context
	 * @param make
	 */
	public final void setMake(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String make)
	{
		getMendixObject().setValue(context, MemberNames.Make.toString(), make);
	}

	/**
	 * @return value of Model
	 */
	public final java.lang.String getModel()
	{
		return getModel(getContext());
	}

	/**
	 * @param context
	 * @return value of Model
	 */
	public final java.lang.String getModel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Model.toString());
	}

	/**
	 * Set value of Model
	 * @param model
	 */
	public final void setModel(java.lang.String model)
	{
		setModel(getContext(), model);
	}

	/**
	 * Set value of Model
	 * @param context
	 * @param model
	 */
	public final void setModel(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String model)
	{
		getMendixObject().setValue(context, MemberNames.Model.toString(), model);
	}

	/**
	 * @return value of Colour
	 */
	public final java.lang.String getColour()
	{
		return getColour(getContext());
	}

	/**
	 * @param context
	 * @return value of Colour
	 */
	public final java.lang.String getColour(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Colour.toString());
	}

	/**
	 * Set value of Colour
	 * @param colour
	 */
	public final void setColour(java.lang.String colour)
	{
		setColour(getContext(), colour);
	}

	/**
	 * Set value of Colour
	 * @param context
	 * @param colour
	 */
	public final void setColour(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String colour)
	{
		getMendixObject().setValue(context, MemberNames.Colour.toString(), colour);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return carMendixObject;
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
			final myfirstmodule.proxies.Car that = (myfirstmodule.proxies.Car) obj;
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
		return "MyFirstModule.Car";
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
