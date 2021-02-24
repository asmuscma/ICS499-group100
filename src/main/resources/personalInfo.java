package data.entity;
import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personalInfo")

public class personalInfo {
	
	@Id
	@Column(name="personalInfoID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long personalInfoID;
	@Column(name="fName")
	private String fName;
	@Column(name="lName")
	private String lname;
	@Column(name="address")
	private String address;
	@Column(name="DOB")
	private Date dob;
	@Column(name="SSN")
	private int SSN;
	@Column(name="phoneNum")
	private int phoneNum;
	public long getPersonalInfoID() {
		return personalInfoID;
	}
	public void setPersonalInfoID(long personalInfoID) {
		this.personalInfoID = personalInfoID;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
	
	
	

}
