/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luas_segitiga;

/**
 *
 * @author audrey
 */
import java.util.Scanner;
public class Luas_segitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Masukkan panjang alas : ");
        int a = masukan.nextInt();
        
        System.out.print("Masukan tinggi segitiga : ");
        int t = masukan.nextInt();
        
        System.out.println("Luas segitiga dengan alas "+a+" dan tinggi "+t+" adalah " +0.5*a*t);
    }
    
}
