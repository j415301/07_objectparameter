package com.objparam.run;

import com.objparam.controller.ObjectParam;
import com.objparam.model.vo.Lunch;

public class Run {
	
	public static void main(String[] args) {
		
		//1. �⺻ �ڷ���
		ObjectParam op = new ObjectParam();
		int su = 100;
		String str = "ȣȣȣ";
		
		op.basicParam(su, str);
		System.out.println(su+" : "+str);
		//�⺻ �ڷ����� �ٸ� �޼ҵ忡�� ���� �� ���� �Ұ���
		//�������ٷ��� controller Ŭ���� ��� ���� ���� �ް� �� ���� main���� ��ȯ�޾ƾ� ��
		
		
		//2. �迭
		int[] arr = {1,2,3,4};//�ϳ��� �迭�̱� ������ heap������ ����
		System.out.println(arr);//�ּҰ�
		op.arrparam(arr);//controller�� �ּҰ��� ��
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		//��! �迭�� �⺻ �ڷ����� �ٸ��� ���� ���� �����ǳ�!!!!!!
		//�ּҰ��� �˰� �����Ƿ� [] ���ٿ����ڸ� ���� heap������ �ִ� �迭�� ���� �����Ͽ� ������ ���� ����
		
		
		//3. ��ü
		Lunch l = new Lunch();//��ü�� heap������ ����
		l.setCategory("�ѽ�");
		l.setName("û����");
		l.setPrice(8000);
		l.setCapacity(1);
		System.out.println(l.getCategory()+" "+l.getName()+" "+l.getPrice()+" "+l.getCapacity());
		
		op.objParam(l);//heap�� �ִ� ��ü l�� �ּҰ��� ����
		System.out.println(l.getCategory()+" "+l.getName()+" "+l.getPrice()+" "+l.getCapacity());
		
		//heap������ ������ ����Ҵ� �ּҰ��� �˸� � stack ���������� ���� ����
		
		
		op.setCheck("����!! ��");
		op.checkTest();
		new ObjectParam().setCheck("�̰�");
		new ObjectParam().checkTest();
		
		
		
	}

}
