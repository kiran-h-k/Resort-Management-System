package in.stay.dto;

import java.time.LocalDateTime;

import in.stay.emuns.Role;
import lombok.Data;
@Data
public class UserDto {
	private int userId;
	
	private String name;
	
	private String email;
	
	private String phoneNumber;
	
	private String password;
	
	private LocalDateTime createdAt;
	
	private Role role;
	
	private String profileImgUrl;
	
	private String profileImgUrlPublicId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getProfileImgUrl() {
		return profileImgUrl;
	}

	public void setProfileImgUrl(String profileImgUrl) {
		this.profileImgUrl = profileImgUrl;
	}

	public String getProfileImgUrlPublicId() {
		return profileImgUrlPublicId;
	}

	public void setProfileImgUrlPublicId(String profileImgUrlPublicId) {
		this.profileImgUrlPublicId = profileImgUrlPublicId;
	}

}
