package in.stay.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class ResortReview {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reviewId;
	
	@Column(nullable = false ,length=700000)
	private String review;

	private Integer rating;
	
	@ManyToOne //many review can be given by one user
	@JoinColumn(name="user_id")//who reviewed
	private Users user;
	
	@ManyToOne//many review can given to one resort
	@JoinColumn(name="resort_id")//for which resort reviewed
	private Resort resort;
	
	private LocalDateTime createdAt;

	public Integer getReviewId() {
		return reviewId;
	}

	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
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

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public ResortReview(Integer reviewId, String review, Integer rating, Users user, Resort resort,
			LocalDateTime createdAt) {
		super();
		this.reviewId = reviewId;
		this.review = review;
		this.rating = rating;
		this.user = user;
		this.resort = resort;
		this.createdAt = createdAt;
	}

	public ResortReview() {
		super();
	}
	
}
