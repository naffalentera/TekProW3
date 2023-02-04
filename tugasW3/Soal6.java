/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasW3;

/**
 * Nama : Naffa Lenteranisa
 * NIM  : 221524023
 * Tugas: Pertemuan 2 / W3 - Soal 6 Big Number
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan1 : ");
        BigInteger bil1 = input.nextBigInteger();  
        System.out.print("Masukkan bilangan2 : ");
        BigInteger bil2 = input.nextBigInteger();
        input.close();
        
        BigInteger jumlah = bil1.add(bil2);    
        BigInteger kali = bil1.multiply(bil2);   
        System.out.println("jumlah bil1 dan bil2 : "+jumlah);
        System.out.println("hasil kali bil1 dan bil2 : "+kali);
    }

}
