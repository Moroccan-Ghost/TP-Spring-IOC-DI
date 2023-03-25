package Exercice2.dao;

public class DAOHdmiTV implements IDaoHDMI{
    @Override
    public void print(byte[] data) {
        System.out.println(data.toString());
    }
}
