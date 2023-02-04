package tugasW3;

/**
 * Nama : Naffa Lenteranisa
 * NIM  : 221524023
 * Tugas: Pertemuan 2 / W3 - Soal 3 Berhitung
 */

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
    // membuat scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan perhitungan dengan format : (bilangan1 operator bilangan2)\n");
    short bil1 = input.nextShort();
    char operator = input.next().charAt(0);
    short bil2 = input.nextShort();
    input.close();
    
    int hasil = 0;
    switch (operator)
    {
        case '+' : 
            hasil = bil1 + bil2;
            break;
        case '-' :
            hasil = bil1 - bil2;
            break;
        case '*' :
            hasil = bil1 * bil2;
            break;
        case '/' :
            hasil = bil1 / bil2;
            break;
        case '%' :
            hasil = bil1 % bil2;
            break;
    }
    
    System.out.println("Hasil : " +hasil);
    }
}
