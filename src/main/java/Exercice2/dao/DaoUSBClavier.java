package Exercice2.dao;

import org.springframework.stereotype.Repository;

@Repository("clavier")
public class DaoUSBClavier implements IDaoUSB{
    @Override
    public int read() {
        System.out.println("DAO clavier");
        return 20;
    }
}