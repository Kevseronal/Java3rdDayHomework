package java3rdDayHomework;

public class UserManager {
	
	public void signUp(User user) {
		System.out.println("Kay�t olundu : " + user.getuserName());
	}
	
	public void login(User user) {
		System.out.println("Giri� yap�ld� : " + user.getuserName());
	}
	
	public void logout(User user) {
		System.out.println("��k�� yap�ld� : " + user.getuserName());
	}
}
