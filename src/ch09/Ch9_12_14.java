package ch09;

/*[자바의 정석 - 기초편] ch9-12~14 StringJoiner, 문자열과 기본형 변환*/

public class Ch9_12_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iVal = 90;
		String strVal = String.valueOf(iVal);
		
		double dVal = 200.0;
		String strVal2 = dVal + "";
		
		double sum = Integer.valueOf("+"+strVal)+Double.valueOf(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("", strVal, "+", strVal2, "=")+sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);
	}

}
