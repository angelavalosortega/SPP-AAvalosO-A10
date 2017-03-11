/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.aavaloso.a10;
import java.util.Scanner;
/**
 *
 * @author Angel Avalos
 */
public class SPPAAvalosOA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner kb=new Scanner(System.in);
        int b,v;
        v=0;
        System.out.println("Bienvenido a la suma, resta y multiplicacion de matrices. ");
        System.out.println("Introduzca el tamaño de sus matrices horizontal y verticalmente");
        b=solicitarEntero();
       
        
        int [][]matrixa=new int[b][b];
        int [][]matrixb=new int[b][b];
        int [][]matrixc=new int[b][b];
        
        System.out.println("Introduzca los numero de su primera matriz");
        matrixa = matrix (b);
        System.out.println("Introduzca los numeros de su segunda matriz");
        matrixb = matrix(b);
        sumaMatriz(matrixa,matrixb,matrixc);                       
        restaMatriz(matrixa,matrixb,matrixc); 
        multiplicacionMatrizab(matrixa,matrixb,matrixc); 
        multiplicacionMatrizba(matrixa,matrixb,matrixc); 
    }
public static int [][] matrix(int b) {
    int [][]array=new int[b][b];
    for (int i=0;i<array.length;i++)
    {
     for (int j=0;j<array.length;j++)
     {
        array[i][j]=solicitarEntero(); 
     }
    }
    return array;    
    
}    
public static int solicitarEntero(){
    Scanner kb= new Scanner(System.in);
    boolean flag;
    int n=0;
    do{
        System.out.println("Introduce un numero entero");
        try{
        n=kb.nextInt();
        flag =false;        
    }catch (Exception er){
            System.out.println("Intentelo de nuevo");
            flag=true;
            kb.nextLine();
    }
    } while(flag);
    return n;
    }
public static void sumaMatriz (int [][]matrixa,int [][]matrixb,int[][]matrixc){
    for (int i=0;i<matrixa.length;i++){
        for (int j=0;j<matrixa.length;j++){
           matrixc[i][j]=matrixa[i][j]+matrixb[i][j];
          System.out.println("La suma de las matrices en las coordenadas "+i+","+j+" es de "+matrixc[i][j]);
        }                                 
    }
}  
public static void restaMatriz (int [][]matrixa,int [][]matrixb,int[][]matrixc){
    for (int i=0;i<matrixa.length;i++){
        for (int j=0;j<matrixa.length;j++){
           matrixc[i][j]=matrixa[i][j]-matrixb[i][j];
          System.out.println("La resta de las matrices en las coordenadas "+i+","+j+" es de "+matrixc[i][j]);
        }                                 
    }
}
public static void multiplicacionMatrizab (int [][]matrixa,int [][]matrixb,int[][]matrixc){
    for (int i=0;i<matrixa.length;i++){
        for (int m=0;m<matrixb.length;m++){
            for (int j=0;j<matrixa.length;j++){
                for (int l=0;l<matrixb.length;l++){
                
                matrixc[i][j]=matrixa[i][j]*matrixb[i][j];
            System.out.println("La multiplicacion de las matrices en las coordenadas "+i+","+j+" es de "+matrixc[i][j]);
            }
            }
           
        }                                 
    }
}
public static void multiplicacionMatrizba (int [][]matrixa,int [][]matrixb,int[][]matrixc){
    for (int i=0;i<matrixc.length;i++){
        for (int j=0;j<matrixc.length;j++){
            for (int l=0;l<matrixc.length;l++){
                
                matrixc[i][j]+=(matrixa[i][l]*matrixb[l][j]);
            System.out.println("La multiplicacion de las matrices en las coordenadas "+i+","+j+" es de "+(matrixc[i][j]));
            
            }
           
        }                                 
    }
}
}
