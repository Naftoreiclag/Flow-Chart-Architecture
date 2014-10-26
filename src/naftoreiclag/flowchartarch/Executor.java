/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.flowchartarch;

import java.util.List;

import naftoreiclag.flowchartarch.concrete.MakeSandwich;

public class Executor
{
	
	public Inventory inv = new Inventory();
	
	Microtask microtask;
	WantRoot root = new WantRoot();
	
	public void run()
	{
		root.addWant(new MakeSandwich(root));
		
		evaluate(root);
	}
	
	public void setMicrotask(Microtask microTask)
	{
		this.microtask = microTask;
	}
	
	public void evaluate(Element step)
	{
		Anomaly a = step.execute(this);
		System.out.println("Executed " + step.getClass().getSuperclass().getSimpleName() + ": " + step.getClass().getSimpleName());
		if(a != null)
		{
			System.out.println("  Anomaly: " + a);
		}
		
		List<Element> subSteps = step.getChildren();
		
		if(subSteps != null)
		{
			for(int i = 0; i < subSteps.size(); ++ i)
			{
				Element nextStep = subSteps.get(i);
				
				evaluate(nextStep);
			}
		}
	}
}
