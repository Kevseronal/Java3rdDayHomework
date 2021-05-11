package java3rdDayHomework;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setNationalId(123456789);
		student1.setFirstName("Melisa");
		student1.setLastName("Doðan");
		student1.setuserName("MelisaDogan");
		student1.setAge("15");
		
		Student student2 = new Student();
		student2.setNationalId(3245254);
		student2.setFirstName("Çaðla");
		student2.setLastName("Melek");
		student2.setuserName("Caglacavusoglu");
		student2.setAge("16");
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setNationalId(23445343);
		instructor1.setFirstName("Fatih");
		instructor1.setLastName("Elmas");
		instructor1.setuserName("Faithelmass");
		instructor1.setAge("35");
		instructor1.setcourse("Java");
		instructor1.setemail("email");
		
		Instructor instructor2 = new Instructor();
		instructor2.setNationalId(3456789);
		instructor2.setFirstName("Ferhat");
		instructor2.setLastName("Türk");
		instructor2.setuserName("Ferhatturk");
		instructor2.setAge("23");
		instructor2.setcourse("Math");
		instructor2.setemail("email");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addInstructor(instructor1);
		studentManager.login(student2);
		studentManager.logout(student2);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addStudent(student1);
		instructorManager.logout(instructor1);
		instructorManager.signUp(instructor2);
		
		
	}

}
