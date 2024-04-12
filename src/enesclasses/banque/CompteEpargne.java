/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enesclasses.banque;

import enesclasses.banque.CompteCourant;
import enesclasses.banque.Compte;
import enesclasses.banque.Client;

/**
 *
 * @author e.saglam
 */
public class CompteEpargne extends Compte {
    private float montantTransfert;
    private CompteCourant compteTransfert;
    
    public CompteEpargne(long numero, Client c, CompteCourant compteTransfert, float montantTransfert) {
        super(numero, c);
        this.compteTransfert = compteTransfert;
        this.montantTransfert = montantTransfert;
    }
    
    public void transfert(float argent, CompteEpargne compte) {
        this.Debit((float)argent);
        compte.Credit((float)argent);
    }
    
    @Override
    public String toString() {
        return "Compte epargne no " + this.numero + " - solde : " + this.solde;
    }
    
    
    
}