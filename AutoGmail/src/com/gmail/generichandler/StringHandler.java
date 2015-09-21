package com.gmail.generichandler;

import org.testng.annotations.Test;

public class StringHandler {
	
	public static String createStringObj(char[] charsobj){
		String strobj=new String(charsobj); //creating new object
		System.out.println(strobj);
		return strobj;
	}
	
	public static void stringArray2D(){
		char[] charobj={'a','b','c','d'}; //creating new object
		System.out.println(charobj[2]);
	}
	@Test
	public static void newCharObj(){
		char[] charobj={'a','b','c','d'}; //creating new object
		String strobj=new String(charobj,2,2);
		System.out.println(strobj);
	}
	
	
}
