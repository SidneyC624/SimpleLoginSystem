import java.util.HashMap;

public class IdandPassword {
	
	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	IdandPassword() {
		
		logininfo.put("Sid", "haruko123");
		logininfo.put("ggez", "GOATED");
		logininfo.put("wrecked", "2+2");
		
	}
	
	protected HashMap getLoginInfo() {
		return logininfo;
	}
	
}
