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
public class Menu3 extends Project_PrakAlpro {
    Scanner input = new Scanner (System.in);
    
    public void UIM3(){
        System.out.println("\n---------- PILIH HARI YANG INGIN DI RESET ----------");
        System.out.println("1. SENIN ");
        System.out.println("2. SELASA ");
        System.out.println("3. RABU ");
        System.out.println("4. KAMIS ");
        System.out.println("5. JUMAT ");
        System.out.println("6. SEMUA ");
        System.out.println("7. Kembali Ke Menu Utama");
        System.out.println("---------------------------------------------------\n");
    }
    
    public void PilM3(){
        System.out.print("Masukkan Pilihan Anda : ");
        int i = input.nextInt();
        if(i==1){
            ClearSenin();
        }else if(i==2){
            ClearSelasa();
        }else if (i==3){
            ClearRabu();
        }else if (i==4){
            ClearKamis();
        }else if (i==5){
            ClearJumat();
        }else if (i==6){
            ClearSemua();
        }else if(i==7){
            
        }else{
            PilM3();
        }
    }
    
    public void ClearSenin(){
        UIulang();
        System.out.print("Masukkan Pilihan Anda : ");
        int i = input.nextInt();
        if (i==1){
            for(int bar=2;bar<=2;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN PERTAMA SUDAH DI RESET");
            System.out.println("DATA HARI SENIN SUDAH TERESET !!!\n");
        }else if(i==2){
            for(int bar=3;bar<=3;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN KEDUA SUDAH DI RESET");
            System.out.println("DATA HARI SENIN SUDAH TERESET !!!\n");
        }else if(i==3){
            for(int bar=4;bar<=4;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN KETIGA SUDAH DI RESET");
            System.out.println("DATA HARI SENIN SUDAH TERESET !!!\n");
        }else if(i==4){
            for(int bar=5;bar<=5;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN KEEMPAT SUDAH DI RESET");
            System.out.println("DATA HARI SENIN SUDAH TERESET !!!\n");
        }else if(i==5){
            for(int bar=6;bar<=6;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN KELIMA SUDAH DI RESET");
            System.out.println("DATA HARI SENIN SUDAH TERESET !!!\n");
        }else if(i==6){
            for(int bar=2;bar<=6;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA HARI SENIN SUDAH TERESET !!!\n");
        }else if(i==7){
            
        }else{
            ClearSenin();
        }
    }
    
    public void ClearSelasa(){
        UIulang();
        System.out.print("Masukkan Pilihan Anda : ");
        int i = input.nextInt();
        if (i==1){
            for(int bar=8;bar<=8;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN PERTAMA SUDAH DI RESET");
            System.out.println("DATA HARI SELASA SUDAH TERESET !!!\n");
        }else if(i==2){
            for(int bar=9;bar<=9;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN KEDUA SUDAH DI RESET");
            System.out.println("DATA HARI SELASA SUDAH TERESET !!!\n");
        }else if(i==3){
            for(int bar=10;bar<=10;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN KETIGA SUDAH DI RESET");
            System.out.println("DATA HARI SELASA SUDAH TERESET !!!\n");
        }else if(i==4){
            for(int bar=11;bar<=11;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN KEEMPAT SUDAH DI RESET");
            System.out.println("DATA HARI SELASA SUDAH TERESET !!!\n");
        }else if(i==5){
            for(int bar=12;bar<=12;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN KELIMA SUDAH DI RESET");
            System.out.println("DATA HARI SELASA SUDAH TERESET !!!\n");
        }else if(i==6){
            for(int bar=8;bar<=12;bar++){
            for(int kol=0;kol<=4;kol++){
                matrix[bar][kol]= null;
            }
        }
        System.out.println("DATA HARI SELASA SUDAH TERESET !!!\n");
        }else if(i==7){
            
        }else{
            ClearSelasa();
        }
    }
    
    public void ClearRabu(){
        UIulang();
        System.out.print("Masukkan Pilihan Anda : ");
        int i = input.nextInt();
        if (i==1){
            for(int bar=14;bar<=14;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN PERTAMA SUDAH DI RESET");
            System.out.println("DATA HARI RABU SUDAH TERESET !!!\n");
        }else if(i==2){
            for(int bar=15;bar<=15;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN KEDUA SUDAH DI RESET");
            System.out.println("DATA HARI RABU SUDAH TERESET !!!\n");
        }else if(i==3){
            for(int bar=16;bar<=16;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN KETIGA SUDAH DI RESET");
            System.out.println("DATA HARI RABU SUDAH TERESET !!!\n");
        }else if(i==4){
            for(int bar=17;bar<=17;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN KEEMPAT SUDAH DI RESET");
            System.out.println("DATA HARI RABU SUDAH TERESET !!!\n");
        }else if(i==5){
            for(int bar=18;bar<=18;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN KELIMA SUDAH DI RESET");
            System.out.println("DATA HARI RABU SUDAH TERESET !!!\n");
        }else if(i==6){
            for(int bar=14;bar<=18;bar++){
            for(int kol=0;kol<=4;kol++){
                matrix[bar][kol]= null;
            }
        }
        System.out.println("DATA HARI RABU SUDAH TERESET !!!\n");
        }else if(i==7){
            
        }else{
            ClearRabu();
        }
    }
    
    public void ClearKamis(){
        UIulang();
        System.out.print("Masukkan Pilihan Anda : ");
        int i = input.nextInt();
        if (i==1){
            for(int bar=20;bar<=20;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN PERTAMA SUDAH DI RESET");
            System.out.println("DATA HARI KAMIS SUDAH TERESET !!!\n");
        }else if(i==2){
            for(int bar=21;bar<=21;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN KEDUA SUDAH DI RESET");
            System.out.println("DATA HARI KAMIS SUDAH TERESET !!!\n");
        }else if(i==3){
            for(int bar=22;bar<=22;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN KETIGA SUDAH DI RESET");
            System.out.println("DATA HARI KAMIS SUDAH TERESET !!!\n");
        }else if(i==4){
            for(int bar=23;bar<=23;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN KEEMPAT SUDAH DI RESET");
            System.out.println("DATA HARI KAMIS SUDAH TERESET !!!\n");
        }else if(i==5){
            for(int bar=24;bar<=24;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN KELIMA SUDAH DI RESET");
            System.out.println("DATA HARI KAMIS SUDAH TERESET !!!\n");
        }else if(i==6){
            for(int bar=20;bar<=24;bar++){
                for(int kol=0;kol<=4;kol++){
                matrix[bar][kol]= null;
            }
        }
        System.out.println("DATA HARI KAMIS SUDAH TERESET !!!\n");
        }else if(i==7){
            
        }else{
            ClearKamis();
        }
    }
    
    public void ClearJumat(){
        UIulang();
        System.out.print("Masukkan Pilihan Anda : ");
        int i = input.nextInt();
        if (i==1){
            for(int bar=26;bar<=26;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN PERTAMA SUDAH DI RESET");
            System.out.println("DATA HARI JUMAT SUDAH TERESET !!!\n");
        }else if(i==2){
            for(int bar=27;bar<=27;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN KEDUA SUDAH DI RESET");
            System.out.println("DATA HARI JUMAT SUDAH TERESET !!!\n");
        }else if(i==3){
            for(int bar=28;bar<=28;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN KETIGA SUDAH DI RESET");
            System.out.println("DATA HARI JUMAT SUDAH TERESET !!!\n");
        }else if(i==4){
            for(int bar=29;bar<=29;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN KEEMPAT SUDAH DI RESET");
            System.out.println("DATA HARI JUMAT SUDAH TERESET !!!\n");
        }else if(i==5){
            for(int bar=30;bar<=30;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
                }
            }
            System.out.println("DATA MATKUL URUTAN KELIMA SUDAH DI RESET");
            System.out.println("DATA HARI JUMAT SUDAH TERESET !!!\n");
        }else if(i==6){
            for(int bar=26;bar<=30;bar++){
                for(int kol=0;kol<=4;kol++){
                    matrix[bar][kol]= null;
            }
        }
        System.out.println("DATA HARI JUMAT SUDAH TERESET !!!\n");
        }else if(i==7){
            
        }else{
            ClearJumat();
        }
    }

    public void ClearSemua(){
        for(int i=1;i<=25;i++){
            for(int j=0;j<=4;j++){
                if(j==0){
                    matrix[i][j]= null;
                }else if(j==1){
                    matrix[i][j]= null;
                }else if(j==2){
                    matrix[i][j]= null;    
                }else if(j==3){
                    matrix[i][j]= null;
                }else if(j==4){
                    matrix[i][j]= null;
                }
            }
        }
    }
    
    public void UIulang(){
        System.out.println("1. Matkul Urutan Pertama");
        System.out.println("2. Matkul Urutan Kedua");
        System.out.println("3. Matkul Urutan Ketiga");
        System.out.println("4. Matkul Urutan Keempat");
        System.out.println("5. Matkul Urutan Kelima");
        System.out.println("6. Hapus Semuannya");
        System.out.println("7. Kembali Ke Menu Awal");
    }
}
