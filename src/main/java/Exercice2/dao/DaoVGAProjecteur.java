package Exercice2.dao;

public class DaoVGAProjecteur implements IDaoVGA{

    @Override
    public void print(String message) {
        System.out.println("DAO Projecteur "+message);
    }
}
