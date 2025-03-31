/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio26;

/**
 *
 * @author 10725113959
 */
import java.util.Scanner;
public class Exercicio26 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a,b,c;
        System.out.println("Digite o primeiro numero:");
        a = ler.nextInt();
        System.out.println("Digite o segundo numero:");
        b = ler.nextInt();
        System.out.println("Digite o terceiro numero:");
        c = ler.nextInt();
        
        if(a < b) {
            if(b < c) {
            System.out.println("A sequência é: "+a+", "+b+" e "+ c);
            }
            else if(a < c) {
                System.out.println("A sequência é: "+a+", "+c+" e "+ b);
            }else{
                System.out.println("A sequência é: "+c+", "+a+" e "+ b);      
                }
            }
        else if (b < c) {
            if(a < c) {
            System.out.println("A sequência é: "+b+", "+a+" e "+c);
            }else{
            System.out.println("A sequência é: "+b+", "+c+" e "+ a);
            }
                } else {
                    System.out.println("A sequência é: "+c+", "+b+" e "+ a);
                    }
        }
    }
