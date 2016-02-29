package POP3;
class Choice2  {
	public static final int DOT = 1, SUM = 2;
	private final int enumValue;
	public Choice2(int e){
		enumValue = e;
	}
	public Choice2(String enumString){
		int tmp = 0;
		if(enumString.equals("DOT")) {
			tmp = DOT;
		}
		if(enumString.equals("SUM")) {
			tmp = SUM;
		}
		enumValue = tmp;
	}
	public int getEnum() {
		return enumValue;
	}
}
