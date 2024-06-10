package dev.wolffcode.springdemo.dto;

import dev.wolffcode.springdemo.common.Gender;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.Period;

public record Student(
    @NotBlank String firstName,
    @NotBlank String lastName,
    LocalDate dateOfBirth,
    @NotNull Gender gender) {
  Integer getAge() {
    return Period.between(dateOfBirth, LocalDate.now()).getYears();
  }
}
