package ex06;

public class Sample {

	public static void main(String[] args) {
		System.out.println("------------------------------------------------------");
		System.out.println("��ǰ��\t����\t�ܰ�\t�ݾ�\t���");
		System.out.println("------------------------------------------------------");
		String[] name= {"�����","��Ź��","������"};
		int[] amount= {2,3,5};
		int[] price= {300,100,150};
		int[] sum= new int[3];
		String[] remark=new String[3];
		int total=0;
		
		for(int i=0; i<=2; i++) {
			sum[i]=amount[i]*price[i];
			
			if(sum[i]>=700) {
				remark[i]="�ֿ��";
			}else if(sum[i]>=500) {
				remark[i]="���";
			}else {
				remark[i]="����";
			}
			
			System.out.println(name[i]+"\t"+amount[i]+"\t"+price[i]+"\t"+sum[i]+"\t"+remark[i]);
			
			total=total+sum[i];
			
		}
		System.out.println("------------------------------------------------------");
		System.out.println("�����հ�\t\t\t"+total);
		System.out.println("------------------------------------------------------");
		

	}

}