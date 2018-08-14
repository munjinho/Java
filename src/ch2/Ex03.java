package ch1;

public class Ex11 {

	public static void main(String[] args) {
		/*
		 * 1.정수 -> 실수 
		 * (4byte) -> (8byte)
		 * 2.실수 -> 정수 
		 * (8byte) -> (4byte)
		 * 3.정수 -> 문자
		 * (4byte) -> (1byte)
		 */
		//================================
		//정수 상수 
		int num = 65;
		//실수 상수 
		double dub = 97.5;
		//문자 상수
		char ch = 'a';//(힌트: 아스키: 97) 
		//================================
		//4byte -> 8byte
		dub=(double)num;
		System.out.println("double: "+dub);
		//8byte -> 4byte 
		num=(int)dub;
		System.out.println("int: "+num);
		//4byte -> 1byte
		ch=(char)num;
		System.out.println("char: "+ch);
		//================================
		System.out.println("ch == (char)num\n"+ (ch==(char)num));
	}
}
