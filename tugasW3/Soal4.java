/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasW3;

/**
 * Nama : Naffa Lenteranisa
 * NIM  : 221524023
 * Tugas: Pertemuan 2 / W3 - Soal 4 Gaji Agent
 */

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        // membuat scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah penjualan : ");
        int item = input.nextInt();
        input.close();
        
        double gaji;
        
        if (item >= 40 && item <= 80){
                gaji = 500000 + (0.25*item*50000);}
            else if (item > 80){
                gaji = 500000 + (0.35*item*50000);}
            else if (item < 15){
                    gaji = 500000 - (0.15*item*50000);}
            else { gaji = 500000 + (0.10*item*50000);}
        
        System.out.println("Gaji : "+gaji);
    }
}