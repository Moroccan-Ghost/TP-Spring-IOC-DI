package Exercice1.dao;


public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Methode 1");
        return 14;
    }
}
