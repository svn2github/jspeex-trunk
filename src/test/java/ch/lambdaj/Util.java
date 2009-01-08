/**
 * // Modified or written by Ex Machina SAGL for inclusion with lambdaj.
 * // Copyright (c) 2008 Mario Fusco, Luca Marrocco.
 * // Licensed under the Apache License, Version 2.0 (the "License")
 */
package ch.lambdaj;

import net.sf.json.*;
import net.sf.json.util.*;

public class Util {

	public static String toJsonString(Object object) {
		if (JSONUtils.isArray(object)) return JSONArray.fromObject(object).toString();
		if (JSONUtils.isObject(object)) return JSONObject.fromObject(object).toString();
		return object.toString();
	}
	
	public static String cleanJsonString(String json) {
		return json.replaceAll("\"", "");
	}
	
	public static String cleanJsonString(String json, String match) {
		return json.replace(match, "");
	}
}
