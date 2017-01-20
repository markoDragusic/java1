/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import dogadjaj.Dogadjaj;
import dogadjaj.Izlozba;
import dogadjaj.Koncert;
import dogadjaj.OstaliDogadjaji;
import dogadjaj.Predavanje;
import dogadjaj.Promocija;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import osoba.Organizator;
import osoba.Predavac;
import osoba.Ucesnik;

/**
 *
 * @author raka
 */
public class ListaDogadjaja implements Serializable{

    private ArrayList<Dogadjaj> dogadjaji;

    
    
    public ListaDogadjaja() {
        dogadjaji = new ArrayList<>();
    }

    public ArrayList<Dogadjaj> getDogadjaji() {
        return dogadjaji;
    }

    public void setDogadjaji(ArrayList<Dogadjaj> dogadjaji) {
        this.dogadjaji = dogadjaji;
    }

    public void napraviDogadjaje() {
       // Date datum = new Date();
        Calendar kalendar = Calendar.getInstance();
        Calendar kalendarr = Calendar.getInstance();
        Calendar kalendar1 = Calendar.getInstance();
        Calendar kalendar11 = Calendar.getInstance();
        Calendar kalendar2 = Calendar.getInstance();
        Calendar kalendar22 = Calendar.getInstance();
        Calendar kalendar3 = Calendar.getInstance();
        Calendar kalendar33 = Calendar.getInstance();
        Calendar kalendar4 = Calendar.getInstance();
        Calendar kalendar44 = Calendar.getInstance();
       
        kalendar.set(2017, 5, 2, 13, 30);
        kalendarr.set(2017, 5, 2, 15, 30);//vrijeme kraja dogadjaja
        kalendar1.set(2017, 5, 2, 16, 00);
        kalendar11.set(2017, 5, 2, 18, 30);//vrijeme kraja dogadjaja
        kalendar2.set(2015, 3, 5, 12, 30);
        kalendar22.set(2015, 3, 5, 13, 45);//vrijeme kraja dogadjaja
        kalendar3.set(2012, 2, 8, 14, 30);
        kalendar33.set(2012, 2, 8, 16, 15);//vrijeme kraja dogadjaja
        kalendar4.set(2014, 10, 11, 9, 0);
        kalendar44.set(2014, 10, 11, 10, 30);//vrijeme kraja dogadjaja
        Predavac predavac1 = new Predavac("Marko", "Dragusic");
        Predavac predavac2 = new Predavac("Dragusa", "Markovic");
        Organizator organizator1 = new Organizator("051111222", "org1@gmail.com", null, "Janko", "Jankovic");
        Organizator organizator2 = new Organizator("051556644", "org2@gmail.com", null, "Nikola", "Jokic");
//        Calendar vrijemePocetak = Calendar.getInstance();
//        Calendar vrijemeKraj = Calendar.getInstance();
//        datum.add(Calendar.DATE, 0);
//        
//        vrijemePocetak.set(10, 10, 2010, 10, 20);
//        vrijemeKraj.set(5, 5, 2015, 15, 35);
//        
//        SimpleDateFormat formatDatum = new SimpleDateFormat("dd.MM.yyyy");
//        SimpleDateFormat formatVrijemePocetak = new SimpleDateFormat("HH:mm");
//        SimpleDateFormat formatVrijemeKraj = new SimpleDateFormat("HH:mm");
//        //System.out.println(datum.getTime());
//// Output "Wed Sep 26 14:23:28 EST 2012"
//        String formatiranDatum = formatDatum.format(datum.getTime());
//        String formatiranVrijemePocetka = formatVrijemePocetak.format(vrijemePocetak.getTime());
//        String formatiranVrijemeKraja = formatVrijemeKraj.format(vrijemeKraj.getTime());
//        System.out.println(formatiranDatum + formatiranVrijemePocetka + formatiranVrijemeKraja);
// Output "2012-09-26"

        Izlozba izlozba1 = new Izlozba("TEMA Likovna izlozba", "Marko Markovic", "Izlozba 1", kalendar2, kalendar22,
                kalendar22, "opis dogadjaja 1", organizator1,
                null, null, "Izlozba"); //organizator, fajl, ucesnici = null
           

        Izlozba izlozba2 = new Izlozba("TEMA Izlozba 2", "Janko Jankovic", "Izlozba 2", kalendar, kalendar,
                kalendarr, "opis dogadjaja 1", organizator1,
                null, null, "Izlozba"); //organizator, fajl, ucesnici = null

        Predavanje predavanje1 = new Predavanje("TEMA predavanja1", predavac1,
                "Sadrzaj predavanja1", "Naziv dogadjaja - predavanje1",
                kalendar, kalendar,
                kalendarr, "opis dogadjaja-predavanje1",
                organizator1, null,
                null, "Predavanje");

        Predavanje predavanje2 = new Predavanje("TEMA predavanja2", predavac2,
                "Sadrzaj predavanja1", "Naziv dogadjaja - predavanje1",
                kalendar1, kalendar1,
                kalendar11, "opis dogadjaja-predavanje1",
                organizator1, null,
                null, "Predavanje");

        OstaliDogadjaji ostaliDogadjaji1 = new OstaliDogadjaji("Naziv ostali dogadjaji1", kalendar3, kalendar3,
                kalendar33, "Opis ostali dogadjaji1", organizator1,
                null, null, "Pstali dogadjaji");
        
        OstaliDogadjaji ostaliDogadjaji2 = new OstaliDogadjaji("Naziv ostali dogadjaji2", kalendar1, kalendar1,
                kalendar11, "Opis ostali dogadjaji2", organizator2,
                null, null, "Ostali dogadjaji");

        Koncert koncert1 = new Koncert("Izvodjac - Latrell Sprewell", kalendar, "Naziv dogadjaja - kocert1", kalendar,
                kalendar, kalendarr, "Opis dogadjaja kalendar 1", organizator2,
                null, null, "Koncert");
        
        Koncert koncert2 = new Koncert("Izvodjac - Panny Hardaway", kalendar, "Naziv dogadjaja - kocert2", kalendar1,
                kalendar1, kalendar11, "Opis dogadjaja kalendar 2", organizator1,
                null, null, "Koncert");

        Promocija promocija1 = new Promocija("proizvod", "kompanija", "naziv dogadjaja Promocija1", kalendar4, kalendar4,
                kalendar44, "opis dogadjaja promocija1", organizator2,
                null, null, "Promocija");

        Promocija promocija2 = new Promocija("proizvod2", "kompanija2", "naziv dogadjaja Promocija2", kalendar2, kalendar2,
                kalendar22, "opis dogadjaja promocija2", organizator1,
                null, null, "Promocija");
        
        Promocija promocija3 = new Promocija("proizvod3", "kompanija3", "naziv dogadjaja Promocija3", kalendar4, kalendar4,
                kalendar44, "opis dogadjaja promocija2", organizator1,
                null, null, "Promocija");
        
        Promocija promocija4 = new Promocija("proizvod4", "kompanija4", "naziv dogadjaja Promocija4", kalendar, kalendar,
                kalendarr, "opis dogadjaja promocija2", organizator1,
                null, null, "Promocija");
        
       
         dogadjaji.add(izlozba1);
        dogadjaji.add(izlozba2);
        dogadjaji.add(ostaliDogadjaji1);
        dogadjaji.add(ostaliDogadjaji2);
        dogadjaji.add(koncert1);
        dogadjaji.add(koncert2);
        dogadjaji.add(izlozba1);
        dogadjaji.add(izlozba2);
        dogadjaji.add(predavanje1);
        dogadjaji.add(predavanje2);
        dogadjaji.add(promocija1);
        dogadjaji.add(promocija2);
        dogadjaji.add(promocija3);
        dogadjaji.add(promocija4);
        
        serijalizacija(dogadjaji); //serijalizujemo napravljenje dogadjaje
        System.out.println("poslije serijalizacije");
        
        for(int i=0; i<dogadjaji.size(); i++)
        System.out.println(dogadjaji.get(i));

    }
    
    public static void serijalizacija(ArrayList<Dogadjaj> kolekcijaKnjiga) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("listaDogadjaja.ser")));
            oos.writeObject(kolekcijaKnjiga);
            System.out.println("zavrsena serijalizacija");
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static ArrayList<Dogadjaj> deSerijalizacija(){
        ArrayList<Dogadjaj> deSerijalizovanaListaDogadjaja = null;
        try {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("listaDogadjaja.ser")));
        deSerijalizovanaListaDogadjaja = (ArrayList<Dogadjaj>) ois.readObject();
        
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return deSerijalizovanaListaDogadjaja;
    }
    
    
    
    public static void main(String[] args){
        ListaDogadjaja listaDogadjaja = new ListaDogadjaja();
        listaDogadjaja.napraviDogadjaje();
    }
}
