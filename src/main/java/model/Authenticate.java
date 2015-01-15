package model;

public class Authenticate {
	public boolean auth(String un, String pw) {
		boolean validity;
		if(un.equals("admin") && pw.equals("admin")) {
			validity = true;
		} else {
			validity = false;
		}
		return validity;
	}
}
