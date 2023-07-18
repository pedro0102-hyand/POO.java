import java.util.ArrayList;
public class Fatura {
    private ArrayList<Item>itens;
    public Fatura(String nome, String cpf){
        this.itens=new ArrayList<>();
    }
    public void adicionarItem(Item item){
        itens.add(item);
    }
    public double obterPreco(){
        double total=0;
        for(Item item: itens){
            total+=item.getPreco()*item.getQuantidade();
        }
        return total;
    }
}
class Item{
    private int quantidade;
    private double preco;
    private String nome;
    public Item(String nome, double preco, int quantidade){
        this.nome=nome;
        this.quantidade=quantidade;
        this.preco=preco;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade=quantidade;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco=preco;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
}

