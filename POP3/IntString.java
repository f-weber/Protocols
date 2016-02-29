package POP3;
public class IntString  {
	int x;
	String y;
	static String sep = " ";
	public IntString(int p, String q){
		x = p;
		y = q;
	}
	public String toString() {
		String message;
		message = "OK " + this.x + sep + this.y;
		return message;
	}
	public static IntString Parse(String message) {
		String substring = message.substring(4, message.length());
		String[] pieces = substring.split(sep);
		return new IntString(Integer.parseInt(pieces[0]), pieces[1]);
	}
}
