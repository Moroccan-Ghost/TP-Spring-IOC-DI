package Exercice2.dao;

public class DaoVGAEcran implements IDaoVGA{

    @Override
    public void print(String message) {
        System.out.println("DAO Ecran "+message);
    }
}
