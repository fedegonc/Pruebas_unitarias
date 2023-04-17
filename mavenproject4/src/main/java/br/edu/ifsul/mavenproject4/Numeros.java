

package br.edu.ifsul.mavenproject4;


public class Numeros {

    public int suma(int x, int y) {
       return x + y;   
    }
    
    public  boolean esPar(int x) {
       return x % 2 == 0;   
    }
    
    public  int areaCuadrado(int x) {
       return x * x;   
    }
    
    public  boolean esDivisible(int x, int y){
        return x % y == 0;
    }
}
