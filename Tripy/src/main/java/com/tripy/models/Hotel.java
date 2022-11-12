package com.tripy.models;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer hotelId;
	private String hotelName;
	private String hotelType;
	private String hotelDesciption;
	private String address;
	private Double rent;
	private String statu;
	
	
	
	
	
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Hotel(Integer hotelId, String hotelName, String hotelType, String hotelDesciption, String address,
			Double rent, String statu) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelType = hotelType;
		this.hotelDesciption = hotelDesciption;
		this.address = address;
		this.rent = rent;
		this.statu = statu;
	}





	public Integer getHotelId() {
		return hotelId;
	}


	public String getHotelName() {
		return hotelName;
	}





	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}





	public String getHotelType() {
		return hotelType;
	}





	public void setHotelType(String hotelType) {
		this.hotelType = hotelType;
	}





	public String getHotelDesciption() {
		return hotelDesciption;
	}





	public void setHotelDesciption(String hotelDesciption) {
		this.hotelDesciption = hotelDesciption;
	}





	public String getAddress() {
		return address;
	}





	public void setAddress(String address) {
		this.address = address;
	}





	public Double getRent() {
		return rent;
	}





	public void setRent(Double rent) {
		this.rent = rent;
	}





	public String getStatu() {
		return statu;
	}





	public void setStatu(String statu) {
		this.statu = statu;
	}





	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelType=" + hotelType
				+ ", hotelDesciption=" + hotelDesciption + ", address=" + address + ", rent=" + rent + ", statu="
				+ statu + "]";
	}

	
  
	
	
	
}
