package Exercice1.dao;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImplSpringAnnot implements IDao{
    @Override
    public double getData() {
        System.out.println("Methode Annotation : ");
        return 20;
    }
}
