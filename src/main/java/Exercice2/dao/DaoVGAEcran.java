package Exercice2.dao;


import org.springframework.stereotype.Repository;

@Repository("ecran")
public class DaoVGAEcran implements IDaoVGA{

    @Override
    public void print(String message) {
        System.out.println("DAO Ecran "+message);
    }
}
