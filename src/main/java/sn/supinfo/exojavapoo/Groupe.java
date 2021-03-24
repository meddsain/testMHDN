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
public class Groupe {
    private String nom_Groupe;
    private String date_creation;
    private String module_groupe;
    
    public Groupe(){}
    
    public Groupe(String nomGr,String datecreat,String module_gr){
        this.nom_Groupe=nomGr;
        this.date_creation=datecreat;
        this.module_groupe=module_gr;
        
    }
    public Groupe(String nomGr,String module_gr){
        this.nom_Groupe=nomGr;
        this.module_groupe=module_gr;
    }

    public String getNom_Groupe() {
        return nom_Groupe;
    }

    public String getDate_creation() {
        return date_creation;
    }

    public String getModule_groupe() {
        return module_groupe;
    }

    public void setNom_Groupe(String nom_Groupe) {
        this.nom_Groupe = nom_Groupe;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }

    public void setModule_groupe(String module_groupe) {
        this.module_groupe = module_groupe;
    }

    @Override
    public String toString() {
        return "Groupe\n{" + "nom_Groupe=" + nom_Groupe + ", date_creation=" + date_creation + ", module_groupe=" + module_groupe + '}';
    }
    
    
    
    
}
