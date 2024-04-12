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
public class Eleve extends Individu {
    private Groupe classe;
    private ArrayList<Groupe> listeGroupes;
    
    public Eleve(String n, String p) {
        super(n,p);
        this.classe = null;
        this.listeGroupes = new ArrayList<Groupe>();
    }
    public Eleve(String n, String p, Groupe c) {
        super(n, p);
        this.classe = c;
        this.listeGroupes = new ArrayList<Groupe>();
        this.listeGroupes.add(c);
    }
    
    public void setClasse(Groupe c) {
        this.classe = c;
        this.listeGroupes.add(c);
    }
    
    public void addGroupe(Groupe g) {
        this.listeGroupes.add(g);
    }
    
    @Override
    public String toString(){
        String result = this.getNomComplet();
        if (classe != null) {
            result = result +" "+classe.getNom();
        }
        return result;
    }
}