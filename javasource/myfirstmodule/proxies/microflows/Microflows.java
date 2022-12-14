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
	public static void aCT_GenerateTestData(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MyFirstModule.ACT_GenerateTestData").withParams(params).execute(context);
	}
	public static myfirstmodule.proxies.Search dS_EnsureSearch(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.DS_EnsureSearch").withParams(params).execute(context);
		return result == null ? null : myfirstmodule.proxies.Search.initialize(context, result);
	}
	public static java.util.List<myfirstmodule.proxies.Car> dS_GetCarsByXPath(IContext context, myfirstmodule.proxies.Search _search)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Search", _search == null ? null : _search.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("MyFirstModule.DS_GetCarsByXPath").withParams(params).execute(context);
		java.util.List<myfirstmodule.proxies.Car> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(myfirstmodule.proxies.Car.initialize(context, obj));
		}
		return result;
	}
}