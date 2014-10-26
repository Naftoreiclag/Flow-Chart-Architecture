/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.flowchartarch;

public class GlobalInv
{
	public static final Inventory i = new Inventory("Goodie bag");
	
	static
	{
		i.addObject("bread");
		i.addObject("bread");
	}
}
