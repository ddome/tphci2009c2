package utils;

public interface Constants {
	int passwordLengthMin=8;
	int passwordLengthMax=15;
	String passwordRegExp="^([0-9a-zA-Z])+$";
	int usernameLengthMin=1;
	int usernameLengthMax=15;
	String usernameRegExp="^([0-9a-zA-Z_-])+$";
}
