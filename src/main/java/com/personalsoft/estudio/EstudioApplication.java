package com.personalsoft.estudio;

import com.personalsoft.estudio.ejercicios.ChemicalFormulaParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstudioApplication {

	static String formula3 = "K4[ON(SO3)2]2";

	public static void main(String[] args) {
		SpringApplication.run(EstudioApplication.class, args);

		System.out.println(ChemicalFormulaParser.countAtoms(formula3));
	}

}
