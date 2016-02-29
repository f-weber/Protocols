package POP3;
public class SUMIntString  {
	int x;
	String y;
	static String sep = " ";
	public SUMIntString(int p, String q){
		x = p;
		y = q;
	}
	public String toString() {
		String message;
		message = this.x + sep + this.y;
		return message;
	}
	public static SUMIntString Parse(String message) {
		//System.out.println("Test SIS");
		//String substring = message.substring(3, message.length());
		//String[] pieces = substring.split(sep);
		String[] pieces = message.split(sep);
		return new SUMIntString(Integer.parseInt(pieces[0]), pieces[1]);
	}
}
