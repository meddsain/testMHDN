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
public class TestEvaluation {
    public static void main(String[] args){
        Evaluation ev=new Evaluation();
        ev.setType("Controle");
        ev.setDate("08-04-2021");
        ev.setDuree("2h");
        
        Evaluation ev1=new Evaluation("Examen","09-09-2021","4h");
        
        System.out.println("================= EVALUATION ==================");
        System.out.println(ev);
        System.out.println("                                               ");
        System.out.println("===============================================");
        System.out.println(ev1);
        System.out.println("***********************************************");
    }
    
}
