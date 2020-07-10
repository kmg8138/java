package ex02;

//³ĞÀÌ
public class Area {
	//»ï°¢Çü³ĞÀÌ
	static double triangle(int x, int y) {
		System.out.println("»ï°¢Çü³ĞÀÌ");
		return (double)x*y/2;
	}
	
	//Á÷»ç°¢Çü³ĞÀÌ
	static int rectangle(int x, int y) {
		System.out.println("Á÷»ç°¢Çü³ĞÀÌ");
		return x*y;
	}
	
	//Á¤»ç°¢Çü³ĞÀÌ
	static int rectangle(int x) {
		System.out.println("Á¤»ç°¢Çü³ĞÀÌ");
		return x*x;
	}
	
	//¿øÀÇ³ĞÀÌ
	static double circle(int r) {
		System.out.println("¿øÀÇ³ĞÀÌ");
		final double pi=3.141597;
		return r*r*pi;
	}
}
