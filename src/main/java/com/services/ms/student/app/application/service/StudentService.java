package com.services.ms.student.app.application.service;

import com.services.ms.student.app.application.ports.input.StudentServicePort;
import com.services.ms.student.app.application.ports.output.StudentPersistencePort;
import com.services.ms.student.app.domain.exception.StudentNotFoundException;
import com.services.ms.student.app.domain.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class StudentService implements StudentServicePort {

  private final StudentPersistencePort persistencePort;

  @Override
  public Student findById(Long id) {
    return persistencePort.findById(id)
        .orElseThrow(StudentNotFoundException::new);
  }

  @Override
  public List<Student> findAll() {
    return persistencePort.findAll();
  }

  @Override
  public Student save(Student student) {
    return persistencePort.save(student);
  }

  @Override
  public Student update(Long id, Student student) {
    return persistencePort.findById(id)
        .map(savedStudent -> {
          savedStudent.setFirstname(student.getFirstname());
          savedStudent.setTelephone(student.getTelephone());
          savedStudent.setSex(student.getSex());
          savedStudent.setCountry(student.getCountry());
          savedStudent.setDepartment(student.getDepartment());
          savedStudent.setCity(student.getCity());
          savedStudent.setTemperature(student.getTemperature());
          savedStudent.setBirthdate(student.getBirthdate());
          return persistencePort.save(savedStudent);
        })
        .orElseThrow(StudentNotFoundException::new);
  }

  @Override
  public void deleteById(Long id) {
    if (persistencePort.findById(id).isEmpty()) {
      throw new StudentNotFoundException();
    }

    persistencePort.deleteById(id);
  }
}
