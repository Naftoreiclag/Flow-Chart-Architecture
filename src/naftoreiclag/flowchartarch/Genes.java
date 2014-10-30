/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.flowchartarch;

import java.util.ArrayList;
import java.util.List;

import naftoreiclag.flowchartarch.concrete.MakeSandwich;

public class Genes
{
	public List<Want> wants = new ArrayList<Want>();

	public void addWant(MakeSandwich makeSandwich)
	{
		wants.add(makeSandwich);
	}
}
