/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasW3;

/**
 * Nama : Naffa Lenteranisa
 * NIM  : 221524023
 * Tugas: Pertemuan 2 / W3 - Soal 5 Buka Tutup Jalan
 */

import java.util.Arrays;
import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args){
        // membuat scanner
        Scanner input = new Scanner(System.in);
    
        // input plat nomor 4 mobil
        int[] plat = new int[4];
        for(int i=0;i<4;i++){
            plat[i] = input.nextInt();
        }
        input.close();
    
        String str_plat = Arrays.toString(plat).replaceAll("\\[|\\]|,|\\s", "");    // mengubah array of integer ke string
        long long_plat = Long.parseLong(str_plat);      // mengubah string ke long
       
        if ((long_plat-999999) % 5 == 0){
            System.out.println("berhenti");
        }
        else {System.out.println("jalan");}
    }
}
