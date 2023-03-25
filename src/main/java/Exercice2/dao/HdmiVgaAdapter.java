package Exercice2.dao;

import org.springframework.stereotype.Repository;

public class HdmiVgaAdapter implements IDaoVGA{
    private IDaoHDMI hdmi;

    @Override
    public void print(String message) {
        byte[] b = message.getBytes();
        hdmi.print(b);
    }

    public void setHdmi(IDaoHDMI hdmi) {
        this.hdmi = hdmi;
    }
}
