package lt.ca.javau12.student_api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lt.ca.javau12.student_api.StudentMapper;
import lt.ca.javau12.student_api.dto.StudentCreateRequest;
import lt.ca.javau12.student_api.dto.StudentResponse;
import lt.ca.javau12.student_api.repositories.StudentRepository;

@Service
public class StudentService {
	
	private final StudentRepository studentRepository;
	private final StudentMapper studentMapper;
	
	public StudentService(StudentRepository studentRepository,StudentMapper studentMapper) {
		this.studentRepository = studentRepository;
		this.studentMapper = studentMapper;
	}
	
	public StudentCreateRequest create() {
		return StudentCreateRequest;
	}
	
	
	public List<StudentResponse>findAll(){
		return studentRepository
				.findAll()
				.stream()
				.map(e -> studentMapper.toDto(e))
				.toList();
		
	}
	
	
	
	


}
