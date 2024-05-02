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
public class Modele implements java.io.Serializable  {
    private static final long serialVersionUID = 1L;
    private ArrayList<Prof> profs;
    private ArrayList<Eleve> eleves;
    private ArrayList<Groupe> groupes;
    private ArrayList<Salle> salles;
    private ArrayList<Matiere> matieres;
    private ArrayList<Cours> cours;
    
    public Modele() {
        this.profs = new ArrayList<Prof>();
        this.eleves = new ArrayList<Eleve>();
        this.groupes = new ArrayList<Groupe>();
        this.salles = new ArrayList<Salle>();
        this.matieres = new ArrayList<Matiere>();
        this.cours = new ArrayList<Cours>();
    }
    
    public ArrayList<Salle> getSalles() {
        return this.salles;
    }
        public ArrayList<Eleve> getEleves() {
        return this.eleves;
    }
    private Salle getSalleFromNum(String num) {
        Salle salle = null;
        for (Salle s : this.salles) {
            if (s.getNumero().equals(num)) {
                salle = s;
            }
        }
        return salle;
    }
    private Eleve getEleveFromNum(String num) {
        Eleve eleve = null;
        for (Eleve s : this.eleves) {
            if (s.getNom().equals(num)) {
                eleve = s;
            }
        }
        return eleve;
    }
    public void ajouterSalle(String num) {
        if (getSalleFromNum(num) != null) {
            System.out.println("Warning : La salle "+num+" existe deja");
            return;
        }
        this.salles.add(new Salle(num));
    }
    public void supprimerSalle(String num) {
        Salle salle = getSalleFromNum(num);
        this.salles.remove(salle);
    }
    public void renommerSalle(String num, String nouveauNom) {
        if (getSalleFromNum(nouveauNom) != null) {
            System.out.println("Warning : La salle "+nouveauNom+" existe deja");
            return;
        }
        Salle salle = getSalleFromNum(num);
        salle.setNumero(nouveauNom);
    }
        public void ajouterEleve(String num) {
        if (getEleveFromNum(num) != null) {
            System.out.println("Warning : L'eleve "+num+" existe deja");
            return;
        }
        }
}
