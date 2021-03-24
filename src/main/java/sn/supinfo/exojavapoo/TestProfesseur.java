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
public class TestProfesseur {
    public static void main(String[] args){
        Professeur prof=new Professeur();
        prof.setPrenom("Moussa");
        prof.setNom("Baldé");
        prof.setAdresse("Pikine rue 10");
        prof.setTelephone("752745136");
        
        Professeur prof1=new Professeur("Sada","Kane","Gibraltar","761435453");
        Professeur prof2=new Professeur("Alioune","Samb","Parcelles Assainies");
        
        System.out.println("================= PROFESSEUR ==================");
        System.out.println(prof);
        System.out.println("===============================================");
        System.out.println(prof1);
        System.out.println("===============================================");
        System.out.println(prof2);
    }
    
}
