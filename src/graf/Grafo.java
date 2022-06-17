/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graf;

/**
 *
 * @author Torrev_101
 */
public class Grafo {
    public static void main(String [] args){
        int grafo[][]={{0,1,0},
                       {0,0,1},
                       {1,0,0}};
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(grafo[i][j]==1){
                    //armar grafo
                }             
            }
        }        
    }
}
class Nodo{
    Nodo ed;
    int dato;
    Nodo ei;
}