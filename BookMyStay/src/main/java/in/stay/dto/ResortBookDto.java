package in.stay.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import in.stay.emuns.Status;
import in.stay.entity.Resort;
import in.stay.entity.ResortReview;
import in.stay.entity.Users;
import lombok.Data;
@Data
public class ResortBookDto {
	private Integer bookingId;
	private Status status;
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	private Long noOfDays;
	private LocalDateTime bookedAt;	
	private Integer numOfPersons;
	private double totalAmount;	
	private ResortReview review;
	private Users user;
	private Resort resort;
	private String guestName;
	private String email;
	private String phone;
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public LocalDate getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}
	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public Long getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(Long noOfDays) {
		this.noOfDays = noOfDays;
	}
	public LocalDateTime getBookedAt() {
		return bookedAt;
	}
	public void setBookedAt(LocalDateTime bookedAt) {
		this.bookedAt = bookedAt;
	}
	public Integer getNumOfPersons() {
		return numOfPersons;
	}
	public void setNumOfPersons(Integer numOfPersons) {
		this.numOfPersons = numOfPersons;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public ResortReview getReview() {
		return review;
	}
	public void setReview(ResortReview review) {
		this.review = review;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Resort getResort() {
		return resort;
	}
	public void setResort(Resort resort) {
		this.resort = resort;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
