package id.co.nds.webapp.user;

import java.sql.Timestamp;

import id.co.nds.beans.BasicUser;

public class User extends BasicUser {
	
	private String groupName;
	private String actionType;
	private String captcha;
	private Timestamp lastFailedPassword;
	private Integer failedPasswordCounter;
	private Timestamp verifyDate;
	

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}
	

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public User()
	{
		
	}
	
	public User(String userId, String recStatus)
	{
		setUserId(userId);
		setRecStatus(recStatus);
	}


	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Timestamp getLastFailedPassword() {
		return lastFailedPassword;
	}

	public void setLastFailedPassword(Timestamp lastFailedPassword) {
		this.lastFailedPassword = lastFailedPassword;
	}

	public Integer getFailedPasswordCounter() {
		return failedPasswordCounter;
	}

	public void setFailedPasswordCounter(Integer failedPasswordCounter) {
		this.failedPasswordCounter = failedPasswordCounter;
	}

	public Timestamp getVerifyDate() {
		return verifyDate;
	}

	public void setVerifyDate(Timestamp verifyDate) {
		this.verifyDate = verifyDate;
	}
	

	
}
