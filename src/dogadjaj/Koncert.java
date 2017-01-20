/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogadjaj;

import osoba.Organizator;
import osoba.Ucesnik;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author raka
 */
public class Koncert extends Dogadjaj{
        
    private String izvodjacKoncert;
    private Calendar trajanjeKoncerta;
  

    
    
    public Koncert() {
    }

    
    public Koncert(String izvodjacKoncert, Calendar trajanjeKoncerta, String nazivDogadjaja, Calendar datumPocetkaDogadjaja, Calendar vrijemePocetkaDogadjaja, Calendar vrijemeKrajaDogadjaja, String opisDogadjaja, Organizator organizatorDogadjaja, File fajlUzDogadjaj, ArrayList<Ucesnik> ucesniciDogadjaja, String vrstaDogadjaja) {
        super(nazivDogadjaja, datumPocetkaDogadjaja, vrijemePocetkaDogadjaja, vrijemeKrajaDogadjaja, opisDogadjaja, organizatorDogadjaja, fajlUzDogadjaj, ucesniciDogadjaja, vrstaDogadjaja);
        this.izvodjacKoncert = izvodjacKoncert;
        this.trajanjeKoncerta = trajanjeKoncerta;
        
    }

  

    public String getIzvodjacKoncert() {
        return izvodjacKoncert;
    }

    public void setIzvodjacKoncert(String izvodjacKoncert) {
        this.izvodjacKoncert = izvodjacKoncert;
    }

    public Calendar getTrajanjeKoncerta() {
        return trajanjeKoncerta;
    }

    public void setTrajanjeKoncerta(Calendar trajanjeKoncerta) {
        this.trajanjeKoncerta = trajanjeKoncerta;
    }

   
    
    
}
