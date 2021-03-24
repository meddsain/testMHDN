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
public class FicheNotes {
    private int numero;
    private String date;
    
    public FicheNotes(){}
    
    public FicheNotes(int numero,String date){
        this.numero=numero;
        this.date=date;     
    }

    public int getNumero() {
        return numero;
    }

    public String getDate() {
        return date;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FicheNotes\n{" + "numero=" + numero + ", date=" + date + '}';
    }
    
    
}
