package Exercice1.metier;

import Exercice1.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImplSpringAnnot implements IMetier{
    /*
    * we can use @Autowired and remove the construct with params
    * But the Annotation will acces directly the var dao without passing throught setter
    * which is bad ( Encapsulation )
    * */
    @Qualifier("dao")
    private IDao dao;

    public MetierImplSpringAnnot(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return dao.getData()*20;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
