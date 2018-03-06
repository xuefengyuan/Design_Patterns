package com.design.pattern.strategy;

/**
 * 
 * @author Darry
 * 求吴国太开个绿灯 
 */
public class GivenGreenLight implements IStrategy {

	@Override
	public void operate() {
		System.out.println("求吴国太开个绿灯,放行");
	}

}
