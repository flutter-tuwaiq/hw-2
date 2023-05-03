/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.printstars;

/**
 *
 * @author Shatha-althbiti
 */
import java.util.Scanner; 
public class PrintStars {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int rows=0;
        while(rows!=-1){
        System.out.println("(Note: to abort Enter -1), Enter a number:");
        rows=sc.nextInt();
        String star="";
        for(int i=0;i<rows;i++){
            if(i>=(rows/2)+1){
                star = star.substring(0, star.length()-1);

            }else{
                star+= "*";
            }
            System.out.println(star);

        }}
    }
}
