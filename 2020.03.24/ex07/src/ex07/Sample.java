package ex07;

public class Sample {

	public static void main(String[] args) {
		int i=0;
		int sum=0;
		
		//1~100�հ�
		while(i<100) {
			i=i+1; // -> i���� 1�� ����(i++,i+=1)
			sum=sum+i; //i���� sum���� ����(sum=i)	
		}
		System.out.println("1~100������ �հ�=" + sum);
		
		//0~100 ¦�� �հ�
		i=0;
		sum=0;
		
		while(i<100) {
			i=i+2;
			sum=sum+i;	
		}
		System.out.println("0~100 ¦�� �հ�=" + sum);
		//1~99 Ȧ�� �հ�
		i=-1;
		sum=0;
		
		while(i<99) {
			i=i+2;
			sum=sum+i;
					
		}
		System.out.println("1~99 Ȧ�� �հ�=" + sum);
	}
	
}