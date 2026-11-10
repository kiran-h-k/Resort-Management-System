package in.stay.entity;

import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import in.stay.emuns.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	private String name;
	
	@Column(unique = true)
	private String email;
	
	private String phoneNumber;
	
	private String password;
	
	@CreatedDate
	private LocalDateTime createdAt;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	private String profileImgUrl;
	
	private String profileImgUrlPublicId;

	public Users(int userId, String name, String email, String phoneNumber, String password, LocalDateTime createdAt,
			Role role, String profileImgUrl, String profileImgUrlPublicId) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.createdAt = createdAt;
		this.role = role;
		this.profileImgUrl = profileImgUrl;
		this.profileImgUrlPublicId = profileImgUrlPublicId;
	}

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

	public Users() {
		super();
	}
	
}

