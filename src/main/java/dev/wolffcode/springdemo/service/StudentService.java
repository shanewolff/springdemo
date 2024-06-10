package dev.wolffcode.springdemo.service;

import dev.wolffcode.springdemo.persistance.entity.StudentEntity;
import dev.wolffcode.springdemo.persistance.repository.StudentRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
  private final StudentRepository studentRepository;

  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public List<StudentEntity> fetchAllStudents() {
    return studentRepository.findAll();
  }

  public void createStudent(StudentEntity studentEntity) {
    studentRepository.save(studentEntity);
  }
}
