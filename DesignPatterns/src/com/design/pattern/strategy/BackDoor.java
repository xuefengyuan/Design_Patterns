package com.design.pattern.strategy;

/**
 * 
 * @author Darry
 * ���ǹ��ϰ�æ��ʹ��Ȩ����ɱ����
 */
public class BackDoor implements IStrategy {

	@Override
	public void operate() {
		System.out.println("���ǹ��ϰ�æ�������̫����Ȩʩ��ѹ��");
	}

}
