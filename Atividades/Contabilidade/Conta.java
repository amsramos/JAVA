
public class Conta implements Jsonable{

    private String nome;
    private double saldo;

    public Conta(String nome, double saldo){
       this.setNome(nome);
       this.setSaldo(saldo);
    }

    public String[] getValoresAtributos(){
        
    }

    public String[] getNomeAtributos(){

    }

    public int[] getTiposAtributos(){

    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void debitar(double valor){
        this.saldo -= valor;
    }

    public void creditar(double valor){
        this.saldo += valor;
    }

}