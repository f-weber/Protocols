package POP3;
public class PairInt  {
	int x;
	int y;
	static String sep = " ";
	public PairInt(int p, int q){
		x = p;
		y = q;
	}
	public String toString() {
		String message;
		message = this.x + sep + this.y;
		return message;
	}
	public static PairInt Parse(String message) {
		String[] pieces = message.split(sep);
		return new PairInt(Integer.parseInt(pieces[0]), Integer.parseInt(pieces[1]));
	}
}
