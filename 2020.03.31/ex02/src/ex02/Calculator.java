package ex02;

public class Calculator {
	//필드
	int x;
	int y;
	
	//기본생성자(객체를 생성하는 생성자)
	Calculator(){
		
	}
	
	//일반생성자
	Calculator(int x, int y){
		this.x=x;
		this.y=y;
	}
	//메서드(동작)
	int plus(int x, int y) {
		int result=x+y;
		return result;
	}
	
	//나누기 메서드
	double divide(int x, int y) {
		double result=(double)x/y;
		return result;
		
	
	}
	//곱하기 메서드
	int rhqgkrl(int x, int y) {
		int result=x*y;
		return result;
	}
}
