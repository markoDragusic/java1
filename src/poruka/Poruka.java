/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poruka;

import java.io.Serializable;

/**
 *
 * @author raka
 */
public class Poruka implements Serializable{
    
    public static enum IDPoruke{
        SVI_DOGADJAJI,
        BRISANJE_DOGADJAJA,
        NOVI_UCESNIK,
        NOVI_ORGANIZATOR,
        OK,
        GRESKA
    }
    
    private IDPoruke idPoruke;
    private Object dodatak;

    public Poruka(IDPoruke idPoruke, Object dodatak) {
        this.idPoruke = idPoruke;
        this.dodatak = dodatak;
    }

    public IDPoruke getIdPoruke() {
        return idPoruke;
    }

    public void setIdPoruke(IDPoruke idPoruke) {
        this.idPoruke = idPoruke;
    }

    public Object getDodatak() {
        return dodatak;
    }

    public void setDodatak(Object dodatak) {
        this.dodatak = dodatak;
    }
    
    
}
