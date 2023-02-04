/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasW3;

/**
 * Nama : Naffa Lenteranisa
 * NIM  : 221524023
 * Tugas: Pertemuan 2 / W3 - Soal 2 Input & Output(2)
 */

//java.io;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            System.out.print("Masukkan jumlah baris yang akan diinput : ");
            int n = input.nextInt();
            input.close();
            
            // deklarasi variabel
            String[] kata = new String[n];
            int[] num = new int[n];
            
            System.out.print("Masukkan kata dan angka\n");
            for(int i=0;i<n;i++){
                kata[i] = input.next();
                num[i] = input.nextInt();
            }
            
            System.out.println("================================");    
            for(int i=0;i<n;i++){
                System.out.printf("%-15s %03d\n", kata[i], num[i]);}
            System.out.println("================================");    
    }
}
