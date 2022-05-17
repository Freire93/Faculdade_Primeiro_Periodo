import java.util.*;

public class Jonatasexercicioseis{
    public static void main(String []args){
        
    Scanner in = new Scanner(System.in);
    
    double salariofixo, vendas, total;
    
    System.out.print("Digite o salario fixo do trabahador: ");
        salariofixo = in.nextDouble();
    System.out.print("Digite o valor das vendsa realizadas: ");
        vendas = in.nextDouble();
        
        
        total = salariofixo + (vendas * 0.04);
        
    System.out.print("O salario a receber: "+total);    
        
        
        
    }
}