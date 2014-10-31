/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.flowchartarch.concrete;

import naftoreiclag.flowchartarch.Surprise;
import naftoreiclag.flowchartarch.Element;
import naftoreiclag.flowchartarch.Executor;
import naftoreiclag.flowchartarch.Want;

public class MakeSandwich extends Want
{
	public static final String name = "w_makesandwich";
	
	@Override
	public Surprise execute(Executor executor)
	{
		return null;
	}
	@Override
	public String getName()
	{
		return name;
	}
	@Override
	public Element clone()
	{
		return new MakeSandwich();
	}
}
