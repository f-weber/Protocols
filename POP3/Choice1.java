package POP3;
class Choice1  {
	public static final int OK = 1, ERR = 2;
	private final int enumValue;
	public Choice1(int e){
		enumValue = e;
	}
	public Choice1(String enumString){
		int tmp = 0;
		if(enumString.equals("OK")) {
			tmp = OK;
		}
		if(enumString.equals("ERR")) {
			tmp = ERR;
		}
		enumValue = tmp;
	}
	public int getEnum() {
		return enumValue;
	}
}
