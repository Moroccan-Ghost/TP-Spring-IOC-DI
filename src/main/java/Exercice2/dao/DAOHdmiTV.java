package Exercice2.dao;

import org.springframework.stereotype.Repository;

@Repository("hdmi")
public class DAOHdmiTV implements IDaoHDMI{
    @Override
    public void print(byte[] data) {
        System.out.println(data.toString());
    }
}
