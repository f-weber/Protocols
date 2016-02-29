package POP3;
public class PairString  {
	String x;
	String y;
	static String sep = " ";
	public PairString(String p, String q){
		x = p;
		y = q;
	}
	public String toString() {
		String message;
		message = this.x + sep + this.y;
		return message;
	}
	public static PairString Parse(String message) {
		String[] pieces = message.split(sep);
		return new PairString(pieces[0], pieces[1]);
	}
}
