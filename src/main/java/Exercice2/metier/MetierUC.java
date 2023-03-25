package Exercice2.metier;

import Exercice2.dao.IDaoUSB;
import Exercice2.dao.IDaoVGA;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("UC")
public class MetierUC implements IMetierUC{


    private IDaoUSB usb;

    private IDaoVGA vga;

    /*If we are using construct we must put the Quelifier in params not before the vars declaration*/
    public MetierUC(@Qualifier("clavier") IDaoUSB usb, @Qualifier("projecteur") IDaoVGA vga) {
        this.usb = usb;
        this.vga = vga;
    }

    @Override
    public int readData() {
        return usb.read();
    }

    @Override
    public void printData(String message) {
        vga.print(message);
    }
}
