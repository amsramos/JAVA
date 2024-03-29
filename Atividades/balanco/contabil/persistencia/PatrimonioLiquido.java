package balanco.contabil;;

public class PatrimonioLiquido extends Conta{
    
    public PatrimonioLiquido(int id, String nome, double saldo){
        super(id, nome, saldo);
    }    
    
    public PatrimonioLiquido(int id, String nome){
        this(id, nome, 0);
    }     
    

    public void debitar(double valor){
        this.saldo -= valor;
    }    

    public void creditar(double valor){
        this.saldo += valor;        
    }  
    
    public String getTipo(){
        return "PL";
    }        
    
}