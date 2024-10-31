package com.services.ms.student.app.infrastructure.adapters.input.rest.model.response;

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
public class StudentResponse {

  private Long id;
  private String firstname;
  private Integer telephone;
  private String sex;
  private String country;
  private String department;
  private String city;
  private String temperature;
  private String birthdate;

}
