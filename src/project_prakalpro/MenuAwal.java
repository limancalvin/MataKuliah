/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_prakalpro;

import java.util.Scanner;

/**
 *
 * @author Liman
 */
public class MenuAwal {
    Scanner input = new Scanner (System.in);
    
    public void UI(){
        System.out.println("=========== MENU ==========");
        System.out.println("1. Input Data Matkul");
        System.out.println("2. Atur Data Matkul");
        System.out.println("3. Hapus Data Matkul");
        System.out.println("4. List Data Matkul");
        System.out.println("5. Exit");
    }
    
    public void PilMA(){
        System.out.print("Masukkan Pilihan Anda : ");
        int i = input.nextInt();
        if(i==1){
            Menu1 mn = new Menu1();
            mn.UIM1();
            mn.PilUIM1();
            UI();
            PilMA();
        }else if(i==2){
            Menu2 mn = new Menu2();
            mn.UIM2();
            mn.PilUIM2();
            UI();
            PilMA();
        }else if (i==3){
            Menu3 mn = new Menu3();
            mn.UIM3();
            mn.PilM3();
            UI();
            PilMA();
        }else if (i==4){
            Menu4 mn = new Menu4();
            mn.UIM4();
            mn.PilM4();
            UI();
            PilMA();
        }else if (i==5){
            System.out.println("----- ----- TERIMA KASIH ----- -----");
        }else{
            PilMA();
        }
    }
}
