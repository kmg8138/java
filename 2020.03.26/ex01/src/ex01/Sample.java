package ex01;

public class Sample {

	public static void main(String[] args) {
		//�迭�� �ִ� �����͵鿡 ���� ��հ��� �ִ밪
		int[] num= {-98,-50,-77,-45,-60};
		int sum=0;
		int max=-9999999;
		int min=0;
		for(int i=0; i<=num.length-1; i++) {
			sum=sum+num[i];
			
			if(num[i]>max) {
				max=num[i];
			}
			if(num[i]<min) {
				min=num[i];
			}
		}
		double avg=(double)sum/num.length;
		System.out.println("���:" + avg);
		System.out.println("�ִ밪:" + max);
		System.out.println("�ּҰ�:" + min);
	}

}
