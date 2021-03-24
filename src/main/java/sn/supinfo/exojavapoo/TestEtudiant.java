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
public class TestEtudiant {
    
    public static void main(String[] args){
        Etudiant et1=new Etudiant();
        et1.setPrenom("Nadia");
        et1.setNom("Cabo");
        et1.setNumero("sd005252");
        et1.setDepartement("Science et Technologie");
        
        Etudiant et2=new Etudiant("Moustapha","Gueye","MG25463","Genie Civil");
        
        Etudiant et3=new Etudiant("Lala","Niang","Sciences ecomnomiques");
        
        System.out.println("=*=*=*=*=*=*=*=* ETUDIANT *=*=*=*=*=*=*=*=");
        System.out.println(et1);
        System.out.println("==========================================");
        System.out.println(et2);
        System.out.println("==========================================");
        System.out.println(et3);
        System.out.println("==========================================");
    }
    
}
