package ex02;

public class Calculator {
	//�ʵ�
	int x;
	int y;
	
	//�⺻������(��ü�� �����ϴ� ������)
	Calculator(){
		
	}
	
	//�Ϲݻ�����
	Calculator(int x, int y){
		this.x=x;
		this.y=y;
	}
	//�޼���(����)
	int plus(int x, int y) {
		int result=x+y;
		return result;
	}
	
	//������ �޼���
	double divide(int x, int y) {
		double result=(double)x/y;
		return result;
		
	
	}
	//���ϱ� �޼���
	int rhqgkrl(int x, int y) {
		int result=x*y;
		return result;
	}
}