package ex01;

public class Sample {

	public static void main(String[] args) {
		//배열에 있는 데이터들에 대한 평균값과 최대값
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
		System.out.println("평균:" + avg);
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
	}

}
