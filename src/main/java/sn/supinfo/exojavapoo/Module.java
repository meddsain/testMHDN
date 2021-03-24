/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.exojavapoo;

/**
 *
 * @author MHDN
 */
public class Module {
    private String nom;
    private int volHoraire;
    private int coefficient;
    private String description;
    
    public Module(){}
    
    public Module(String nom,int volHoraire,int coefficient,String description){
        this.nom=nom;
        this.volHoraire=volHoraire;
        this.coefficient=coefficient;
        this.description=description;   
    }
    
    public Module(String nom,int volHoraire){
    this.nom=nom;
    this.volHoraire=volHoraire;
}

    public String getNom() {
        return nom;
    }

    public int getVolHoraire() {
        return volHoraire;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public String getDescription() {
        return description;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setVolHoraire(int volHoraire) {
        this.volHoraire = volHoraire;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Module{" + "nom= " + nom + "\n volHoraire= " + volHoraire + ", coefficient= " + coefficient + "\n description= " + description + '}';
    }
    
    
}
