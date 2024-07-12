package com.am.Bean;

public class StudentBean {
	private String sname;
	private String sid;
	private String smail;
	private int snum;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSmail() {
		return smail;
	}

	public void setSmail(String smail) {
		this.smail = smail;
	}

	public int getSnum() {
		return snum;
	}

	public void setSnum(int snum) {
		this.snum = snum;
	}

	@Override
	public String toString() {
		return "StudentBean [sname=" + sname + ", sid=" + sid + ", smail=" + smail + ", snum=" + snum + "]";
	}
}
