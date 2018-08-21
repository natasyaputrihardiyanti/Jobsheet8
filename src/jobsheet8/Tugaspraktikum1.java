/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;

import java.util.Scanner;

/**
 *
 * @author Tasya
 */
public class Tugaspraktikum1 {
    public static void main(String[]args){
        //membuat variable dan scanner
        boolean running = true ;
        int counter= 0;
        String jawab;
        Scanner scan = new Scanner (System.in);
        
        while (running){
            System.out.println("apakah anda yakin keluar ? :" );
            System.out.print ("jawab [ya/tidak]>");
            
            jawab = scan.nextLine();
            //cek jwbn
            if (jawab.equalsIgnoreCase("ya")){
                running= false;
                        }
            counter++;
        }
        System.out.println("Anda sudah melakukan perulangan sebanyak " +counter +"kali");
        
            
            }
        }
    