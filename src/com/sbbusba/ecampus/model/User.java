package com.sbbusba.ecampus.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "users")
public class User implements Serializable {

	private static final long serialVersionUID = 5362437768854142524L;

	@Id
	@Column(name = "user_id")
	private int user_id;

	@NotBlank(message = "Username cannot be blank.")
	@Size(min = 5, max = 15, message = "Username must be between 8 and 15 characters long.")
	@Pattern(regexp = "^\\w{8,}$", message = "Username can only consist of numbers, letters and the underscore character.")
	@Column(name = "username")
	private String username;

	@Column(name = "name")
	private String name;

	@NotBlank(message = "Username cannot be blank.")
	@Column(name = "password")
	private String password;
	private String rollnumber;
	private String mobile;

	private String image;
	private int enabled;

	private String authority;

	public User() {
	}

	public User(int user_id, String username, String name, String password,
			String rollnumber, String mobile, String image, int enabled,
			String authority) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.name = name;
		this.password = password;
		this.rollnumber = rollnumber;
		this.mobile = mobile;
		this.image = image;
		this.enabled = enabled;
		this.authority = authority;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username
				+ ", name=" + name + ", password=" + password + ", rollnumber="
				+ rollnumber + ", mobile=" + mobile + ", image=" + image
				+ ", enabled=" + enabled + ", authority=" + authority + "]";
	}

}
