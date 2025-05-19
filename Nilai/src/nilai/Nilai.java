/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilai;

/**
 *
 * @author audrey
 */
import java.util.Scanner;
public class Nilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int bindo;
        int mtk;
        int fisika;
        int nilai;
       
                
        System.out.print("Nama : ");
        nama = input.nextLine();
        
        System.out.println("-------------------------");
        
        System.out.print("Nilai Bahasa Indonesia : ");
        bindo = input.nextInt();
        
        System.out.print("Nilai Matematika : ");
        mtk = input.nextInt();
        
        System.out.print("Nilai Bahasa Inggris : ");
        fisika = input.nextInt();

         System.out.println("-------------------------");
              
        nilai = (bindo + mtk + fisika)/3;
        
        if (bindo < 76 || mtk < 76 || fisika < 76){
            System.out.println("Nilai anda ada yang dibawah kkm, Anda tidak lulus!");
        } else if(nilai >= 76 && nilai <=100){
            System.out.println("Nilai anda " + nilai + ", Selamat anda lulus");    
        }else if(nilai < 76){
            System.out.println("Nilai anda " + nilai+ ", Anda tidak lulus!");
        }else{
            System.out.println("Error, Nilai lebih dari 100"); 
        }

    }
    
}
