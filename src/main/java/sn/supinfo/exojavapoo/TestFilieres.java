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
public class TestFilieres {
    public static void main(String[] args){
        Filieres f=new Filieres();
        f.setNom("Programmation et developpement");
        f.setDescription("C'est une filiere qui enseigne la programmation et le devloppement informatique appelé autrement Genie informatique ");
        
        Filieres f1=new Filieres("Art numerique","Filiere qui enseigne la creation artistique a partir du numerique");
        
        System.out.println("================== FILIERES ===================");
        System.out.println(f);
        System.out.println("                                               ");
        System.out.println("===============================================");
        System.out.println(f1);
        System.out.println("***********************************************");
    }
    
}
