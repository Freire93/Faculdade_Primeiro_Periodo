import java.util.*;

public class Jonatasexercicio24{
    public static void main (String []args){
        
        Scanner in = new Scanner(System.in);
        
        double a,b,c,delta,x1,x2;
        
        System.out.println("Digite os valores de :");
        
        System.out.println("valor a :");
            a = in.nextDouble();
        
        System.out.println("valor B : ");
            b = in.nextDouble();
            
        System.out.println("valor C : ");
            c = in.nextDouble();
            
                delta = Math.pow(b,2) - 4 * a * c;
                if (delta < 0) {
                
                System.out.println("Delta negativo, não calcula!");
                    
                } else if (delta == 0){
                    x1 = (-b + Math.sqrt(delta)) / 2 * a;
                    
                    System.out.println("Delta igual a zero, uma unica raiz: " + x1);
                   
                } 
                
                else {
                        x1 = (-b + Math.sqrt(delta)) / 2 * a;
                        x2 = (-b - Math.sqrt(delta)) / 2 * a;
                
                        System.out.println("Os valores das raizes sao: "+ x1+" , "+ x2);
                }
            
    }
}