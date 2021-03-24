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
public class Etudiant {
    private String prenom;
    private String nom;
    private String numero;
    private String departement;
    
    public Etudiant(){}
    
    public Etudiant(String prenom,String nom,String numero,String departement){
        this.prenom=prenom;
        this.nom=nom;
        this.numero=numero;
        this.departement=departement;
        
    }
    
    public Etudiant(String prenom,String nom,String departement){
        this.prenom=prenom;
        this.nom=nom;
        this.departement=departement;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getNumero() {
        return numero;
    }

    public String getDepartement() {
        return departement;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    @Override
    public String toString() {
        return "Etudiant\n{" + "prenom=" + prenom + "\n nom=" + nom + ", numero=" + numero + "\n departement=" + departement + '}';
    }
    
    
}
