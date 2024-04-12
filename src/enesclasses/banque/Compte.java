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

public class Compte {
    long numero;
    private Client client;
    float solde;
    
    Compte(long numero, Client c) {
        this.numero = numero;
        this.client = c;
        this.solde = solde;
        solde = (float) 0.0;
    }
    
    public float getSolde() {
        return this.solde;
    }
    
    public Client getClient() {
        return this.client;
    }
    
    public long getNumero() {
        return this.numero;
    }
    
    public void Credit (float m) {
        this.solde = this.solde + m;
    }
    
    public void Debit (float m) {
        this.solde = this.solde - m;
    }
    
    @Override
    public String toString() {
        return "Compte " + this.numero +" - client "+ this.client.getNom() + " - Solde : " + solde;
    }

    void transfert(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}


