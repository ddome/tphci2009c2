package utils;

public interface Constants {
	int passwordLengthMin=8;
	int passwordLengthMax=15;
	String passwordRegExp="^([0-9a-zA-Z])+$";
	
	int usernameLengthMin=1;
	int usernameLengthMax=15;
	String usernameRegExp="^([0-9a-zA-Z_-])+$";
	
	int nameLengthMin=1;
	int nameLengthMax=80;
	String nameRegExp="^([0-9a-zA-Z·ÈÌ˙Û¡…Õ”⁄])+$";
	
	int emailLengthMin=1;
	int emailLengthMax=128;
	String emailRegExp="^([0-9a-zA-Z])+@([0-9a-zA-Z])+.([0-9a-zA-Z])+[.([0-9a-zA-Z])+]*$";
}
