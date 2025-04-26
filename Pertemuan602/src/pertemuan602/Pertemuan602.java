package pertemuan602;

import java.util.Scanner;

/**
 *
 * @author Liryana Purnama
 * TGL 26-04-2025
 */
public class Pertemuan602 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner insi = new Scanner(System.in);
        
        System.out.print("Nilai Sisi: ");
        int nsisi = insi.nextInt();
        
        LuasPersegi LP = new LuasPersegi(nsisi);
//        LP.sisi = 100;

//        System.out.printf("Luas = %d\n", LP.HL() );
          System.out.println("Hitung Luas Persegi");
          System.out.printf("Luas = SISI X SISI\n");
          System.out.printf("  = %d X %d\n", nsisi, nsisi);
          System.out.printf("  = %d\n",LP.HL());
    }
    
}
