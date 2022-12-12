/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrary.lab;
import java.util.Scanner;
/**
 *
 * @author ORIGINAL
 */
public class ArraryLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       
        Scanner input=new Scanner(System.in);


   int transpose[][]=new int[3][3];

   int [][]arr=new int [3][3];
        for(int i=0 ; i<arr.length ;i++)
        {
        for(int j=0 ; j<arr[0].length ;j++)
        {
       System.out.println("the value of matrix row  "+ (i+1)+" colum  " +(j+1));   
   
        arr[i][j]= input.nextInt();
        }
            
        } 
        
       for(int i=0; i<arr.length;i++)
       {
       for(int j=0; j<arr[0].length;j++)
       {
           transpose [j][i]=arr[i][j];
       }
       }
        for (int[] transpose1 : transpose) {
            for (int col = 0; col<transpose[0].length; col++) {
                System.out.println(transpose1[col]);
            }
     }
        }
}
