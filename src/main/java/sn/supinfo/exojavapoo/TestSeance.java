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
public class TestSeance {
    public static void main(String[] args){
        Seance s=new Seance();
        s.setDate("le 18-01-2021");
        s.setHeure_debut("9h00");
        s.setHeure_fin("12h00");
        s.setSolde_heure("20h -3h");
        
        Seance s1=new Seance("18-01-2021","12h15","20h-3");
        
        System.out.println("================= SEANCE ==================");
        System.out.println(s);
        System.out.println("                                               ");
        System.out.println("===============================================");
        System.out.println(s1);
        System.out.println("***********************************************");
        
    }
    
}
