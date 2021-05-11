package java3rdDayHomework;

public class UserManager {
	
	public void signUp(User user) {
		System.out.println("Kayýt olundu : " + user.getuserName());
	}
	
	public void login(User user) {
		System.out.println("Giriþ yapýldý : " + user.getuserName());
	}
	
	public void logout(User user) {
		System.out.println("Çýkýþ yapýldý : " + user.getuserName());
	}
}
