/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osoba;

import java.util.Date;

/**
 *
 * @author raka
 */
class NapomenaOrganizator {
    
    private Date datumKreiranja;
    private String tekstualniSadrzaj;

    public NapomenaOrganizator(Date datumKreiranja, String tekstualniSadrzaj) {
        this.datumKreiranja = datumKreiranja;
        this.tekstualniSadrzaj = tekstualniSadrzaj;
    }

    public Date getDatumKreiranja() {
        return datumKreiranja;
    }

    public void setDatumKreiranja(Date datumKreiranja) {
        this.datumKreiranja = datumKreiranja;
    }

    public String getTekstualniSadrzaj() {
        return tekstualniSadrzaj;
    }

    public void setTekstualniSadrzaj(String tekstualniSadrzaj) {
        this.tekstualniSadrzaj = tekstualniSadrzaj;
    }

   
    
    
    
    
}
