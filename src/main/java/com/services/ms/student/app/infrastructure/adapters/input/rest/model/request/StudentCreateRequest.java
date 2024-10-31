package com.services.ms.student.app.infrastructure.adapters.input.rest.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentCreateRequest {

  @NotBlank(message = "Field name cannot be empty or null.")
  private String firstname;

  @NotNull(message = "Field telephone cannot be null.")
  private Integer telephone;

  @NotBlank(message = "Field sex cannot be empty or null.")
  private String sex;

  @NotBlank(message = "Field country cannot be empty or null.")
  private String country;

  @NotBlank(message = "Field departament cannot be null")
  private String department;

  @NotBlank(message = "Field city cannot be null")
  private String city;

  @NotBlank(message = "Field temperature cannot be null")
  private String temperature;

  @NotBlank(message = "Field birthdate cannot be null")
  private String birthdate;
}
