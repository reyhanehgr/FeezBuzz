/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.feezbuzz;

import java.util.Scanner;

///FeezBuzz
public class FeezBuzz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number:");
        int number=scanner.nextInt();
        if (((number%5)==0) && ((number%3)==0)){
            System.out.println("FeezBuzz");
        }
        else if ((number%5)==0)
            System.out.println("Feez");
        else if ((number%3)==0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}
