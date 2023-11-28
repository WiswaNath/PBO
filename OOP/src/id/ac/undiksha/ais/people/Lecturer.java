package id.ac.undiksha.ais.people;

public class Lecturer {
	
	private String Name;
	private String LecturerId;
	private String Address;
	private boolean gender; // 0-female 1-male
	private String BirthDate;
	private String Faculty;
	private String Departmen;
	private String StudyProgram;
	
	
	public String getName()
	{
		return this.Name;
	}
	
	public void  setName(String Name)
	{
		this.Name = Name;
	}

	public String getLecturerId() {
		return this.LecturerId;
	}

	public void setLecturerId(String LecturerId) {
		this.LecturerId = LecturerId;
	}

	public String getBirthDate() {
		return this.BirthDate;
	}

	public void setBirthDate(String BirthDate) {
		this.BirthDate = BirthDate;
	}

	public boolean isGender() {
		return this.gender;
	}

	public void setGender(boolean Gender) {
		this.gender = Gender;
	}

	public String getAddress() {
		return this.Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	public String getFaculty() {
		return this.Faculty;
	}

	public void setFaculty(String Faculty) {
		this.Faculty = Faculty;
	}
	public String getDepartmen() {
		return this.Departmen;
	}

	public void setDepartmen(String Departmen) {
		this.Departmen = Departmen;
	}
	public String getStudyProgram() {
		return this.StudyProgram;
	}

	public void setStudyProgram(String StudyProgram) {
		this.StudyProgram = StudyProgram;
	}

	
	public String getGender()
	{
		if (this.isGender()) {
			return "Male";
		} else {
			return "Female";
		}
	}
	
	public void printAll()
	{
		System.out.println(this.Name);
		System.out.println(this.LecturerId);
		if (this.gender) {
			System.out.println("Male");
		} else {
			System.out.println("Female");
		}
		System.out.println(this.Address);
		System.out.println(this.BirthDate);
		System.out.println(this.Faculty);
		System.out.println(this.Departmen);
		System.out.println(this.StudyProgram);
	}
	
	
}
