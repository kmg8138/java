package ex03;

public class Sample {

	public static void main(String[] args) {
		String name="냉장고";
		int price=300;
		int number=5;
		int total=price*number;
		String remark="";

		if(total>=1000) {
			remark="최우수";
		}else if(total>=500) {
			remark="우수";
		}else {
			remark="보통";
		}
		System.out.println(remark);
	}

}
