package Exercice2.dao;

public class DaoUSBSouris implements IDaoUSB{
    @Override
    public int read() {
        System.out.println("DAO Souris");
        return 10;
    }
}
