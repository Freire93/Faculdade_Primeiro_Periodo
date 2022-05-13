import java.util.*;

public class exercicio9{
    public static void main (String []args){

        Scanner in = new Scanner (System.in);

            int n,diagonal;

        System.out.print("Digite o numero de lados do poligono");
        n = in.nextInt();

            diagonal = n*(n-3)/2;

        System.out.print("O numero de diagonais presentes e: "+diagonal);



    }
}4