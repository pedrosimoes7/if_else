/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.simoes.ifexemplo_6;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Ifexemplo_6 {

    public static void main(String[] args) {
        
        double a;
        double b;
        double c;
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print(" entre com um valor : ");
        a = tec.nextDouble();
        System.out.print(" entre com outro valor : ");
        b = tec.nextDouble();
        System.out.print(" entre com outro valor novamente : ");
        c = tec.nextDouble();
        
        if ( a >= b && a >=c){
            if ( b >= c){
                System.out.println(a + ","+ b+","+c);
            } else {
                System.out.println(a+","+c+","+b);
            }
        }else if ( b >= a && b>= c){
            if ( a>=c){
                System.out.println(b + ","+a+","+c);
            }else {
            System.out.println(b+","+c+","+a);
        }
        }else {
            if ( a>=b){
                System.out.println(c+","+a+","+b);
            }else {
                System.out.println(c+","+b+","+a);
            }
        }
    }
}
