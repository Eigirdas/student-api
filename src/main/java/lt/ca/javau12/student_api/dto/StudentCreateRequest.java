package lt.ca.javau12.student_api.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class StudentCreateRequest {
	
	@NotNull(message = "Name must not be null")
	@Size(max = 100, message = "Name must be less than or equal to 100 characters")
	private String name;
	
	@NotNull(message = "Email must not be null")
	@Size(max = 160, message = "Email must be less than or equal to 160 characters")
	@Email(message = "Email must be valid")
	@Column(unique = true)
	private String email;

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
	
	
	

}
