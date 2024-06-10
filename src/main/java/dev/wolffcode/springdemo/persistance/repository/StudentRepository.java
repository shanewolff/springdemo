package dev.wolffcode.springdemo.persistance.repository;

import dev.wolffcode.springdemo.persistance.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {}
