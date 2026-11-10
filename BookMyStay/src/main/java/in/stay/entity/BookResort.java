package in.stay.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import in.stay.emuns.PaymentMode;
import in.stay.emuns.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Data
@Entity
public class BookResort {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookingId;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	private Long noOfDays;
	private LocalDateTime bookedAt;
	
	private Integer numOfPersons;
	private double totalAmount;
	
	@OneToOne
	@JoinColumn(name="reviewId")
	private ResortReview review;//once the status become completed

	@ManyToOne  //many users can book same resort
	@JoinColumn(name="userId")//who booked
	private Users user;
	
	@ManyToOne //many orders for one resort
	@JoinColumn(name="resortId")//which resort booked
	private Resort resort;
	
	private String guestName;
	private String email;
	private String phone;
	@Enumerated(EnumType.STRING)
	private PaymentMode paymentMode;
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
	public PaymentMode getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}
	public BookResort(Integer bookingId, Status status, LocalDate checkInDate, LocalDate checkOutDate, Long noOfDays,
			LocalDateTime bookedAt, Integer numOfPersons, double totalAmount, ResortReview review, Users user,
			Resort resort, String guestName, String email, String phone, PaymentMode paymentMode) {
		super();
		this.bookingId = bookingId;
		this.status = status;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.noOfDays = noOfDays;
		this.bookedAt = bookedAt;
		this.numOfPersons = numOfPersons;
		this.totalAmount = totalAmount;
		this.review = review;
		this.user = user;
		this.resort = resort;
		this.guestName = guestName;
		this.email = email;
		this.phone = phone;
		this.paymentMode = paymentMode;
	}
	public BookResort() {
		super();
	}

}
