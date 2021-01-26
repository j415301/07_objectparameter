package com.objparam.controller;

import com.objparam.model.vo.Lunch;

public class ObjectParam {
	
	private String check;
	
	//1. 기본 자료형 매개변수, 객체, 배열 매개변수의 차이
	public void basicParam(int su, String str) {
		su++;
		str+="기본자료형 더하기";
		System.out.println("실행됐니?");
	}
	
	public void arrparam(int[] arrInt) {//arrInt에 아까 arr 배열의 주소값이 들어감
		                                //주소값을 알고 있으므로 [] 접근연산자를 통해 heap영역에 있는 배열에 접근 가능하여 원본값 수정 가능
		arrInt[0]=100;
		arrInt[1]=200;
	}
	
	public void objParam(Lunch lunch) {//객체 l의 주소값을 받았으므로 원본값 수정 가능
		lunch.setName("햄버거");
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
