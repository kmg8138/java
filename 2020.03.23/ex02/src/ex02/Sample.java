package ex02;

public class Sample {

	public static void main(String[] args) {
		// �Ǽ��� ���� = float, double
		double num1 = 10.5f;
		double num2 = 20.3f;
		double num3 = num1 + num2;
		double num4 = num1 - num2;
		double num5 = num1 * num2;
		double num6 = num1 / num2;
		System.out.println("num1 + num2=" + num3);
		System.out.println("num1 - num2=" + num4);
		System.out.println("num1 * num2=" + num5);
		System.out.println("num1 / num2=" + num6);
		
		//(Ȱ��)�������� 5�� ���� ����
		int r=5;
		double area=r * r * 3.14;
		System.out.println("��������" + r + "�� ���ǳ���=" + area);

	}

}
