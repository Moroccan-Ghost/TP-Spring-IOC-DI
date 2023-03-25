package Exercice2.dao;

public class DaoUSBClavier implements IDaoUSB{
    @Override
    public int read() {
        System.out.println("DAO clavier");
        return 20;
    }
}