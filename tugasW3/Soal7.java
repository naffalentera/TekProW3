/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasW3;

/**
 * Nama : Naffa Lenteranisa
 * NIM  : 221524023
 * Tugas: Pertemuan 2 / W3 - Soal 7 Array
 */
import java.util.Arrays;

public class Soal7 {
    public static void main(String[] args) {
        //One Dimensional Arrays
        int[] fisrtArray = {2, 5, 3}; 
        int[] secondArray = {9, 5, 3}; 
        int[] thirdArray = {2, 4, 9}; 
        int[] fourthArray = {10, 11, 12}; 
        int[] fifthArray = {13, 14, 15}; 
        int[] sixthArray = {16, 17, 18}; 
        int[] seventhArray = {19, 20, 21}; 
        int[] eighthArray = {22, 23, 24}; 
        int[] ninthArray = {25, 26, 27}; 
        
        //Two Dimensional Arrays
        int[][] twoDimensionalArray1 = {fisrtArray, secondArray, thirdArray}; 
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
 
        //Three Dimensional Array
        int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
    
        System.out.println(Arrays.deepToString(twoDimensionalArray1).replaceAll("\\,|\\s", " "));
        System.out.println(Arrays.deepToString(twoDimensionalArray2).replaceAll("\\,|\\s", " "));
        System.out.println(Arrays.deepToString(twoDimensionalArray3).replaceAll("\\,|\\s", " "));
     }
}
