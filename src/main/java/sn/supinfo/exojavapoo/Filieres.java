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
public class Filieres {
    private String nom;
    private String description;
    
    public Filieres(){}
    
    public Filieres(String nom,String descrip){
        this.nom=nom;
        this.description=descrip;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Filieres\n{" + "nom= " + nom + ", description= " + description + '}';
    }
    
    
}
