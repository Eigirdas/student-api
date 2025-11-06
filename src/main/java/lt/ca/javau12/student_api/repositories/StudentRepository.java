package lt.ca.javau12.student_api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.ca.javau12.student_api.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{
	boolean existsByEmail(String email);
	Optional<Student> findByEmail(String email);

}
