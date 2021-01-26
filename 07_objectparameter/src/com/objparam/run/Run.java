package com.objparam.run;

import com.objparam.controller.ObjectParam;
import com.objparam.model.vo.Lunch;

public class Run {
	
	public static void main(String[] args) {
		
		//1. 기본 자료형
		ObjectParam op = new ObjectParam();
		int su = 100;
		String str = "호호호";
		
		op.basicParam(su, str);
		System.out.println(su+" : "+str);
		//기본 자료형은 다른 메소드에서 원본 값 수정 불가능
		//수정해줄려면 controller 클래스 등에서 리턴 값을 받고 그 값을 main에서 반환받아야 됨
		
		
		//2. 배열
		int[] arr = {1,2,3,4};//하나의 배열이기 때문에 heap영역에 생성
		System.out.println(arr);//주소값
		op.arrparam(arr);//controller에 주소값이 감
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		//엥! 배열은 기본 자료형과 다르게 원본 값이 수정되네!!!!!!
		//주소값을 알고 있으므로 [] 접근연산자를 통해 heap영역에 있는 배열에 접근 가능하여 원본값 수정 가능
		
		
		//3. 객체
		Lunch l = new Lunch();//객체가 heap영역에 생김
		l.setCategory("한식");
		l.setName("청국장");
		l.setPrice(8000);
		l.setCapacity(1);
		System.out.println(l.getCategory()+" "+l.getName()+" "+l.getPrice()+" "+l.getCapacity());
		
		op.objParam(l);//heap에 있는 객체 l의 주소값을 보냄
		System.out.println(l.getCategory()+" "+l.getName()+" "+l.getPrice()+" "+l.getCapacity());
		
		//heap영역에 생성된 저장소는 주소값을 알면 어떤 stack 영역에서도 접근 가능
		
		
		op.setCheck("대입!! 값");
		op.checkTest();
		new ObjectParam().setCheck("이건");
		new ObjectParam().checkTest();
		
		
		
	}

}
