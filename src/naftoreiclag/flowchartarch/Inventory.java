/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.flowchartarch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Inventory
{
	private final List<String> objects = new ArrayList<String>();
	public final String name;
	
	public Inventory(String name)
	{
		this.name = name;
	}
	
	public void addObject(String object)
	{
		Random rand = new Random();
		int a = objects.size() + 1;
		objects.add(rand.nextInt(a), object);
	}
	
	//
	public boolean transferObject(Inventory receiver, String object)
	{
		for(int i = 0; i < objects.size(); ++ i)
		{
			if(objects.get(i).equals(object))
			{
				objects.remove(i);
				receiver.addObject(object);
				return true;
			}
		}
		return false;
	}

	public void printOut()
	{
		System.out.println("  " + this.name + " contents:");
		for(int i = 0; i < objects.size(); ++ i)
		{
			System.out.println("    " + objects.get(i));
		}
		
	}
}
