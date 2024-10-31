package com.services.ms.student.app;

import com.services.ms.student.app.infrastructure.adapters.output.persistence.entity.StudentEntity;
import com.services.ms.student.app.infrastructure.adapters.output.persistence.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class StudentServiceApplication implements CommandLineRunner {

	private final StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<StudentEntity> entities = Arrays.asList(
				new StudentEntity(null, "Yeferson Sanchez", 313500654, "Masculino", "Colombia", "Cesar", "Valledupar", "48°C", "02/12/2000"),
				new StudentEntity(null, "Linda Sanchez", 302276252, "Femenino", "Colombia", "Norte Santander", "Cucuta","12°C", "22/06/2002"),
				new StudentEntity(null, "Hernan Sanchez", 304563364, "Masculino", "Colombia", "Cesar", "Valledupar", "48°C", "23/04/1994")
		);
		repository.saveAll(entities);
	}

}
