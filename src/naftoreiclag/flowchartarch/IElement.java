/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.flowchartarch;

import java.util.List;

public interface IElement
{
	public abstract IElement getParent();
	public abstract List<IElement> getChildren();
	public abstract Anomaly execute();
}
