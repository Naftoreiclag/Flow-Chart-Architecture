/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.flowchartarch;

import java.util.ArrayList;
import java.util.List;

import naftoreiclag.flowchartarch.concrete.MakeSandwich;

public class Genes extends Element
{
	public Genes()
	{
		super(null);
	}
	public void addWant(Want want)
	{
		children.add(want);
	}


	@Override
	public Surprise execute(Executor executor)
	{
		return null;
	}

	public static final String name = "genes";
	@Override
	public String getTypeName()
	{
		return name;
	}

	@Override
	public String getName()
	{
		return name;
	}
	@Override
	public Element clone()
	{
		return new Genes();
	}
}
