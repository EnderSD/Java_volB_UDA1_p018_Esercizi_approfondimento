/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio_5;
import java.util.Scanner;

/**
 *
 * Marrale Lorenzo
 * 
 */

public class Contatore {
    
    //dichiarazione delle variabili
    private int variabile_modificata = 10;
    private int contatore = 1;
    private int modificatore;
    
    //metodo che gestisce l'aumento e il decremento della variabile: variabile_modificata
    public void aumento_decremento(){
        
        //creazione di un oggetto scanner per ricevere un input dall'utente
        Scanner scan = new Scanner(System.in);
        
        //messaggio che comunica a quanto è inizializzata la variabile e spiega il funzionamento dei comandi presenti in questo codice
        System.out.println("Il contatore parte da 10, inserire 0 per diminuire, 1 per aumentare, qualsiasi altro numero per uscire");
        
        //attribuisco alla variabile modificatore il valore inserito dall'utente
        modificatore = scan.nextInt();
       
        //ciclo do-while che svolge la funzione di incrementare o decrementare la variabile "variabile_modificata" finchè l'utente non inserisce un numero diverso da 0 o 1
        do{
            
            //Controllo se l'utente ha inserito 0 in caso contrario viene eseguita la parte contenuta nell'"else"
            if(modificatore == 0){
                
                //decremento della variabile
                variabile_modificata = variabile_modificata - contatore;
                //stampa della variabile dopo il decremento
                System.out.println("La variabile è stata decrementata ora vale: "+ variabile_modificata);
            
            
            } else{
                
                //incremento della variabile
                variabile_modificata = variabile_modificata + contatore;
                //stampa della variabile dopo l'incremento
                System.out.println("La variabile è stata incrementata ora vale: "+ variabile_modificata);
                
            }
            
            //chiede nuovamente all'utente di inserire 0 o 1
            System.out.println("inserire 0 per diminuire, 1 per aumentare, qualsiasi altro numero per uscire");
            //sovrascrive il nuovo valore inserito dall'utente a quello precedente
            modificatore = scan.nextInt();
            
        //ciclo continua finchè l'utente non inserisce un numero diverso da 0 e 1   
        } while(modificatore == 0 || modificatore == 1);
        
        //stampa valore della variabile "variabile_modificata" a fine ciclo
        System.out.println("Valore finale della variabile " + variabile_modificata);
        
    }
   
  
}
