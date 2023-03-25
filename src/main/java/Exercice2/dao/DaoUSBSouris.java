package Exercice2.dao;

import org.springframework.stereotype.Repository;

@Repository("Souris")
public class DaoUSBSouris implements IDaoUSB{
    @Override
    public int read() {
        System.out.println("DAO Souris");
        return 10;
    }
}
