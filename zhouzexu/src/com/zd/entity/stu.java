package com.zd.entity;

public class stu {

	public stu() {
		super();
	}
	public stu(int sid, String sname, String ssex, int sage, String stel) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.ssex = ssex;
		this.sage = sage;
		this.stel = stel;
	}
	private int sid;
	private String sname;
	private String ssex;
	private int sage;
	private String stel;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getStel() {
		return stel;
	}
	public void setStel(String stel) {
		this.stel = stel;
	}
	@Override
	public String toString() {
		return "stu [sage=" + sage + ", sid=" + sid + ", sname=" + sname
				+ ", ssex=" + ssex + ", stel=" + stel + "]";
	}
	
}
