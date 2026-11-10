package in.stay.request;

import java.time.LocalDate;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AddOfferRequest {
	@NotNull
	private Integer resortId;
	@NotBlank
    private String title;
	@NotBlank
    private String description;
	@NotNull
    private Double discountPercentage;
	@NotNull
    private LocalDate startDate;
	@NotNull
    private LocalDate endDate;
	public Integer getResortId() {
		return resortId;
	}
	public void setResortId(Integer resortId) {
		this.resortId = resortId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(Double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

}
