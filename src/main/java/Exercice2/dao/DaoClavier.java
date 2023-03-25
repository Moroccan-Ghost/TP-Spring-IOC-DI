package Exercice2.dao;

public class DaoClavier implements IDaoUSB{
    @Override
    public int read() {
        System.out.println("DAO clavier");
        return 20;
    }
}