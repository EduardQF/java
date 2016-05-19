package matriz3x3;


import java.util.Scanner;
public class matriz3x3 {
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        
        int matriz [][];
        matriz = new int [3][3];
        
        matriz [0][0]= 1;
        matriz [0][1]= 2;
        matriz [1][0]= 3;
        matriz [1][1]= 4;
        matriz [2][1]= 5;
        matriz [2][2]= 6;
        
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
                System.out.print("Matriz["+i+"]["+j+"] = "+matriz [i][j]+" " );
            }
            System.out.println("");
             System.out.println("");
        }
        
    }
}
