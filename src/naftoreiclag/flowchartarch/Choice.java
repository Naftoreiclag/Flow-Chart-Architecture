/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.flowchartarch;

import java.util.List;

public abstract class Choice extends Element
{
	

	@Override
	public Surprise execute(Executor executor)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	public static final String name = "choice";
	@Override
	public String getTypeName()
	{
		return name;
	}

}
