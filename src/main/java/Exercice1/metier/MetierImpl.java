package Exercice1.metier;

import Exercice1.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;
    @Override
    public double calcul() {
        return dao.getData()*100;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
