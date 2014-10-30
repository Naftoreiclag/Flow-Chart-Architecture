/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.flowchartarch;

import java.util.LinkedList;
import java.util.List;

public class WantRoot extends Element
{
	public static final String name = "root";

	public void addWant(Want want)
	{
		children.add(want);
	}

	@Override
	public Surprise execute(Executor executor)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
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
		return new WantRoot();
	}

}
