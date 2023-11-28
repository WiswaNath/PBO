package id.ac.undiksha.ais;

import id.ac.undiksha.ais.people.student;
import id.ac.undiksha.ais.people.Lecturer;
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
		
		Lecturer lecturer1 = new Lecturer();
		
		
		lecturer1.setName("WISWANATH");
		lecturer1.setLecturerId("1155666777");
		lecturer1.setAddress("Jln.Udayana");
		lecturer1.setBirthDate("11-16-1999");
		lecturer1.setGender(true);
		lecturer1.setFaculty("FTK");
		lecturer1.setDepartmen("ILKOM");
		lecturer1.setStudyProgram("PBO");
		lecturer1.printAll();
	}
}