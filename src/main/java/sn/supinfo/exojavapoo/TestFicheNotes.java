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
public class TestFicheNotes {
    public static void main(String[] args){
        FicheNotes f1=new FicheNotes();
        f1.setNumero(2);
        f1.setDate("15-02-2021");
        
        FicheNotes f2=new FicheNotes(3,"26-03-2021");
        
        System.out.println("============== FICHE NOTES ===============");
        System.out.println(f1);
        System.out.println("");
        System.out.println(f2);
        System.out.println("==========================================");
    }
}
