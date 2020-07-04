package OCHO;

import java.util.Scanner;

public class POTENCIA {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        double numro,raiz;
        int num2;
        System.out.println("Ingresa cualquier numero: ");
        numro=x.nextInt();
        
        raiz= Math.cbrt(numro);
     
        num2 = (int) raiz;
        
        if(raiz-num2==0){
            System.out.println("Este numero es cubico");
        }
        
        else{
            System.out.println("Este numero no es cubico");
        } 
    }
        
    }
