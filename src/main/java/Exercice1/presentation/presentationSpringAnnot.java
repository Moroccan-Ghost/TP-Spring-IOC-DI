package Exercice1.presentation;

import Exercice1.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presentationSpringAnnot {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("Exercice1.dao","Exercice1.metier");
        IMetier metier = context.getBean(IMetier.class);

        System.out.println(metier.calcul());
    }
}
