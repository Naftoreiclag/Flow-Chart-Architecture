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
import naftoreiclag.flowchartarch.WantRoot;

public class ConstructSandwich extends Want
{

	public ConstructSandwich(Element parent)
	{
		super(parent);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Surprise execute(Executor executor)
	{
		this.children.add(new PutDownThing(this, "bread"));
		this.children.add(new PutDownThing(this, "bread"));
		
		
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
		return new ConstructSandwich(null);
	}

}
