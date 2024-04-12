/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enesclasses.pronote;
import java.util.ArrayList;

/**
 *
 * @author e.saglam
 */
public class Groupe {
    private String nom;
    private ArrayList<Eleve> listeEleves;
    
    public Groupe(String n) {
        this.nom = n;
        this.listeEleves = new ArrayList<Eleve>();
    }
    
    public void addEleve(Eleve e) {
        this.listeEleves.add(e);
    }
    
    public ArrayList<Eleve> getEleves(){
        return this.listeEleves;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    @Override
    public String toString(){
        String result = this.nom;
        if (!listeEleves.isEmpty()) {
            result = result + "\nListe des eleves :";
            for (Eleve e : listeEleves) {
                result = result + "\n- "+e.getNomComplet();
            }
        }
        return result;
    }
}
