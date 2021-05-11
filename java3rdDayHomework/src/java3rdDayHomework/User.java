package java3rdDayHomework;

public class User {
	
	private int nationalId;
	private String firstName;
    private String lastName;
    private String userName;
    private String age;
    
    public User() {	
    }
	
	public User(int nationalId, String firstName,String lastName, String userName, String age) {
		this.nationalId = nationalId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.age = age;
	}

	public int getNationalId() {
		return nationalId;
	}

	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	} 
	 
	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
	
	
}
