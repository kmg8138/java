package ex04;

public class Sample {

	public static void main(String[] args) {
		 // �ڵ� ����ȯ(������ -> ū��) char->int, int->double
		char charValue='a';
		int intValue=charValue;
		System.out.println(intValue);
		
		double doubleValue=charValue;
		System.out.println(doubleValue);
		
		intValue=100;
		doubleValue=intValue;
		System.out.println(doubleValue);
		
		//���� ����ȯ(ū�� -> ������) int->char, double->int
		intValue=65;
		charValue=(char)intValue;
		System.out.println(charValue);
		
		doubleValue=100.5;
		intValue=(int)doubleValue;
		System.out.println(intValue);
		
		int kor=91, eng=100;
		double avg=(double)(kor+eng)/2;
		System.out.println(avg);
		
		doubleValue=12.4567;
		intValue=(int)doubleValue;
		System.out.println(intValue);
		
		intValue=68;
		charValue=(char)intValue;
		System.out.println(charValue);
		
		for(char i='A'; i<='Z'; i++) {
			intValue = i;
			System.out.println(i + ":" intValue);
		}
		
	}

}
