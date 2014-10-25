/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.flowchartarch;

import java.util.List;

public class Executor
{
	WantRoot root = new WantRoot();
	
	public void run()
	{
		evaluate(root);
	}
	
	public void evaluate(IElement step)
	{
		// TODO check for anomalies
		step.execute();
		
		List<IElement> subSteps = step.getChildren();
		
		if(subSteps != null)
		{
			for(int i = 0; i < subSteps.size(); ++ i)
			{
				IElement nextStep = subSteps.get(i);
				
				evaluate(nextStep);
			}
		}
	}
}
