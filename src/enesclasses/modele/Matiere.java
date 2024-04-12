/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enesclasses.pronote;

/**
 *
 * @author e.saglam
 */
public class Matiere {
    private String nom;
    
    public Matiere(String n) {
        this.nom = n;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    @Override
    public String toString(){
        return "Matiere : "+this.nom;
    }
}