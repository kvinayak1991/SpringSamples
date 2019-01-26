package com.vin.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "USER_DETAILS")
public class UserExtraDetails implements Serializable {

	@Column(name = "Address", nullable = true)
	private String Address;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "City", nullable = true)
	private String City;

	@Column(name = "Country", nullable = true)
	private String Country;

	@Column(name = "Postal_Code", nullable = true)
	private String Postal_Code;

	@Column(name = "About_Me", nullable = true)
	private String About_Me;
	
	@Column(name = "profile_pic", nullable = true)
	private String profile_pic;
	
	@Column(name = "profile_background_pic", nullable = true)
	private String profile_background_pic;
	
	@OneToOne(cascade=CascadeType.ALL)
	private User user;
	
	public String getProfile_background_pic() {
		return profile_background_pic;
	}

	public void setProfile_background_pic(String profile_background_pic) {
		this.profile_background_pic = profile_background_pic;
	}

	public String getProfile_pic() {
		return profile_pic;
	}

	public void setProfile_pic(String profile_pic) {
		this.profile_pic = profile_pic;
	}

	

	public String getAbout_me() {
		return About_Me;
	}

	public void setAbout_me(String about_me) {
		this.About_Me = about_me;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getPostal_Code() {
		return Postal_Code;
	}

	public void setPostal_Code(String postal_Code) {
		Postal_Code = postal_Code;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "UserExtraDetails [Address=" + Address + ", id=" + id + ", City=" + City + ", Country=" + Country
				+ ", Postal_Code=" + Postal_Code + ", About_Me=" + About_Me + ", user=" + user + "]";
	}

	

}
