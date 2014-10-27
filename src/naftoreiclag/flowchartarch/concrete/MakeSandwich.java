/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.flowchartarch.concrete;

import naftoreiclag.flowchartarch.Anomaly;
import naftoreiclag.flowchartarch.Element;
import naftoreiclag.flowchartarch.Executor;
import naftoreiclag.flowchartarch.Want;

public class MakeSandwich extends Want
{
	public MakeSandwich(Element parent)
	{
		super(parent);
	}

	@Override
	public Anomaly execute(Executor executor)
	{
		children.add(new GetMaterialsForSandwich(this));
		children.add(new ConstructSandwich(this));
		
		return null;
	}
}
