package Exercice2.presentation;

import Exercice2.metier.IMetierUC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presentationSpring {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("Exercice2.dao","Exercice2.metier");
        IMetierUC uc = context.getBean(IMetierUC.class);

        uc.printData("Salam");
        System.out.println(uc.readData());
    }
}
