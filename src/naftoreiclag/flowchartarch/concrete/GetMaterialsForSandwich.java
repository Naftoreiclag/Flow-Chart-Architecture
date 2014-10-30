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

public class GetMaterialsForSandwich extends Want
{

	public GetMaterialsForSandwich(Element parent)
	{
		super(parent);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Surprise execute(Executor executor)
	{
		children.add(new LocateBread(this));
		children.add(new LocateBread(this));
		return null;
	}

	public static final String name = "choice";
	@Override
	public String getName()
	{
		return name;
	}
	@Override
	public Element clone()
	{
		return new GetMaterialsForSandwich(null);
	}
}
