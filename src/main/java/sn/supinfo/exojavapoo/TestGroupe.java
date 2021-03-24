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
public class TestGroupe {
    public static void main(String[] args){
        Groupe gr=new Groupe();
        gr.setNom_Groupe("PR310");
        gr.setDate_creation("04-01-2021");
        gr.setModule_groupe("Javascript");
        
        Groupe gr1=new Groupe("PR214","Php POO");
        
        System.out.println("================= GROUPE ==================");
        System.out.println(gr);
        System.out.println("|                                         |");
        System.out.println("===========================================");
        System.out.println(gr1);
        System.out.println("|                                         |");
        System.out.println("===========================================");
    }
    
}
