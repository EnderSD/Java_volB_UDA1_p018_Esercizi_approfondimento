/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio_2;

/**
 *
 * Marrale Lorenzo 
 * 
 * 
 */
public class Prodotto {
    
    //creazione attributi di tipo privato
    private String proprietario;
    private String nomeProprietario;
    
    //costruttore senza parametri
    public Prodotto(){
        
        this.proprietario = "Cosini Z.";
        this.nomeProprietario = "Zeno cosini";
        
    }
    
    //costruttore con parametri
    public Prodotto(String proprietario, String nomeProprietario){
        
        this.proprietario = proprietario;
        this.nomeProprietario = nomeProprietario;
        
    }
    
    public void stampa(){
        
        //stampa valori
        System.out.println("Proprietario: " + proprietario);
        System.out.println("Nome Proprietario: " + nomeProprietario);
        
    }
    
    
}
