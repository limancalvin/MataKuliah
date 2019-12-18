/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_prakalpro;

/**
 *
 * @author Liman
 */
public class Menu4 extends Project_PrakAlpro {
    
    public void Tampilan(){
        matrix[0][0]="MATA KULIAH";matrix[0][1]="WAKTU";matrix[0][2]="KELAS";matrix[0][3]="RUANG";matrix[0][4]="PENGAJAR";
        matrix[1][0]="\t\t\t\t\t\t\t ==================== SENIN =============== \t\t\t\t\t\t\t"; matrix[7][0]="\t\t\t\t\t\t\t ==================== SELASA =============== \t\t\t\t\t\t\t"; matrix[13][0]="\t\t\t\t\t\t\t ==================== RABU =============== \t\t\t\t\t\t\t"; matrix[20][0]="\t\t\t\t\t\t\t ==================== KAMIS =============== \t\t\t\t\t\t\t"; matrix[26][0]="\t\t\t\t\t\t\t ==================== JUMAT =============== \t\t\t\t\t\t\t"; 
        for(int bar=0;bar<matrix.length;bar++){
            for(int kol=0;kol<matrix[bar].length;kol++){
                if(matrix[bar][kol]==null){
                }else{
                System.out.print("|"+"\t"+matrix[bar][kol]+"\t"+"|"+"\t"+"\t");
                }
            }
        System.out.println("");
        }
    }
}