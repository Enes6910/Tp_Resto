/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enesclasses.pronote;

/**
 *
 * @author e.saglam
 */
public abstract class Individu {
    private String nom;
    private String prenom;
    
    public Individu(String n, String p) {
        this.nom = n;
        this.prenom = p;
    }
    
    public String getNom() {
        return this.nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public String getNomComplet() {
        return this.getNom()+" "+this.getPrenom();
    }
}
