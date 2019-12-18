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
public class Menu4 extends Project_PrakAlpro {
    Scanner input = new Scanner (System.in);
    
    public void UIM4(){
        System.out.println("++++++++++ PILIH HARI YANG INGIN DITAMPILKAN ++++++++++");
        System.out.println("1. SENIN ");
        System.out.println("2. SELASA ");
        System.out.println("3. RABU ");
        System.out.println("4. KAMIS ");
        System.out.println("5. JUMAT ");
        System.out.println("6. SEMUA ");
        System.out.println("7. Kembali Ke Menu Utama");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }
    
    public void PilM4(){
        System.out.print("Masukkan Pilihan Anda : ");
        int i = input.nextInt();
        if(i==1){
            SENIN();
        }else if(i==2){
            SELASA();
        }else if (i==3){
            RABU();
        }else if (i==4){
            KAMIS();
        }else if (i==5){
            JUMAT();
        }else if (i==6){
            SEMUA();
        }else if(i==7){
            
        }else{
            PilM4();
        }
    }
    
    public void SENIN(){
        matrix[0][0]="MATA KULIAH";matrix[0][1]="WAKTU\t";matrix[0][2]="KELAS";matrix[0][3]="RUANG";matrix[0][4]="PENGAJAR";
        matrix[1][0]="========================================= SENIN ========================================"; 
        for(int bar=0;bar<=6;bar++){
            for(int kol=0;kol<=4;kol++){
                if(matrix[bar][kol]==null){
                }else{
                System.out.print("\t"+matrix[bar][kol]+"\t");
                }
            }
        System.out.println("");
        }
    }
    
    public void SELASA(){
        matrix[0][0]="MATA KULIAH";matrix[0][1]="WAKTU\t";matrix[0][2]="KELAS";matrix[0][3]="RUANG";matrix[0][4]="PENGAJAR";
        matrix[7][0]="========================================= SELASA ========================================"; 
        for(int bar=0;bar<1;bar++){
            for(int kol=0;kol<=4;kol++){
                System.out.print("\t"+matrix[bar][kol]+"\t");
            }
            System.out.println("");
        }
        for(int bar=7;bar<=12;bar++){
            for(int kol=0;kol<=4;kol++){
                if(matrix[bar][kol]==null){
                }else{
                System.out.print("\t"+matrix[bar][kol]+"\t");
                }
            }
        System.out.println("");
        }
    }
    
        public void RABU(){
        matrix[0][0]="MATA KULIAH";matrix[0][1]="WAKTU\t";matrix[0][2]="KELAS";matrix[0][3]="RUANG";matrix[0][4]="PENGAJAR";
        matrix[13][0]="========================================= RABU ========================================"; 
        for(int bar=0;bar<1;bar++){
            for(int kol=0;kol<=4;kol++){
                System.out.print("\t"+matrix[bar][kol]+"\t");
            }
            System.out.println("");
        }
        for(int bar=13;bar<=18;bar++){
            for(int kol=0;kol<=4;kol++){
                if(matrix[bar][kol]==null){
                }else{
                System.out.print("\t"+matrix[bar][kol]+"\t");
                }
            }
        System.out.println("");
        }
    }
    
        public void KAMIS(){
        matrix[0][0]="MATA KULIAH";matrix[0][1]="WAKTU\t";matrix[0][2]="KELAS";matrix[0][3]="RUANG";matrix[0][4]="PENGAJAR";
        matrix[19][0]="========================================= KAMIS ========================================"; 
        for(int bar=0;bar<1;bar++){
            for(int kol=0;kol<=4;kol++){
                System.out.print("\t"+matrix[bar][kol]+"\t");
            }
            System.out.println("");
        }
        for(int bar=19;bar<=24;bar++){
            for(int kol=0;kol<=4;kol++){
                if(matrix[bar][kol]==null){
                }else{
                System.out.print("\t"+matrix[bar][kol]+"\t");
                }
            }
        System.out.println("");
        }
    }
        
        public void JUMAT(){
        matrix[0][0]="MATA KULIAH";matrix[0][1]="WAKTU\t";matrix[0][2]="KELAS";matrix[0][3]="RUANG";matrix[0][4]="PENGAJAR";
        matrix[25][0]="========================================= JUMAT ========================================"; 
        for(int bar=0;bar<1;bar++){
            for(int kol=0;kol<=4;kol++){
                System.out.print("\t"+matrix[bar][kol]+"\t");
            }
            System.out.println("");
        }
        for(int bar=25;bar<=30;bar++){
            for(int kol=0;kol<=4;kol++){
                if(matrix[bar][kol]==null){
                }else{
                System.out.print("\t"+matrix[bar][kol]+"\t");
                }
            }
        System.out.println("");
        }
    }
    
    public void SEMUA(){
        matrix[0][0]="MATA KULIAH";matrix[0][1]="WAKTU\t";matrix[0][2]="KELAS";matrix[0][3]="RUANG";matrix[0][4]="PENGAJAR";
        matrix[1][0]="========================================= SENIN ========================================"; matrix[7][0]="========================================= SELASA ======================================="; matrix[13][0]="========================================= RABU ========================================="; matrix[19][0]="========================================= KAMIS ========================================"; matrix[25][0]="========================================= JUMAT ========================================"; 
        for(int bar=0;bar<matrix.length;bar++){
            for(int kol=0;kol<matrix[bar].length;kol++){
                if(matrix[bar][kol]==null){
                }else{
                System.out.print("\t"+matrix[bar][kol]+"\t");
                }
            }
        System.out.println("");
        }
    }
    
}