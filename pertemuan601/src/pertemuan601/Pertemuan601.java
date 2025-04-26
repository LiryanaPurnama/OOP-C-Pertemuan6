/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan601;

/**
 *
 * @author Liryana Purnama
 * TGL 26-04-2025
 */
public class Pertemuan601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        buah apel =  new buah();
        apel.warna = "Biru";
        apel.SetRasa("Manis");
        
        System.out.printf("Warna Apel diset %s ",apel.warna);
        System.out.printf("\nRasa Apel diset %s ",apel.GetRasa());
        
        buah anggur = new buah();  
        anggur.warna = "Hitam";
        anggur.SetRasa("Manis");
        
        System.out.printf("\nWarna Anggur diset %s ",anggur.warna);
        System.out.printf("\nRasa  Anggur diset %s ",apel.GetRasa());
    }
    
}

class buah{
//    bisa diakses dari dalam class
    public String warna; 
    
//    tidak bisa diakses dari luar class
    private String rasa;
    
    public void SetRasa(String txrasa){
        this.rasa = txrasa;
    }
    
    public String GetRasa(){
        return this.rasa;
    }
}
