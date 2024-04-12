/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enesclasses.pronote;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author e.saglam
 */
public class Pronote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Eleve e1 = new Eleve("BIONDO", "Kylian");
        Eleve e2 = new Eleve("CHAUMETTE", "Tom");
        
        Matiere slam = new Matiere("SLAM");
        
        Prof p1 = new Prof("CHETRIT","Pierre");
        p1.addMatiere(slam);
        
        Groupe groupeSlam = new Groupe("BTS1 SLAM");
        groupeSlam.addEleve(e1);
        groupeSlam.addEleve(e2);
        
        Salle s180 = new Salle("180 INFO");
        
        ArrayList<Salle> lesSalles = new ArrayList<Salle>();
        lesSalles.add(s180);
        ArrayList<Groupe> lesGroupes = new ArrayList<Groupe>();
        lesGroupes.add(groupeSlam);
        ArrayList<Prof> lesProfs = new ArrayList<Prof>();
        lesProfs.add(p1);
        Cours c1 = new Cours(new Date(2024, 3, 21, 8, 15),new Date(2024, 3, 21, 12, 10), lesSalles, lesProfs, lesGroupes, slam);
        
        System.out.println(c1);
    }
    
}

