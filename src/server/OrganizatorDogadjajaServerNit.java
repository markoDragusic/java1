/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import dogadjaj.Dogadjaj;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import osoba.Osoba;
import poruka.Poruka;

/**
 *
 * @author raka
 */
class OrganizatorDogadjajaServerNit extends Thread {

    private Socket soket;
    private static ObjectInputStream ois;
    private static ObjectOutputStream oos;
    private static ListaDogadjaja ListaDogadjaja;
    private static ArrayList<Dogadjaj> sviDogadjaji;
    private static ArrayList<Osoba> osobe;
      int nitbr = OrganizatorDogadjajaServer.nitbr++;

    public OrganizatorDogadjajaServerNit(Socket soket) {
        try {
            nitbr = OrganizatorDogadjajaServer.nitbr++;
            this.soket = soket;
            ois = new ObjectInputStream(soket.getInputStream());
            oos = new ObjectOutputStream(soket.getOutputStream());
            //sviDogadjaji = OrganizatorDogadjajaServer.getSviDogadjaji();
            start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void run() {

        try {
            //  String prijemPoruke = (String) ois.readObject();
            //  System.out.println(prijemPoruke);
            //  String izlaz1 = "poruka klijentu";
            //  oos.writeObject(izlaz1);
            int brojacRada = 0;
            while (true) {
                System.out.println("nit " + nitbr + ", " + brojacRada);
                                   System.out.println("PORUKA prije read object" + ", nit " + nitbr);

                                   Object prijem = ois.readObject();
                                   System.out.println("Nit "+ nitbr+ ", tip objekta: "+prijem.getClass().getName());
                                   if(prijem instanceof Poruka){
                                   
                                   }
//                Poruka poruka = (Poruka) ois.readObject();
Poruka poruka = (Poruka)prijem;
                                                   System.out.println("PORUKA poslije read object" + ", nit " + nitbr);

//                System.out.println("primljena poruka od klijenta" + poruka.getIdPoruke().toString());
                sviDogadjaji = (ArrayList<Dogadjaj>)ListaDogadjaja.deSerijalizacija();
                if ((poruka.getIdPoruke().equals(Poruka.IDPoruke.SVI_DOGADJAJI))) {
                    sortirajDogadjajePoDatumu(sviDogadjaji);
                                       System.out.println("SVI dogadjaji prije write object" + ", nit " + nitbr);

                    oos.writeObject(sviDogadjaji);//poslana lista dogadjaja
                                       System.out.println("SVI dogadjaji poslije write object" + ", nit " + nitbr);

                    ListaDogadjaja.serijalizacija(sviDogadjaji);

                } 
                else if ((poruka.getIdPoruke().equals(Poruka.IDPoruke.BRISANJE_DOGADJAJA))) {
                    String nazivDogadjaja = (String) poruka.getDodatak();  //p
                                       System.out.println("Brisanje");

//                    System.out.println("Naziv dogadjaja primljen za brisanje: " + nazivDogadjaja);
                    obrisiDogadjaj(nazivDogadjaja);
//                    System.out.println("poslije prisanja dogadjaja u IF");
                    ListaDogadjaja.serijalizacija(sviDogadjaji);
//                    System.out.println("poslije serijalizacije poslije brisanja dogadjaja");
                   System.out.println("BRISANJE prije write object" + ", nit " + nitbr);

                    oos.writeObject(new Poruka(Poruka.IDPoruke.OK, sviDogadjaji));  //s
                                       System.out.println("BRISANJE poslije write object" + ", nit " + nitbr);

//                    System.out.println("poslije slanja OK poruke i svih dogadjaja");
//                    System.out.println("broj poslatih objekata" + sviDogadjaji.size());
                }
                                System.out.println("nit " + nitbr + ", " + brojacRada++ + " KRAJ");

            }

        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private static void sortirajDogadjajePoDatumu(ArrayList<Dogadjaj> sviDogadjaji) {
        //ArrayList<Dogadjaj> sortiraniDogadjaji;
        Collections.sort(sviDogadjaji);
    }

    private static void obrisiDogadjaj(String nazivDogadjaja) {
//        System.out.println("Broj prije Brisanja" + sviDogadjaji.size());
        for (int i = 0; i < sviDogadjaji.size(); i++) {
            if (sviDogadjaji.get(i).getNazivDogadjaja().equals(nazivDogadjaja)) {
                sviDogadjaji.remove(i);
            }
            
        }
        ListaDogadjaja.serijalizacija(sviDogadjaji);
//        System.out.println("Broj poslije brisanja" + sviDogadjaji.size());
    }
}
