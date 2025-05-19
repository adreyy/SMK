/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contoh_if_else_input;

/**
 *
 * @author audrey
 */
import java.util.Scanner;
public class Contoh_if_else_input {
    public static void main(String[] args) {
    //mengaktifkan Scanner untuk membaca input dari keyboard ke konsol
    Scanner input = new Scanner (System.in);
    System.out.print("Nilai Anda : ");
    int a = input.nextInt();
    
    int nilai = a;
    
    //syarat nilai minimal untuk lulus adalah 67
    
    if (nilai >= 67){
        System.out.println("Anda Lulus!");
    }
    else {
        System.out.println("Anda Gagal!");
    }
    }
}