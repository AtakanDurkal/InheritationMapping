package com.example.jpainheritjoininfantryexample;

import com.example.jpainheritjoininfantryexample.model.Archer;
import com.example.jpainheritjoininfantryexample.model.Infantry;
import com.example.jpainheritjoininfantryexample.model.InfantryType;
import com.example.jpainheritjoininfantryexample.model.Knight;
import com.example.jpainheritjoininfantryexample.repo.ArcherRepository;
import com.example.jpainheritjoininfantryexample.repo.InfantryRepository;
import com.example.jpainheritjoininfantryexample.repo.KnightRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaInheritJoinInfantryExampleApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(JpaInheritJoinInfantryExampleApplication.class, args);
		InfantryRepository archerRepository =
				configurableApplicationContext.getBean(ArcherRepository.class);
		InfantryRepository knightRepository =
				configurableApplicationContext.getBean(KnightRepository.class);

		Infantry archer_1 = new Archer(InfantryType.LIGHT, 300, 500, 100, 1000);
		Infantry knight_1 = new Knight(InfantryType.HEAVY, 280, 1000, 300, true);
		Infantry archer_2 = new Archer(InfantryType.LIGHT, 300, 500, 100, 1000);
		Infantry knight_2 = new Knight(InfantryType.HEAVY, 280, 1000, 300, true);

		archerRepository.save(archer_1);
		archerRepository.save(archer_2);
		knightRepository.save(knight_1);
		knightRepository.save(knight_2);

		knightRepository.delete(knight_1);

	}



}
