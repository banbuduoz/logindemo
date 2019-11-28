package com.company.mapper;

/**
 * @author banbuduo
 * @category 用户实体类
 */
public class Userinfo {

	private int userid;
	private String username;
	private String userpass;
	private String userheadimage;
	private int userrole;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	public String getUserheadimage() {
		return userheadimage;
	}

	public void setUserheadimage(String userheadimage) {
		this.userheadimage = userheadimage;
	}

	public int getUserrole() {
		return userrole;
	}

	public void setUserrole(int userrole) {
		this.userrole = userrole;
	}

	public Userinfo() {
		super();
	}

	public Userinfo(int userid, String username, String userpass, String userheadimage, int userrole) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpass = userpass;
		this.userheadimage = userheadimage;
		this.userrole = userrole;
	}

}
