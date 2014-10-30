/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.flowchartarch;

import java.util.List;

public class ParseFiler
{
	public static void writeTree(Element root)
	{
		StringBuilder builder = new StringBuilder();
		
		getTreeSyntax(builder, 0, root);
		
		
	}
	
	private static void getTreeSyntax(StringBuilder builder, int depth, Element step)
	{
		builder.append(step.getTypeName());
		builder.append(",");
		builder.append(step.getName());
		
		List<Element> subSteps = step.getChildren();
		
		if(subSteps != null)
		{
			for(int i = 0; i < subSteps.size(); ++ i)
			{
				Element nextStep = subSteps.get(i);
				
				getTreeSyntax(builder, depth + 1, nextStep);
			}
		}
	}
}
