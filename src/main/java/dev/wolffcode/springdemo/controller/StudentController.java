package dev.wolffcode.springdemo.controller;

import dev.wolffcode.springdemo.persistance.entity.StudentEntity;
import dev.wolffcode.springdemo.service.StudentService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
  private final StudentService studentService;

  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("")
  public List<StudentEntity> getStudents() {
    return studentService.fetchAllStudents();
  }

  @PostMapping("")
  @ResponseStatus(HttpStatus.CREATED)
  public void createStudent(@RequestBody StudentEntity studentEntity) {
    studentService.createStudent(studentEntity);
  }
}
