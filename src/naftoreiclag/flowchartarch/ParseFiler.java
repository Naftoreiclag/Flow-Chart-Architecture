/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.flowchartarch;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import naftoreiclag.flowchartarch.concrete.ConstructSandwich;
import naftoreiclag.flowchartarch.concrete.GetMaterialsForSandwich;
import naftoreiclag.flowchartarch.concrete.GetThing;
import naftoreiclag.flowchartarch.concrete.LocateBread;
import naftoreiclag.flowchartarch.concrete.MakeSandwich;
import naftoreiclag.flowchartarch.concrete.PutDownThing;

import org.apache.commons.io.FileUtils;

public class ParseFiler
{
	public static final char sep = ',';
	public static final char ssep = '|';
	public static final char tab = '\t';
	public static final char nl = '\n';
	
	public static Genes readGenes() throws IOException
	{
		List<String> data = FileUtils.readLines(new File("file.txt"));
		
		
		System.out.println(data.getClass().toString());
		System.out.println(data.size());
		
		Genes genes = new Genes();
		List<Element> linage = new ArrayList<Element>();
		linage.add(0, genes);
		
		for(String line : data)
		{
			// Track where we are on the string
			int head = 0;
			
			// Depth
			for(; head < line.length(); ++ head)
			{
				if(line.charAt(head) != tab)
				{
					break;
				}
			}
			int depth = head;
			
			if(depth < 1)
			{
				continue;
			}

			// Type name
			for(; head < line.length(); ++ head)
			{
				if(line.charAt(head) == sep)
				{
					break;
				}
			}
			String typeName = line.substring(depth, head);
			++ head;
			
			/*
			// Concrete name
			int _foo = head;
			for(; head < line.length(); ++ head)
			{
				if(line.charAt(head) == sep)
				{
					break;
				}
			}
			String name = line.substring(_foo, head);
			++ head;
			*/
			
			System.out.println("depth: " + depth + " type: " + typeName);
			
			// parse accordingly
			Element el = parse(typeName);
			
			linage.add(depth, el);
			
			linage.get(depth - 1).addChild(el);
			
		}
		
		return genes;
		
	}
	
	public static Map<String, Element> things = new HashMap<String, Element>();
	static
	{
		things.put(ConstructSandwich.name, new ConstructSandwich(null));
		things.put(GetMaterialsForSandwich.name, new GetMaterialsForSandwich(null));
		things.put(GetThing.name, new GetThing(null, null));
		things.put(LocateBread.name, new LocateBread(null));
		things.put(MakeSandwich.name, new MakeSandwich(null));
		things.put(PutDownThing.name, new PutDownThing(null, null));
		//things.
	}
	
	public static Element parse(String name)
	{
		Element element = null;
		
		Element foo = things.get(name);
		
		if(foo != null)
		{
			element = foo.clone();
		}
		
		return element;
	}

	public static void writeGenes(Genes genes)
	{
		StringBuilder builder = new StringBuilder();

		appendElementData(builder, 0, genes);
		
		try
		{
			FileUtils.writeStringToFile(new File("file.txt"), builder.toString());
			System.out.println("   Successuful print");
		}
		catch (NumberFormatException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void appendElementData(StringBuilder builder, int depth, Element elements)
	{
		if(depth >= 0)
		{
			for(int i = 0; i < depth; ++ i)
			{
				builder.append(tab);
			}
			builder.append(elements.getName());
			builder.append(sep);
			
			// args here
	
			builder.append(ssep);
			
			// other stuff here
			
			builder.append(nl);
		}
		
		List<Element> children = elements.getChildren();
		if(children != null)
		{
			for(int i = 0; i < children.size(); ++ i)
			{
				Element child = children.get(i);
				appendElementData(builder, depth + 1, child);
			}
		}
	}
}
