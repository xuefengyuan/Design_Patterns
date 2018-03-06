package com.design.pattern.strategy;

/**
 * 
 * @author Darry
 * ��ı���ˣ��ǻ�Ҫ�н���
 */
public class Context {
	// ���캯������Ҫʹ���Ǹ���� 
	private IStrategy strategy;
	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	//ʹ�ü�ı�ˣ����ҳ����� 
	public void operate() {
		this.strategy.operate();
	}
}
