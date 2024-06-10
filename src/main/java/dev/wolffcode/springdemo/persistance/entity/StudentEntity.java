package dev.wolffcode.springdemo.persistance.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.wolffcode.springdemo.common.Gender;
import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "student")
public class StudentEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @JsonIgnore
  Long id;

  @Column(name = "first_name")
  String firstName;

  @Column(name = "last_name")
  String lastName;

  @Column(name = "date_of_birth")
  LocalDate dateOfBirth;

  @Enumerated(EnumType.STRING)
  Gender gender;
}
