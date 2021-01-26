package com.objparam.controller;

import com.objparam.model.vo.Lunch;

public class ObjectParam {
	
	private String check;
	
	//1. �⺻ �ڷ��� �Ű�����, ��ü, �迭 �Ű������� ����
	public void basicParam(int su, String str) {
		su++;
		str+="�⺻�ڷ��� ���ϱ�";
		System.out.println("����ƴ�?");
	}
	
	public void arrparam(int[] arrInt) {//arrInt�� �Ʊ� arr �迭�� �ּҰ��� ��
		                                //�ּҰ��� �˰� �����Ƿ� [] ���ٿ����ڸ� ���� heap������ �ִ� �迭�� ���� �����Ͽ� ������ ���� ����
		arrInt[0]=100;
		arrInt[1]=200;
	}
	
	public void objParam(Lunch lunch) {//��ü l�� �ּҰ��� �޾����Ƿ� ������ ���� ����
		lunch.setName("�ܹ���");
		lunch.setPrice(8000);
	}
	
	public void checkTest() {
		check+=10;
		System.out.println(check);
	}
	public void setCheck (String check) {
		this.check=check;
	}

}
