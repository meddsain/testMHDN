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
public class Professeur {
    private String prenom;
    private String nom;
    private String adresse;
    private String telephone;
    
    public Professeur(String prenom,String nom,String adresse,String tel){
        this.prenom=prenom;
        this.nom=nom;
        this.adresse=adresse;
        this.telephone=tel;
    }
    public Professeur(){}
    
    public Professeur(String prenom,String nom,String adresse){
        this.prenom=prenom;
        this.nom=nom;
        this.adresse=adresse;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Professeur\n{" + "prenom=" + prenom + ", nom=" + nom + ", adresse=" + adresse + ", telephone=" + telephone + '}';
    }
    
    
}
