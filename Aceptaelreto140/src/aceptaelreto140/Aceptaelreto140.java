/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto140;
import java.util.Scanner;
/**
 *
 * @author adria
 */
public class Aceptaelreto140 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
          Scanner sc = new Scanner(System.in);
        String number;
        int [] n;
        int sum, i;
       
        do{
            number = sc.nextLine();
        if(Integer.parseInt(number) > -1){
                n = new int[number.length()];
                sum=0;
 
                for(i=0; i<number.length(); i++){
                    n[i] = Character.getNumericValue(number.charAt(i));
                    System.out.print(n[i]);
                    sum = sum + n[i];
 
                    if(i == n.length - 1){
                        System.out.print(" = ");
                    }else{
                        System.out.print(" + ");
                    }
                }
 
                System.out.println(sum);
        }
        }while(Integer.parseInt(number) > -1);
    }
    }


