/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio_7;
import java.util.Scanner;

/**
 *
 * Marrale Lorenzo
 */ 


public class Contatore {
    

    private int variabile_partenza = 10;
    private int valore_max = 20;
    private int incremento_variabile = 1;
    private int modificatore = 0;
    private String risposta = "";
    
    public void incremento_decremento_finche_max_raggiunto(){
        
        // Creazione dell'oggetto Scanner per ricevere input dall'utente
        Scanner scan = new Scanner(System.in);
        
        // Messaggio iniziale per spiegare il funzionamento del programma
        System.out.println("Il contatore parte da 10, inserire un numero il quale andrà a incrementare o decrementare la variabile, quando viene raggiunto o superato 20, inserire T per ripartire altrimenti qualsiasi altra lettera");
        
  
        do {
            
            //richiesta all'utente di un valore per modificare il contatore
            System.out.print("Inserire un valore per modificare il contatore, positivo per incrementare, negativo per decrementare: ");
            modificatore = scan.nextInt();
            scan.nextLine(); // Consuma il carattere newline lasciato da nextInt()
            
            //se il modificatore è positivo, incremento il contatore
            if(modificatore > 0){
                
                variabile_partenza = variabile_partenza + modificatore;
                System.out.println("La variabile è stata incrementata ora vale: "+ variabile_partenza);
            
            //Se il modificatore è negativo, decremento il contatore
            } else if(modificatore < 0){
                
                variabile_partenza = variabile_partenza + modificatore;
                System.out.println("La variabile è stata decrementata ora vale: "+ variabile_partenza);
                
            //caso in cui l'utente inserisce un valore diverso da un numero positivo o negativo
            } else{
                
                System.out.println("Ciclo interrotto");
                break;
            }
            
            //controllo se la variabile di partenza ha raggiunto il valore massimo
            if(variabile_partenza >= valore_max){
                
                //rchiesta all'utente se desidera ricominciare il conteggio
                System.out.println("La variabile ha raggiunto 20, desidera ricominciare da 0? Se si digitare T altrimenti digitare qualsiasi altra lettera ");
                risposta = scan.nextLine(); 
                
                //controllo se l'utente ha scelto di ricominciare
                if(risposta.equalsIgnoreCase("T")){
                    
                    // Reset della variabile di partenza
                    variabile_partenza = 0;
                    System.out.println("Il contatore è stato azzerato ora ricomincia da 0");
                    
                //caso in cui l'utente sceglie di non ricominciare
                }else{
                    
                    // Uscita dal ciclo
                    System.out.println("Ciclo interrotto");
                    break;
                    
                }
            }

        // Il ciclo continua solo se l'utente inserisce un valore diverso da 0
        } while(modificatore != 0);
        
    }
    
}
    

