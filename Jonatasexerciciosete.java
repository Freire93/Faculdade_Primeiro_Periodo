import java.util.*;

public class Jonatasexerciciosete{
    public static void main(String[]args){
        
        Scanner in = new Scanner(System.in);
        
        double base,altura,perimetro,area;
        
        System.out.print("Digite a base: ");
        base = in.nextDouble();
        System.out.print("Digite a altura: ");
        altura = in.nextDouble();
        
        perimetro = (base * 2) + (altura *2);
        area = base * altura;
        
        System.out.print("o perimetro e de :"+perimetro+" a area e de :"+area);
        
        
        
        
    }
}