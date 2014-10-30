/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.flowchartarch.concrete;

import naftoreiclag.flowchartarch.GlobalInv;
import naftoreiclag.flowchartarch.Surprise;
import naftoreiclag.flowchartarch.Element;
import naftoreiclag.flowchartarch.Executor;
import naftoreiclag.flowchartarch.Task;

public class PutDownThing extends Task
{
	String target;
	
	public PutDownThing(Element parent, String target)
	{
		super(parent);
		
		this.target = target;
	}

	@Override
	public Surprise execute(Executor executor)
	{
		if(!executor.inv.transferObject(GlobalInv.t, target))
		{
			return new Surprise("There is no " + target + " to put down!");
		}

		executor.inv.printOut();
		GlobalInv.t.printOut();
		
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
		return new PutDownThing(null, null);
	}

}
