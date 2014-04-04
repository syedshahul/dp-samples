package com.dp.samples.abstractfactory.impl;

import com.dp.samples.abstractfactory.ComputerAbstractFactory;

/**
 * @author syedshahul.
 */
public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
