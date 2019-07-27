package com.example.faizan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner number=new Scanner(System.in);
        System.out.println("Input the vale of ''Z'' :");
        int z=number.nextInt();
        int z1=z*z;
        int y=0;
        BATMAN:
        for (int i=1;i<=z;i++){
            y++;
            int y1=y*y;
            int x=0;
            for (int j=1;j<=z1;j++){
                x++;
                int x1=x*x;
                if(z1==y1+x1){
                    System.out.println("Value of Z : "+z);
                    System.out.println("Value of Y : "+y);
                    System.out.println("Value of X : "+x);
                    break BATMAN;
                }
            }   for (int j=1;j<=z1;j++){
                x++;
                int x1=x*x;
                if (i==z & z1!=y1+x1){
                    System.out.println("NO X AND Y EXIST");
                    break BATMAN;
                }
            }
        }
    }
}
