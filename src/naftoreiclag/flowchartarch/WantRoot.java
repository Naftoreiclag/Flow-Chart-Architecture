/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.flowchartarch;

import java.util.LinkedList;
import java.util.List;

public class WantRoot implements IElement
{
	public List<Want> wants = new LinkedList<Want>();
	
	//
	public void addWant(Want want)
	{
		wants.add(want);
	}
	

	@Override
	public IElement getParent()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IElement> getChildren()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Anomaly execute()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
