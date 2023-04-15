
public class Main {

	public static void main(String[] args) {
		
		IdandPassword idandPassword = new IdandPassword();
		
		LoginPage loginPage = new LoginPage(idandPassword.getLoginInfo());

	}

}
