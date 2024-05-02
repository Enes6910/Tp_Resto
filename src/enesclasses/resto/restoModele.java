/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enesclasses.resto;

import java.util.ArrayList;

/**
 *
 * @author e.saglam
 */
public class restoModele implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<Caisse> caisse; 
    private ArrayList<Stock> stock;
    private ArrayList<Commandes> commandes;
    private ArrayList<Carte> carte;
    
    public restoModele() {
        this.caisse = new ArrayList<Caisse>();
        this.stock = new ArrayList<Stock>();
        this.commandes = new ArrayList<Commandes>();
        this.carte = new ArrayList<Carte>();
    }
    
    public ArrayList<Carte> getCarte() {
        return this.carte;
    }
    
    private Carte getCarteFromNom(String nom) {
        Carte carte = null;
        for (Carte c : this.carte) {
            if (c.getNom().equals(nom)) {
                carte = c;
            }
        }
        return carte;
}
    private Commandes getCommandesFromNom(String nom) {
        Commandes commandes = null;
        for (Commandes c : this.commandes) {
            if (c.getNom().equals(nom)) {
                commandes = c;
            }
        }
        return commandes;
}
    public void ajouterCarte(String nom) {
        if (getCarteFromNom(nom) != null) {
            System.out.println("Warning : La salle "+nom+" existe deja");
            return;
        }
        this.carte.add(new Carte(nom));
    }
    public void supprimerCarte(String nom) {
        Carte carte = getCarteFromNom(nom);
        this.carte.remove(carte);
    }
    
    public void ajouterCommandes(String nom) {
        if (getCommandesFromNom(nom) != null) {
            System.out.println("Warning : La salle "+nom+" existe deja");
            return;
        }
        this.commandes.add(new Commandes(nom));
    }
    public void supprimerCommandes(String nom) {
        Commandes commandes = getCommandesFromNom(nom);
        this.commandes.remove(commandes);
    }
}


