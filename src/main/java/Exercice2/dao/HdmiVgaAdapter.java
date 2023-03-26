package Exercice2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HdmiVgaAdapter implements IDaoVGA{
    @Autowired
    private IDaoHDMI hdmi;


    @Override
    public void print(String message) {
        System.out.println("Adapter");
        byte[] b = message.getBytes();
        hdmi.print(b);
    }

}
