package Exercice2.dao;

import org.springframework.stereotype.Repository;

@Repository("projecteur")
public class DaoVGAProjecteur implements IDaoVGA{

    @Override
    public void print(String message) {
        System.out.println("DAO Projecteur "+message);
    }
}
