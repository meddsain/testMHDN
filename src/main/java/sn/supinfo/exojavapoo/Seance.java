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
public class Seance {
    private String date;
    private String heure_debut;
    private String heure_fin;
    private String solde_heure;
    
    public Seance(){}
    
    public Seance(String date,String heure_debut,String heure_fin,String solde_heure){
        this.date=date;
        this.heure_debut=heure_debut;
        this.heure_fin=heure_fin;
        this.solde_heure=solde_heure;
        
    }
    public Seance(String date,String heure_debut,String solde_heure){
        this.date=date;
        this.heure_debut=heure_debut;
        this.solde_heure=solde_heure;
    }

    public String getDate() {
        return date;
    }

    public String getHeure_debut() {
        return heure_debut;
    }

    public String getHeure_fin() {
        return heure_fin;
    }

    public String getSolde_heure() {
        return solde_heure;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHeure_debut(String heure_debut) {
        this.heure_debut = heure_debut;
    }

    public void setHeure_fin(String heure_fin) {
        this.heure_fin = heure_fin;
    }

    public void setSolde_heure(String solde_heure) {
        this.solde_heure = solde_heure;
    }

    @Override
    public String toString() {
        return "Seance\n{" + "date=" + date + ", heure_debut=" + heure_debut + ", heure_fin=" + heure_fin + ", solde_heure=" + solde_heure + '}';
    }
    
}
