package java3rdDayHomework;

public class Instructor extends User{
     private String course;
     private String email;
     
     public Instructor() {
     }
     
     public Instructor(String course, String email) {
    	 this.course = course;
    	 this.email = email;
     }
     
     public String getcourse() {
    	 return course;
     }
     public void setcourse(String course) {
    	 this.course = course;
     }
     public String getemail() {
    	 return email;
     }
     public void setemail(String email) {
    	 this.email = email;
     }
}
