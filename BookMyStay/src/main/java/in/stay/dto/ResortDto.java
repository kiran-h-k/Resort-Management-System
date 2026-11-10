package in.stay.dto;

import java.time.LocalDateTime;
import java.util.List;
import in.stay.entity.ResortReview;
import in.stay.entity.Users;
import lombok.Data;
@Data
public class ResortDto {
	private int resortId;
	private String name; 
	private String location;
	private String description;
	private String resortImgUrl;
	private String resortImgUrlPublicId;
	private Users user;
	private LocalDateTime createdDate;
	private Integer amount;
	private List<String> facilities;
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
	
}
