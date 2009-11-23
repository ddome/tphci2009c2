package utils;

public class LanguageSession {
	static private Language actual;
	
	public LanguageSession(Language nuevo){
		actual = nuevo;
	}
	
	static public int getActualLangugeId() {
		return Integer.valueOf(actual.id);
	}

	static public String getActualLangugeName() {
		return actual.name;
	}
}
