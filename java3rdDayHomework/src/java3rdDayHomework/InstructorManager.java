package java3rdDayHomework;

public class InstructorManager extends UserManager{
	
	public void addStudent(Student student) {
		System.out.println("Öğrenci eklendi : " + student.getuserName());
	}
}
