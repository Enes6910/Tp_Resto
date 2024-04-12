/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enesclasses.banque;

import enesclasses.banque.Compte;
import enesclasses.banque.Client;

/**
 *
 * @author e.saglam
 */
public class CompteCourant extends Compte {
    
    public CompteCourant(long numero, Client c) {
        super(numero, c);
    }
    
    @Override
    public String toString () {
        return "Compte courant no " + this.numero + " - solde : " + this.solde;
    }
}
