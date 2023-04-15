import java.util.HashMap;

public class IdandPassword {
	
	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	IdandPassword() {
		
		logininfo.put("Bro", "pizza");
		logininfo.put("Brometheus", "PASSWORD");
		logininfo.put("BroCode", "abc123");
		
	}
	
	protected HashMap getLoginInfo() {
		return logininfo;
	}
	
}
