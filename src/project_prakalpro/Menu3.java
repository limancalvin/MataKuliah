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
public class Menu3 extends Project_PrakAlpro {
    
    public void Clear(){
        for(int i=1;i<=25;i++){
            for(int j=0;j<=5;j++){
                if(j==0){
                    matrix[i][j]= "";
                }else if(j==1){
                    matrix[i][j]= "";
                }else if(j==2){
                    matrix[i][j]= "";    
                }else if(j==3){
                    matrix[i][j]= "";
                }else if(j==4){
                    matrix[i][j]= "";
                }
            }
        }
    }
}
