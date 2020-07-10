package ex03;

public class Sample {

	public static void main(String[] args) {
		Grade[] grade=new Grade[2];
		grade[0]=new Grade("01","이송현",95,72,85);
		grade[1]=new Grade("02","이대현",92,78,83);
		
		for(int i=0; i<grade.length; i++) {
			grade[i].printgrade();
		}
	}

}
