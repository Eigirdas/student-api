package lt.ca.javau12.student_api;

import org.springframework.stereotype.Component;

import lt.ca.javau12.student_api.dto.StudentCreateRequest;
import lt.ca.javau12.student_api.dto.StudentResponse;
import lt.ca.javau12.student_api.entities.Student;

@Component
public class StudentMapper {
	
	public Student toEntity(StudentCreateRequest dto) {
		Student entity = new Student();
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		
		return entity;
	}
	
	public StudentResponse toDto(Student entity) {
		return new StudentResponse(
				entity.getId(),
				entity.getName(),
				entity.getEmail()
				);
	}
	

}
