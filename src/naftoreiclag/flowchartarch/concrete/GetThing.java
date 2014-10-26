/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.flowchartarch.concrete;

import naftoreiclag.flowchartarch.Anomaly;
import naftoreiclag.flowchartarch.Element;
import naftoreiclag.flowchartarch.Executor;
import naftoreiclag.flowchartarch.GlobalInv;
import naftoreiclag.flowchartarch.Task;

public class GetThing extends Task
{
	String target;
	
	public GetThing(Element parent, String target)
	{
		super(parent);
		
		this.target = target;
	}

	@Override
	public Anomaly execute(Executor executor)
	{
		if(!GlobalInv.i.transferObject(executor.inv, target))
		{
			return new Anomaly("There is no " + target + " to take!");
		}
		
		GlobalInv.i.printOut();
		executor.inv.printOut();
		
		return null;
		
	}

}
