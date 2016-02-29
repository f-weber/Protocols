package POP3;
public class SUMString  {
	String a;
	public SUMString(String y){
		a = y;
	}
	public String toString() {
		String message;
		message = this.a;
		return message;
	}
	public static SUMString Parse(String message) {
		//System.out.println(message + "1");
		//String a = message;
		return new SUMString(message);
	}
}
