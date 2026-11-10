package in.stay.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AddReviewRequest {
	@NotNull
	private Integer userId;
	
	@NotNull
	private Integer resortId;
	
	@NotBlank
	private String review;
	
	@NotNull
	@Min(1)
	@Max(5)
	private Integer rating;
	
	@NotNull
	private Integer bookingId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getResortId() {
		return resortId;
	}

	public void setResortId(Integer resortId) {
		this.resortId = resortId;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
    
}
