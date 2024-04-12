/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enesclasses.pronote;

/**
 *
 * @author e.saglam
 */
public class Salle implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String numero;
    
    public Salle(String n) {
        this.numero = n;
    }
    
    public String getNumero() {
        return this.numero;
    }
    public void setNumero(String n) {
        this.numero = n;
    }
    
    @Override
    public String toString(){
        return "Salle : "+this.numero;
    }
}
