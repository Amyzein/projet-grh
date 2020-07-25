package org.sid.projetgrh;


import org.sid.projetgrh.dao.EmployeRepository;
import org.sid.projetgrh.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;



@SpringBootApplication
public class Main implements CommandLineRunner {
    @Autowired

    private EmployeRepository EmployeRepository;


    @Autowired
    private RepositoryRestConfiguration restConfiguration;
    public static void main(String[] args) {
        SpringApplication.run(ProjetGrhApplication.class, args);
    }


        EmployeRepository.findAll().forEach(p->{System.out.println((p.toString()));});

}
