package id.ac.undiksha.ais.people;

public class student {
	
	public String studentId;
	public String name;
	public String birthDate;
	public boolean gender; // 0=female. 1=male
	private String address;
	public int smtr;
	
	
	public String getstudentid() {
		return this.studentId;
	}
	
	public void setstudentid(String studentid) {
		this.studentId = studentid;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isGender() {
		return gender;
	}
	
	public String getGender() {
		if (this.isGender()) {
			return "Male";
			}
		else {
			return "Female";
		}
	}
	
	
	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSmtr() {
		return smtr;
	}

	public void setSmtr(int smtr) {
		this.smtr = smtr;
	}
	
	public void setStudentId1(String studentId) {
		this.studentId = studentId;
	}
	
	public void printAll() {
		System.out.println(this.name);
		System.out.println(this.studentId);
		System.out.println(this.birthDate);
		
		if (this.gender)
			System.out.println("Male");
		else
			System.out.println("Female");
		
		System.out.println(this.smtr);
		System.out.println(this.address);
	}
	
}
