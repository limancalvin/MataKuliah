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
public class Menu1 extends Project_PrakAlpro {
    Scanner input = new Scanner (System.in);
    private String mk,wkt,kls,rng,pngj;
    private int x;
    
    public void UIM1(){
        System.out.println("============= HARI =============");
        System.out.println("1.  SENIN ");
        System.out.println("2.  SELASA ");
        System.out.println("3.  RABU ");
        System.out.println("4.  KAMIS ");
        System.out.println("5.  JUMAT ");
        System.out.println("6. Kembali Ke Menu Utama");
        System.out.println("=========================");
    }
    
    public void PilUIM1(){
        System.out.print("Masukkan Pilihan Hari : ");
        int o = input.nextInt();
        if(o==1){
            System.out.print("Berapa Matkul Yang ingin Anda Inputkan (MAX 5) = ");
            x = input.nextInt();
            Ulang();
                for(int i=2; i<=x+1;i++){
                System.out.println("========== SENIN ==========\n==========   "+i+"   ==========");
                for(int j=0;j<=4;j++){
                        Scanner input = new Scanner (System.in);
                        if(j==0){
                            System.out.print("Masukkan Mata Kuliah = ");
                            matrix[i][j]= mk = input.nextLine();
                        }else if(j==1){
                            System.out.print("Masukkan Waktu Matkul = ");
                            matrix[i][j]= wkt=input.nextLine();
                        }else if(j==2){
                            System.out.print("Masukkan Kelas Anda = ");
                            matrix[i][j]= kls=input.nextLine();    
                        }else if(j==3){
                            System.out.print("Masukkan Ruangan Matkul = ");
                            matrix[i][j]= rng=input.nextLine();
                        }else if(j==4){
                            System.out.print("Masukkan Pengajar Matkul = ");
                            matrix[i][j]= pngj=input.nextLine();
                            System.out.println();
                        }
                    }
                }
        }else if(o==2){
                System.out.print("Berapa Matkul Yang ingin Anda Inputkan (MAX 5) = ");
                x = input.nextInt();
                Ulang();
                    for(int i=8; i<=x+7;i++){
                    System.out.println("========== SELASA ==========\n===== "+i+" =====");
                        for(int j=0;j<=4;j++){
                            Scanner input = new Scanner (System.in);
                            if(j==0){
                                System.out.print("Masukkan Mata Kuliah = ");
                                matrix[i][j]= mk = input.nextLine();
                            }else if(j==1){
                                System.out.print("Masukkan Waktu Matkul = ");
                                matrix[i][j]= wkt=input.nextLine();
                            }else if(j==2){
                                System.out.print("Masukkan Kelas Anda = ");
                                matrix[i][j]= kls=input.nextLine();    
                            }else if(j==3){
                                System.out.print("Masukkan Ruangan Matkul = ");
                                matrix[i][j]= rng=input.nextLine();
                            }else if(j==4){
                                System.out.print("Masukkan Pengajar Matkul = ");
                                matrix[i][j]= pngj=input.nextLine();
                                System.out.println();
                            }
                        }
                    }
        }else if (o==3){
                System.out.print("Berapa Matkul Yang ingin Anda Inputkan (MAX 5) = ");
                x = input.nextInt();
                Ulang();
                    for(int i=14; i<=x+13;i++){
                    System.out.println("========== RABU ==========\n===== "+i+" =====");
                        for(int j=01;j<4;j++){
                            Scanner input = new Scanner (System.in);
                            if(j==0){
                                System.out.print("Masukkan Mata Kuliah = ");
                                matrix[i][j]= mk = input.nextLine();
                            }else if(j==1){
                                System.out.print("Masukkan Waktu Matkul = ");
                                matrix[i][j]= wkt=input.nextLine();
                            }else if(j==2){
                                System.out.print("Masukkan Kelas Anda = ");
                                matrix[i][j]= kls=input.nextLine();    
                            }else if(j==3){
                                System.out.print("Masukkan Ruangan Matkul = ");
                                matrix[i][j]= rng=input.nextLine();
                            }else if(j==4){
                                System.out.print("Masukkan Pengajar Matkul = ");
                                matrix[i][j]= pngj=input.nextLine();
                                System.out.println();
                            }
                        }
                    }
        }else if (o==4){
                System.out.print("Berapa Matkul Yang ingin Anda Inputkan (MAX 5) = ");
                x = input.nextInt();
                Ulang();
                    for(int i=21; i<=x+20;i++){
                    System.out.println("========== KAMIS ==========\n===== "+i+" =====");
                        for(int j=0;j<=4+x;j++){
                            Scanner input = new Scanner (System.in);
                            if(j==0){
                                System.out.print("Masukkan Mata Kuliah = ");
                                matrix[i][j]= mk = input.nextLine();
                            }else if(j==1){
                                System.out.print("Masukkan Waktu Matkul = ");
                                matrix[i][j]= wkt=input.nextLine();
                            }else if(j==2){
                                System.out.print("Masukkan Kelas Anda = ");
                                matrix[i][j]= kls=input.nextLine();    
                            }else if(j==3){
                                System.out.print("Masukkan Ruangan Matkul = ");
                                matrix[i][j]= rng=input.nextLine();
                            }else if(j==4){
                                System.out.print("Masukkan Pengajar Matkul = ");
                                matrix[i][j]= pngj=input.nextLine();
                                System.out.println();
                            }
                        }
                    }
        }else if (o==5){
                System.out.print("Berapa Matkul Yang ingin Anda Inputkan (MAX 5) = ");
                x = input.nextInt();
                Ulang();
                    for(int i=27; i<=x+26;i++){
                    System.out.println("========== JUMAT ==========\n===== "+i+" =====");
                        for(int j=21;j<=20+x;j++){
                            Scanner input = new Scanner (System.in);
                            if(j==0){
                                System.out.print("Masukkan Mata Kuliah = ");
                                matrix[i][j]= mk = input.nextLine();
                            }else if(j==1){
                                System.out.print("Masukkan Waktu Matkul = ");
                                matrix[i][j]= wkt=input.nextLine();
                            }else if(j==2){
                                System.out.print("Masukkan Kelas Anda = ");
                                matrix[i][j]= kls=input.nextLine();    
                            }else if(j==3){
                                System.out.print("Masukkan Ruangan Matkul = ");
                                matrix[i][j]= rng=input.nextLine();
                            }else if(j==4){
                                System.out.print("Masukkan Pengajar Matkul = ");
                                matrix[i][j]= pngj=input.nextLine();
                                System.out.println();
                            }
                        }
                    }
        }else if (o==6){

        }else{
            UIM1();
            PilUIM1();
        }
    }
    
    public void Ulang(){
        while(x>5){
            System.out.print("Masukan Ulang Matkul yang ingin diinputkan !!! = ");
            x = input.nextInt();
        }
    }
}