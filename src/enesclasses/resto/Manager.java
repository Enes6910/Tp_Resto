/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enesclasses.resto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author e.saglam
 */
public class Manager {
    private String nomManager;
    private String prenomManager;
    private ArrayList<Carte> listeCarte; // Rename from Carte to listeCarte
    
    public Manager(String nomManager, String prenomManager) {
        this.nomManager = nomManager;
        this.prenomManager = prenomManager; 
        this.listeCarte = new ArrayList<>(); // Initialize the ArrayList
    }
    
    public void ajouterCarte(String n, float p) {
        Carte nouvelleCarte = new Carte(n, p);
        this.listeCarte.add(nouvelleCarte);
    }
}
