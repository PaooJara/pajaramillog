package main;

public class Calculator {
    public static int multiplicar(int a,int b){
        return(a*b);
    }
    public static int dividir(int a,int b){
        if (b==0) {
            throw new IllegalArgumetnExceltion("Imposible dividir por 0 (cero)");
        }
        return(a/b);
    }
}
