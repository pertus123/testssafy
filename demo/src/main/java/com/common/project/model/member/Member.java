package com.common.project.model.member;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Member {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long uid;
	private String email;
	private String password;
	private String name;
	private String introduce;
	private String profileimage;
	private String create_date;
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(Long uid, String email, String password, String name, String introduce, String profileimage,
			String create_date) {
		super();
		this.uid = uid;
		this.email = email;
		this.password = password;
		this.name = name;
		this.introduce = introduce;
		this.profileimage = profileimage;
		this.create_date = create_date;
	}
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getProfileImage() {
		return profileimage;
	}
	public void setProfileImage(String profileImage) {
		this.profileimage = profileimage;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	
}
