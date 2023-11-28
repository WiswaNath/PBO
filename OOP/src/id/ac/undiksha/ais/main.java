package id.ac.undiksha.ais;

import id.ac.undiksha.ais.people.student;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student student1 = new student();
		
		student1.setstudentid("12345");
		student1.setName("wiswa");
		student1.setBirthDate("12 January 2000");
		student1.setGender(false);
		
		student1.printAll();
		
		/*student1.name = "wiswa";
		student1.birthDate = "12 January 2000";
		student1.gender = "false";
		student1.smtr = "3";
		student1.address = "Binjai";
		
		System.out.println(student1.name);
		System.out.println(student1.studentId);
		System.out.println(student1.birthDate);
		
		if (student.gender)
			System.out.println("Male");
		else
			System.out.println("Female");
		
		System.out.println("smtr");
		System.out.println("address");*/
	}

}
