/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasW3;

/**
 * Nama : Naffa Lenteranisa
 * NIM  : 221524023
 * Tugas: Pertemuan 2 / W3 - Soal 1 Input & Output
 */

import java.io.IOException;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) throws IOException{
        //membuat scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kalimat : ");
        String s = input.nextLine();
        input.close();
        
        String[] kalimat = s.split("[ !,?._'@]+");
        
        int n = kalimat.length;
        
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.println(kalimat[i]);
        }
    }
}
