package Exercice2.dao;

import org.springframework.stereotype.Repository;

@Repository("tv")
public class DAOHdmiTV extends HdmiVgaAdapter implements IDaoHDMI {
    @Override
    public void print(byte[] data) {
        System.out.println(data.toString());
    }

}
