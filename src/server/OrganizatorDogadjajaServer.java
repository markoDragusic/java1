/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import dogadjaj.Dogadjaj;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author raka
 */
public class OrganizatorDogadjajaServer {
    
    private static final int PORT = 9000;
    private static ListaDogadjaja listaDogadjaja;
    private static ArrayList<Dogadjaj> sviDogadjaji;
      static int nitbr = 0;

    public static ArrayList<Dogadjaj> getSviDogadjaji() {
        return sviDogadjaji;
    }
    
    
    public static void main(String[] args){
        
        try{
          
            ServerSocket ss = new ServerSocket(PORT);
            System.out.println("Server pokrenut...");
            listaDogadjaja = new ListaDogadjaja();
           // listaDogadjaja = deSerijalizacija();
            sviDogadjaji = listaDogadjaja.deSerijalizacija(); //deserijalizovani dogadjaji
//            System.out.println("Poslije deserijalizacije svih dogadjaja");
            while(true){
                Socket soket = ss.accept();
                OrganizatorDogadjajaServerNit odsn = new OrganizatorDogadjajaServerNit(soket);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        } 
    }
    
}
