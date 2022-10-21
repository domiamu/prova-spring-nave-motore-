package it.domenico.spring;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import it.domenico.Motore;
import it.domenico.Nave;

@Configuration
@ComponentScan(basePackageClasses = Nave.class)


public class Config {
    @Bean
    public Motore getNave() {
    	
    	String alimentazione;
    	int cilindrata;
    	
    	Scanner input= new Scanner(System.in);
    	
    	System.out.println("inserisci tipo di alimentazione");
    	alimentazione= input.nextLine();
    	
    	System.out.println("inserisci la cilindrata");
    	cilindrata=input.nextInt();
    	input.close();
    	
    	
        return new Motore(alimentazione, cilindrata);
    }
}