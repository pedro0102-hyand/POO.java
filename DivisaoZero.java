public class DivisaoZero {
    public static void main(String[] args){
        try{
            int resul=dividir(10,0);
            System.out.println("Resultado:"+resul);
        }catch(ArithmeticException ex){
            System.out.println("Erro de dividao por zero"+ex.getMessage());
        }
    }
    public static int dividir(int num, int div){
        return num/div;
    }
}
