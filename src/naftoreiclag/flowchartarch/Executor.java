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
	
	public Inventory inv = new Inventory("My inv");
	
	Microtask microtask;
	WantRoot root = new WantRoot();
	Genes genes = new Genes();
	
	public void run()
	{
		GlobalInv.i.printOut();
		
		genes.addWant(new MakeSandwich(root));

		ParseFiler.writeGenes(genes);
		/*
		root.addWant(new MakeSandwich(root));
		
		evaluate(root);
		ParseFiler.writeTree(root);
		*/
	}
	
	public void setMicrotask(Microtask microTask)
	{
		this.microtask = microTask;
	}
	
	public void evaluate(Element step)
	{
		System.out.println("Executing " + step.getClass().getSuperclass().getSimpleName() + ": " + step.getClass().getSimpleName());
		Surprise a = step.execute(this);
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
