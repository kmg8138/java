package ex03;

public class Sample {

	public static void main(String[] args) {
		String name="�����";
		int price=300;
		int number=5;
		int total=price*number;
		String remark="";

		if(total>=1000) {
			remark="�ֿ��";
		}else if(total>=500) {
			remark="���";
		}else {
			remark="����";
		}
		System.out.println(remark);
	}

}