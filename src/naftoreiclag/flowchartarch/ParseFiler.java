/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.flowchartarch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class ParseFiler
{
	public static final char sep = ',';
	public static final char tab = '\t';
	public static final char nl = '\n';
	
	public static void writeTree(Element root)
	{
		StringBuilder builder = new StringBuilder();
		
		getTreeSyntax(builder, 0, root);
		
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
	
	private static void getTreeSyntax(StringBuilder builder, int depth, Element elements)
	{
		for(int i = 0; i < depth; ++ i)
		{
			builder.append(tab);
		}
		builder.append(elements.getTypeName());
		builder.append(sep);
		builder.append(elements.getName());
		builder.append(nl);
		
		List<Element> children = elements.getChildren();
		if(children != null)
		{
			for(int i = 0; i < children.size(); ++ i)
			{
				Element child = children.get(i);
				getTreeSyntax(builder, depth + 1, child);
			}
		}
	}
}
