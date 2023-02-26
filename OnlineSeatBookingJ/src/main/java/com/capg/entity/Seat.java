package com.capg.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Seat {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seatId;
	
	private String seatNumber;
	
	private String seatLocation;

	private int seatFloor;

	private int floorCapacity;

	private boolean isBooked;
	
	private int seatsAvailable;
	
	private String emailId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "u_id", referencedColumnName = "uId")
	private User user;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "a_id", referencedColumnName = "aId")
	private Admin admin;

//	public Seat() {
//		super();
//	}
//
//	public Seat(int seatId, String seatNumber, String seatLocation, int seatFloor, int floorCapacity, boolean isBooked,
//			int seatsAvailable, String emailId, User user, Admin admin) {
//		super();
//		this.seatId = seatId;
//		this.seatNumber = seatNumber;
//		this.seatLocation = seatLocation;
//		this.seatFloor = seatFloor;
//		this.floorCapacity = floorCapacity;
//		this.isBooked = isBooked;
//		this.seatsAvailable = seatsAvailable;
//		this.emailId = emailId;
//		this.user = user;
//		this.admin = admin;
//	}
//
//	public int getSeatId() {
//		return seatId;
//	}
//
//	public void setSeatId(int seatId) {
//		this.seatId = seatId;
//	}
//
//	public String getSeatNumber() {
//		return seatNumber;
//	}
//
//	public void setSeatNumber(String seatNumber) {
//		this.seatNumber = seatNumber;
//	}
//
//	public String getSeatLocation() {
//		return seatLocation;
//	}
//
//	public void setSeatLocation(String seatLocation) {
//		this.seatLocation = seatLocation;
//	}
//
//	public int getSeatFloor() {
//		return seatFloor;
//	}
//
//	public void setSeatFloor(int seatFloor) {
//		this.seatFloor = seatFloor;
//	}
//
//	public int getFloorCapacity() {
//		return floorCapacity;
//	}
//
//	public void setFloorCapacity(int floorCapacity) {
//		this.floorCapacity = floorCapacity;
//	}
//
//	public boolean isBooked() {
//		return isBooked;
//	}
//
//	public void setBooked(boolean isBooked) {
//		this.isBooked = isBooked;
//	}
//
//	public int getSeatsAvailable() {
//		return seatsAvailable;
//	}
//
//	public void setSeatsAvailable(int seatsAvailable) {
//		this.seatsAvailable = seatsAvailable;
//	}
//
//	public String getEmailId() {
//		return emailId;
//	}
//
//	public void setEmailId(String emailId) {
//		this.emailId = emailId;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	public Admin getAdmin() {
//		return admin;
//	}
//
//	public void setAdmin(Admin admin) {
//		this.admin = admin;
//	}
//	
//	@Override
//	public String toString() {
//		return "Seat [seatId=" + seatId + ", seatFloor=" + seatFloor + ", floorCapacity=" + floorCapacity
//				+ ", seatLocation=" + seatLocation +  "]";
//	}

}
