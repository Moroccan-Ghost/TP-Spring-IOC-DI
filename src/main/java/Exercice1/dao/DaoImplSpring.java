package Exercice1.dao;

public class DaoImplSpring implements IDao{

    @Override
    public double getData() {
        System.out.println("Methode Spring : ");
        return 50;
    }
}
