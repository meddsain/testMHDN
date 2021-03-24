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
public class TestModule {
    
    public static void main(String args[]){
        Module md2=new Module();
        md2.setNom("Lunix");
        md2.setVolHoraire(20);
        md2.setCoefficient(3);
        md2.setDescription("Administration du systeme lunix");
        
        Module md1=new Module("Java",20,4,"Cours de langage POO");
        
        Module md3=new Module("Analyse",20);
        
        System.out.println("============= Modules ==============");
        System.out.println(md2);
        System.out.println("************************************");
        System.out.println("|                                  |");
        System.out.println(md1);
        System.out.println("|                                  |");
        System.out.println("************************************");
        System.out.println("|                                  |");
        System.out.println(md3);
        System.out.println("************************************");
        
    }
    
}
