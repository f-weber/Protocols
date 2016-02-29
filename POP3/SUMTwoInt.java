package POP3;
public class SUMTwoInt  {
	int x;
	int y;
	static String sep = " ";
	public SUMTwoInt(int p, int q){
		x = p;
		y = q;
	}
	public String toString() {
		String message;
		message = this.x + sep + this.y;
		return message;
	}
	public static SUMTwoInt Parse(String message) {
		
		PairInt r = PairInt.Parse(message);
		
		return new SUMTwoInt((r.x), (r.y));
	}
}
