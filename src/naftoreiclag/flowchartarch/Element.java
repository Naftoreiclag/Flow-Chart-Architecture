/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.flowchartarch;

import java.util.LinkedList;
import java.util.List;

public abstract class Element
{
	public int timesAccessed;
	public int age;
	
	public final Element parent;
	public final List<Element> children = new LinkedList<Element>();
	
	public Element(Element parent)
	{
		this.parent = parent;
	}
	
	public List<Element> getChildren()
	{
		return children;
	}
	
	public abstract Surprise execute(Executor executor);

	public void getSyntax()
	{
		// TODO Auto-generated method stub
		
	}

	public abstract String getTypeName();

	public abstract String getName();
}
