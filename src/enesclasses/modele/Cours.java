/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enesclasses.pronote;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author e.saglam
 */
public class Cours {
    private Date dateDebut;
    private Date dateFin;
    private ArrayList<Salle> salles;
    private ArrayList<Prof> profs;
    private ArrayList<Groupe> groupes;
    private Matiere matiere;
    
    public Cours(Date dd, Date df, ArrayList<Salle> s, ArrayList<Prof> p, ArrayList<Groupe> g, Matiere m) {
        this.dateDebut = dd;
        this.dateFin = df;
        this.salles = s;
        this.profs = p;
        this.groupes = g;
        this.matiere = m;
    }
    
    public String getDateString() {
        String result = "Debut : " + dateDebut.getDate() + "/" + dateDebut.getMonth() + " - " + dateDebut.getHours() + "h" + dateDebut.getMinutes();
        long d = dateFin.getTime() - dateDebut.getTime();
        long hours = d/3600000;
        long min = ((d/1000)%3600)/60;
        String duree = hours+"h"+min;
        result = result + "\nFin : " + dateFin.getHours() + "h" + dateFin.getMinutes() + " (Duree : "+ duree + ")";
        return result;
    }
    public ArrayList<Salle> getSalles() {
        return this.salles;
    }
    public ArrayList<Prof> getProfs() {
        return this.profs;
    }
    public ArrayList<Groupe> getGroupes() {
        return this.groupes;
    }
    public Matiere getMatiere() {
        return this.matiere;
    }
    
    public void setDateDebut(Date d) {
        this.dateDebut = d;
    }
    public void setDateFin(Date d) {
        this.dateFin = d;
    }
    public void setMatiere(Matiere m) {
        this.matiere = m;
    }
    public void addSalle(Salle s) {
        this.salles.add(s);
    }
    public void addProf(Prof p) {
        this.profs.add(p);
    }
    public void addGroupe(Groupe g) {
        this.groupes.add(g);
    }
    
    @Override
    public String toString(){
        String result = this.getDateString();
        result = result + "\n" + this.matiere.toString();
        result = result + "\nSalles :";
        for (Salle s : salles) {
            result = result + "\n- "+s.getNumero();
        }
        result = result + "\nGroupes :";
        for (Groupe g : groupes) {
            result = result + "\n- "+g.getNom();
        }
        result = result + "\nProfs :";
        for (Prof p : profs) {
            result = result + "\n- "+p.getNomComplet();
        }
        return result;
    }
}