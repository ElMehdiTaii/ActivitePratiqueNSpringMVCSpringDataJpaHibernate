package com.example.tp_spring_mvc_thymeleaf;

import com.example.tp_spring_mvc_thymeleaf.entities.Patient;
import com.example.tp_spring_mvc_thymeleaf.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class TpSpringMvcThymeleafApplication implements CommandLineRunner {
    @Autowired
    PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(TpSpringMvcThymeleafApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    patientRepository.save(new Patient(null,"Smail",new Date(),false,300));
    patientRepository.save(new Patient(null,"El Mehdi",new Date(),true,400));
    patientRepository.save(new Patient(null,"Karim",new Date(),false,100));
    }
}
