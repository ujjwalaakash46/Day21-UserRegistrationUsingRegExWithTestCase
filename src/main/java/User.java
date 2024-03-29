
public class User {

	public static void main(String[] args) {
	}

	public boolean checkFirstName(String s) {
		return s.matches("[A-Z][A-Za-z]{2,}");
	}

	public boolean checkLastName(String s) {
		return s.matches("[A-Z][A-Za-z]{2,}");
	}

	public boolean checkEmail(String s) {
		return s.matches("[A-Za-z][A-Za-z0-9.-_]*[@][a-z]+[.][a-z]{2,3}.[a-z]{2,3}");
	}

	public boolean checkPhone(String s) {
		return s.matches("[0-9]{2,3}[ ][0-9]{10}");
	}

	public boolean checkPassword(String s) {
		return s.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}");
	}
}