package com.design.pattern.strategy;

/**
 * 
 * @author Darry
 * �����̫�����̵� 
 */
public class GivenGreenLight implements IStrategy {

	@Override
	public void operate() {
		System.out.println("�����̫�����̵�,����");
	}

}
