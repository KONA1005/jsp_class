package user;

public class User {
	private String userID;
	private String userPassword;
	private String userName;
	private String userGender;
	
	// 클래스는 속성=property(변수)와 행동(메소드)
	// alt shift s -> get the setter
	// getter 매개변수 없어야 함
	public String getUserID() {
		return userID;
	}
	// setter에는 하나이상의 매개변수가 있어야 함
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	
	
	@Override
	public String toString() {
		return "User [userID=" + userID + ", userPassword=" + userPassword + ", userName=" + userName + ", userGender="
				+ userGender + "]";
	}
	
	
	
	
	
	
}