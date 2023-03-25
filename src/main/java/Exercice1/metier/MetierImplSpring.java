package Exercice1.metier;

import Exercice1.dao.IDao;

public class MetierImplSpring implements IMetier{

    private IDao dao;
    @Override
    public double calcul() {
        return dao.getData()*10;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
