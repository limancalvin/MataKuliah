/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_prakalpro;
import java.util.Scanner;
/**
 *
 * @author liman
 */
public class Menu2 extends Project_PrakAlpro {
    Scanner input = new Scanner (System.in);
    private int x;
    
    public void UIM2(){
        System.out.println("=========== HARI ==========");
        System.out.println("1. SENIN ");
        System.out.println("2. SELASA ");
        System.out.println("3. RABU ");
        System.out.println("4. KAMIS ");
        System.out.println("5. JUMAT ");
        System.out.println("6. Kembali Ke Menu Utama");
        System.out.println("===========================");
    }
    
    public void PilUIM2(){
        System.out.print("Masukkan Pilihan Hari : ");
        int o = input.nextInt();
        if(o==1){
            if(matrix[2][0]==null){
                System.out.println("\nMaaf Data Masih Kosong !\nSilahkan Input Data Matkul Dahulu\n");
            }else{
            SumMatkul();
            Ulang();
            for(int i=2; i<=x+1;i++){
                System.out.println("========== SENIN ==========\n==========   "+(i-1)+"   ==========");
                for(int j=0;j<=4;j++){
                    Scanner input = new Scanner (System.in);
                    if(j==0){
                        System.out.print("Masukkan Mata Kuliah = ");
                        matrix[i][j]= input.nextLine();
                    }else if(j==1){
                        System.out.print("Masukkan Waktu Matkul = ");
                        matrix[i][j]= input.nextLine();
                    }else if(j==2){
                        System.out.print("Masukkan Kelas Anda = ");
                        matrix[i][j]= input.nextLine();    
                    }else if(j==3){
                        System.out.print("Masukkan Ruangan Matkul = ");
                        matrix[i][j]= input.nextLine();
                    }else if(j==4){
                        System.out.print("Masukkan Pengajar Matkul = ");
                        matrix[i][j]= input.nextLine();
                        System.out.println();
                    }
                }
            }                
            }
        }else if(o==2){
            if(matrix[2][0]==null){
                System.out.println("\nMaaf Data Masih Kosong !\nSilahkan Input Data Matkul Dahulu\n");
            }else{
                SumMatkul();
                Ulang();
                    for(int i=8; i<=x+7;i++){
                    System.out.println("========== SELASA ==========\n==========   "+(i-7)+"   ==========");
                        for(int j=0;j<=4;j++){
                            Scanner input = new Scanner (System.in);
                            if(j==0){
                                System.out.print("Masukkan Mata Kuliah = ");
                                matrix[i][j]= input.nextLine();
                            }else if(j==1){
                                System.out.print("Masukkan Waktu Matkul = ");
                                matrix[i][j]= input.nextLine();
                            }else if(j==2){
                                System.out.print("Masukkan Kelas Anda = ");
                                matrix[i][j]= input.nextLine();    
                            }else if(j==3){
                                System.out.print("Masukkan Ruangan Matkul = ");
                                matrix[i][j]= input.nextLine();
                            }else if(j==4){
                                System.out.print("Masukkan Pengajar Matkul = ");
                                matrix[i][j]= input.nextLine();
                                System.out.println();
                            }
                        }
                    }
                    }
        }else if (o==3){
            if(matrix[2][0]==null){
                System.out.println("\nMaaf Data Masih Kosong !\nSilahkan Input Data Matkul Dahulu\n");
            }else{
                SumMatkul();
                Ulang();
                    for(int i=14; i<=x+13;i++){
                    System.out.println("========== RABU ==========\n==========   "+(i-13)+"   ==========");
                        for(int j=0;j<=4+x;j++){
                            Scanner input = new Scanner (System.in);
                            if(j==0){
                                System.out.print("Masukkan Mata Kuliah = ");
                                matrix[i][j]= input.nextLine();
                            }else if(j==1){
                                System.out.print("Masukkan Waktu Matkul = ");
                                matrix[i][j]= input.nextLine();
                            }else if(j==2){
                                System.out.print("Masukkan Kelas Anda = ");
                                matrix[i][j]= input.nextLine();    
                            }else if(j==3){
                                System.out.print("Masukkan Ruangan Matkul = ");
                                matrix[i][j]= input.nextLine();
                            }else if(j==4){
                                System.out.print("Masukkan Pengajar Matkul = ");
                                matrix[i][j]= input.nextLine();
                                System.out.println();
                            }
                        }
                    }
            }
        }else if (o==4){
            if(matrix[2][0]==null){
                System.out.println("\nMaaf Data Masih Kosong !\nSilahkan Input Data Matkul Dahulu\n");
            }else{
                SumMatkul();
                Ulang();
                    for(int i=20; i<=x+19;i++){
                    System.out.println("========== KAMIS ==========\n==========   "+(i-19)+"   ==========");
                        for(int j=0;j<=4+x;j++){
                            Scanner input = new Scanner (System.in);
                            if(j==0){
                                System.out.print("Masukkan Mata Kuliah = ");
                                matrix[i][j]= input.nextLine();
                            }else if(j==1){
                                System.out.print("Masukkan Waktu Matkul = ");
                                matrix[i][j]= input.nextLine();
                            }else if(j==2){
                                System.out.print("Masukkan Kelas Anda = ");
                                matrix[i][j]= input.nextLine();    
                            }else if(j==3){
                                System.out.print("Masukkan Ruangan Matkul = ");
                                matrix[i][j]= input.nextLine();
                            }else if(j==4){
                                System.out.print("Masukkan Pengajar Matkul = ");
                                matrix[i][j]= input.nextLine();
                                System.out.println();
                            }
                        }
                    }
            }
        }else if (o==5){
            if(matrix[2][0]==null){
                System.out.println("\nMaaf Data Masih Kosong !\nSilahkan Input Data Matkul Dahulu\n");
            }else{
                SumMatkul();
                Ulang();
                    for(int i=26; i<=x+25;i++){
                    System.out.println("========== JUMAT ==========\n==========   "+(i-25)+"   ==========");
                        for(int j=0;j<=4;j++){
                            Scanner input = new Scanner (System.in);   
                            if(j==0){
                                System.out.print("Masukkan Mata Kuliah = ");
                                matrix[i][j]= input.nextLine();
                            }else if(j==1){
                                System.out.print("Masukkan Waktu Matkul = ");
                                matrix[i][j]= input.nextLine();
                            }else if(j==2){
                                System.out.print("Masukkan Kelas Anda = ");
                                matrix[i][j]= input.nextLine();    
                            }else if(j==3){
                                System.out.print("Masukkan Ruangan Matkul = ");
                                matrix[i][j]= input.nextLine();
                            }else if(j==4){
                                System.out.print("Masukkan Pengajar Matkul = ");
                                matrix[i][j]= input.nextLine();
                                System.out.println();
                            }
                        }
                    }
            }
        }else if (o==6){

        }else{
            PilUIM2();
        }
    }
    
    public void Ulang(){
        while(x>5|x<0){
            System.out.print("Masukan Ulang Matkul yang ingin diinputkan !!! = ");
            x = input.nextInt();
        }
    }
    
    public void SumMatkul(){
        System.out.print("Berapa Matkul Yang ingin Anda Inputkan (MAX 5) [0 = back] = ");
        x = input.nextInt();
    }
    
}
