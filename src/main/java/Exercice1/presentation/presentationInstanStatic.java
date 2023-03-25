package Exercice1.presentation;

import Exercice1.dao.DaoImpl;
import Exercice1.dao.IDao;
import Exercice1.metier.IMetier;
import Exercice1.metier.MetierImpl;

public class presentationInstanStatic {
    public static void main(String[] args) {
        MetierImpl metier = new MetierImpl();
        DaoImpl dao = new DaoImpl();

        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
