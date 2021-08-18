package java07_4week;

public class java0729_2 {
	int PerAge;
	String PerName;
	boolean PerMarriged;
	int PerChild;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java0729_2 person1 = new java0729_2();		
		java0729_2 person2 = new java0729_2();
		
		person2.PerAge = 50;
		person1.PerAge = 50;
		person1.PerName = "±è»çºÎ";
		person1.PerMarriged = true;
		person1.PerChild = 4;
		
		System.out.println(person2.PerAge);
	}

}
