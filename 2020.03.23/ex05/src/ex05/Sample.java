package ex05;

public class Sample {

	public static void main(String[] args) {
		//���������
		int num1=10;
		int num2=3;
		int result1=num1+num2;
		int result2=num1-num2;
		int result3=num1*num2;
		int result4=num1/num2;
		int result5=num1%num2;
		
		//+, -, *, /,% �� ���� ������ ���
		System.out.println(num1 + "+" + num2 + "=" + result1);
		System.out.println(num1 + "-" + num2 + "=" + result2);
		System.out.println(num1 + "*" + num2 + "=" + result3);
		System.out.println(num1 + "/" + num2 + "=" + result4);
		System.out.println(num1 + "%" + num2 + "=" + result5);
		
		//����(��)������
		boolean result6=(num1==num2);
		System.out.println(num1 + "==" + num2 + ":" + result6);
		result6=(num1>num2); //ũ��
		System.out.println(num1 + ">" + num2 + ":" + result6);
		result6=(num1<num2); //�۴�
		System.out.println(num1 + "<" + num2 + ":" + result6);
		result6=(num1>=num2); //ũ�ų� ����
		System.out.println(num1 + ">=" + num2 + ":" + result6);
		result6=(num1<=num2); //�۰ų� ����
		System.out.println(num1 + "<=" + num2 + ":" + result6);
		result6=(num1!=num2); //���� �ʴ�
		System.out.println(num1 + "!=" + num2 + ":" + result6);
		
		//���������� (and, or, not)
		result6=(num1>10) || (num2<5); //or
		System.out.println("------------");
		System.out.println(result6);
		
		result6=(num1>10)&&(num2<5); //and
		System.out.println(result6);
		
		result6=!(num1>10)&&(num2<5); // !-> not
		System.out.println(result6);
		
		int age=23;
		char gender='M';
		//20�� �̻��̸鼭 �����̸� ���尡�� �ƴϸ� �Ұ��� ���
		if(age>=20 && gender == 'M') {
			System.out.println("���尡��");
		}else {System.out.println("����Ұ���");
		}	
		
		int kor=90, eng=60;
		//����, ���� ������ ���� 70�� �̻��̰� ��յ� 70�� �̻��̸� �հ� �ƴϸ� ���հ�
		double avg=(double)(kor+eng)/2;
		if(kor>=70 && eng>=70 && avg>=70) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
		
		//���׿�����
		int grade=65;
		if(grade>=70) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
		
		String result=(grade>=70) ? "�հ�":"���հ�";
			System.out.println(result);
			
			//���׿�����
			System.out.println(--grade);
			
			//���Կ�����
			grade=60;
			System.out.println(grade);
			grade +=3; // grade=grade+3 �� ���� ����
			System.out.println(grade);
			grade -=3; // grade=grade-3 �� ���� ����
			System.out.println(grade);
		}
	}

