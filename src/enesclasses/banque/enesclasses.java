/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enesclasses.banque;

import enesclasses.banque.Client;

/**
 *
 * @author e.saglam
 */
public class enesclasses {
    public static void main (String[]args) {
        Client c1 = new Client(1, "Gold");
        CompteCourant cc1 = new CompteCourant(1,c1);
        CompteEpargne com1 = new CompteEpargne(10,c1,cc1,0);
        CompteEpargne com2 = new CompteEpargne(20,c1,cc1,0);
        c1.addCompte(com1);
        c1.addCompte(com2);
        com1.Credit((float) 500.0);
        System.out.println(c1.getComptes());
       
        Client c2 = new Client(2, "Roger");
        CompteCourant cc2 = new CompteCourant(1,c2);
        CompteEpargne com3 = new CompteEpargne(30, c2,cc2,0);
        CompteEpargne com4 = new CompteEpargne(40, c2,cc2,0);
        c2.addCompte(com3);
        c2.addCompte(com4);
        com3.Credit((float) 250.0);
        System.out.println(c2.getComptes());
       
        com1.transfert(20,com3);
        System.out.println(c1.getComptes());
        System.out.println(c2.getComptes());
    } 
}


