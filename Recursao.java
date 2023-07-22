public class Recursao {
    public void a(){
        b();
    }
    public void b(){
        c();
    }
    public void c(){
        a();
    }
    public static void main(String[] args){
        Recursao recursao = new Recursao();
        recursao.a();
    }
}
