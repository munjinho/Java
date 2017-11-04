package ch1;

import com.sun.org.apache.bcel.internal.generic.LNEG;

public class Total_EX {

	public static void main(String[] args) {
		/* ==================== */
		Boolean bool1 = 10 > 20; // 참/거짓 (1byte)
		Boolean bool2 = 10 < 20; 
		char ch = 'a'; 			// 문자 (2byte)
		String str = "jinho";	// 문자열 (바이트 수:(문자 개수))
		/* ==================== */
		int num1 = 10; 		// 정수 (4byte)
		long num2 = 30; 		// 큰 정수 (8byte)
		/* ==================== */
		float dub1 = 40.50F; 	// 실수 (4byte)
		double dub2 = 50.50; 	// 큰 실수 (8byte)
		/* ==================== */
		System.out.println("/* ==================== */"); // <<== 19라인 (무시)
		System.out.println("10 > 20: "+bool1);// 거짓 
		System.out.println("10 < 20: "+bool2);// 참 
		/* ==================== */
		System.out.println("ch: "+ch);	  // 문자 
		System.out.println("str: "+str);  // 문자열 
		/* ==================== */
		System.out.println("num1: "+num1);// 정수 
		System.out.println("num2: "+num2);// 큰 정수 
		System.out.println("dub1: "+dub1);// 실수 
		System.out.println("dub2: "+dub2);// 큰 실수 
		/* ==================== */
		System.out.println("/* ==================== */");

	}

}
