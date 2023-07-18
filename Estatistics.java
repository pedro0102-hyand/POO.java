import java.util.Scanner;
import java.util.ArrayList;
public class Estatistics{
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int numero=scanner.nextInt();
            ArrayList<Double>amostras=new ArrayList<>();
            for(int i=0;i<numero;i++){
                double amostra=scanner.nextDouble();
                amostras.add(amostra);
            }
        }
    }
    public static double Media(ArrayList<Double>amostras){
        double soma=0;
        for(double amostra:amostras){
            soma=soma+amostra;
        }
        return soma/amostras.size();
    }
    public static double Desvio(ArrayList<Double>amostras, double media){
        double somaQuadrados=0;
        for(double amostra:amostras){
            somaQuadrados+=Math.pow(amostra-media,2);
        }
        double variancia=somaQuadrados/amostras.size();
        return Math.sqrt(variancia);
    }
}