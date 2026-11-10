package in.stay.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
@Entity
@Data
public class Resort {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int resortId;
	
	private String name; 
	private String location;
	private String description;
	
	private String resortImgUrl;
	private String resortImgUrlPublicId;
	
	@ManyToOne//many Resorts can belongs to one RESORT_OWNER
	@JoinColumn(name="owner_id")
	private Users user;
	
	@CreatedDate
	private LocalDateTime createdDate;
	
	private Integer amount;
	
	private List<String> facilities;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resort")//one resort can hv many reviews
	private List<ResortReview> review;

	public int getResortId() {
		return resortId;
	}

	public void setResortId(int resortId) {
		this.resortId = resortId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResortImgUrl() {
		return resortImgUrl;
	}

	public void setResortImgUrl(String resortImgUrl) {
		this.resortImgUrl = resortImgUrl;
	}

	public String getResortImgUrlPublicId() {
		return resortImgUrlPublicId;
	}

	public void setResortImgUrlPublicId(String resortImgUrlPublicId) {
		this.resortImgUrlPublicId = resortImgUrlPublicId;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public List<String> getFacilities() {
		return facilities;
	}

	public void setFacilities(List<String> facilities) {
		this.facilities = facilities;
	}

	public List<ResortReview> getReview() {
		return review;
	}

	public void setReview(List<ResortReview> review) {
		this.review = review;
	}

	public Resort(int resortId, String name, String location, String description, String resortImgUrl,
			String resortImgUrlPublicId, Users user, LocalDateTime createdDate, Integer amount, List<String> facilities,
			List<ResortReview> review) {
		super();
		this.resortId = resortId;
		this.name = name;
		this.location = location;
		this.description = description;
		this.resortImgUrl = resortImgUrl;
		this.resortImgUrlPublicId = resortImgUrlPublicId;
		this.user = user;
		this.createdDate = createdDate;
		this.amount = amount;
		this.facilities = facilities;
		this.review = review;
	}

	public Resort() {
		super();
	}
	
}
