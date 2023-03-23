package RamaCastro;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x,n;
        x=320;
        n=160;
        while(n<=x){
            System.out.print(x);
            System.out.print(" | ");
            x=x-20;
        }
    }
}
