import java.util.*;

public class Jonatasexercicio8{
    public static void main (String []args){
        
        Scanner in = new Scanner(System.in);
        
        float baseMaior, baseMenor, Altura, area, valorMedio, valorLote;
        
        System.out.print("Digite a base Maior: ");
            baseMaior = in.nextFloat();
        System.out.print("Digite a base menor: ");
            baseMenor = in.nextFloat();
        System.out.print("Digite a altura: ");
            Altura = in.nextFloat();
            
            area = ((baseMenor + baseMaior) * Altura) / 2;
            
        System.out.print("Digite o valor medio do metro quadrado: ");
            valorMedio = in.nextFloat();
            
            valorLote = area * valorMedio;
            
        System.out.print("O valor do lote vale: " +valorLote);    
    }
}