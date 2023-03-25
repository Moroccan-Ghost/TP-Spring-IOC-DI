package Exercice1.presentation;

import Exercice1.dao.IDao;
import Exercice1.metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class presentationInstanDynamique {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(new File("configInstanDyn.txt"));

        String daoString = scanner.nextLine();
        Class daoClass = Class.forName(daoString);
        IDao dao = (IDao) daoClass.getConstructor().newInstance();

        String metierString = scanner.nextLine();
        Class metierClass = Class.forName(metierString);
        IMetier metier = (IMetier) metierClass.getConstructor().newInstance();

        Method setDao = metierClass.getMethod("setDao",IDao.class);
        setDao.invoke(metier,dao);

        System.out.println(metier.calcul());

    }
}
