package in.stay.request;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import in.stay.emuns.PaymentMode;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Data
public class ResortBookRequest {
	@NotNull
	private Long noOfDays;
	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate checkInDate;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate checkOutDate;
	@NotNull
	private Integer numOfPersons;
	@NotNull
	private Integer resortId;
	@NotNull
	private Integer userId;
	@NotBlank
	private String guestName;
	@NotBlank
	private String email;
	@NotBlank
	private String phone;
	@NotNull
	private PaymentMode paymentMode;
	public Long getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(Long noOfDays) {
		this.noOfDays = noOfDays;
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
	public Integer getNumOfPersons() {
		return numOfPersons;
	}
	public void setNumOfPersons(Integer numOfPersons) {
		this.numOfPersons = numOfPersons;
	}
	public Integer getResortId() {
		return resortId;
	}
	public void setResortId(Integer resortId) {
		this.resortId = resortId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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


}
