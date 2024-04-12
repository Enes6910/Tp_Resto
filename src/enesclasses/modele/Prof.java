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
public class Prof extends Individu {
    private ArrayList<Matiere> matieresEnseignees;
    
    public Prof(String n, String p) {
        super(n, p);
        this.matieresEnseignees = new ArrayList<Matiere>();
    }
    
    public void addMatiere(Matiere m) {
        this.matieresEnseignees.add(m);
    }
    
    public ArrayList<Matiere> getMatieres() {
        return this.matieresEnseignees;
    }
    
    @Override
    public String toString(){
        String result = this.getNom()+" "+this.getPrenom();
        if (!matieresEnseignees.isEmpty()) {
            result = result + "\nMatieres Enseignees :";
            for (Matiere m : matieresEnseignees) {
                result = result + "\n- "+m.getNom();
            }
        }
        return result;
    }
}
