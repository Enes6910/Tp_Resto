/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enesclasses.banque;

import java.util.ArrayList;

/**
 *
 * @author e.saglam
 */

public class Client {
    private long numero;
    private String nom;
    private ArrayList<Compte> comptes;
    
    Client(long numero, String nom) {
        this.numero = numero;
        this.nom = nom;
        this.comptes = new ArrayList<Compte>();
    }
    
    public long getNumero(){
        return this.numero;
    }
    
    public String getNom() {
        return this.nom; 
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
        public void addCompte(Compte c) {
        this.comptes.add(c);
    }
        
        public ArrayList<Compte> getComptes() {
        return this.comptes;
    }
    
    @Override
    public String toString() {
        String result = "Client "+this.numero+" - "+this.nom;
        if (this.comptes.isEmpty()) {
            result = result + "\npas de compte rattache a ce client";
        } else {
            for (Compte c : this.comptes) {
                result = result + "\n"+c.toString();
            }
        }
        return result;
    }
}
