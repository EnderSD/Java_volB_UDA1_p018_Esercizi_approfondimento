/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio_4;

/**
 *
 * Marrale Lorenzo
 * 
 * 
 * 
 */

public class Studente {
    
    //creazione attributi di tipo privato
    private String cognome = "Marcis ";
    private String nome = "Mirko ";
    private String codice_fiscale = "MRCMRK96H06A952E ";
    private String numero_matricola = "M169ZK33";
    
    public void stampa(){
        
       
        System.out.println("Ecco i dati dello studente, di seguito: cognome, nome, codice fiscale e numero di immatricolazione: ");
        System.out.println(cognome.toString() + nome.toString() + codice_fiscale.toString() + numero_matricola.toString());
        
    }
    

    
}
