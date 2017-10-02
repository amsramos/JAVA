
package balanco.contabil;

public class BalancoContabil{
    private Conta[] contas = new Conta[0];
    
    public void addConta(Conta conta){
        Conta[] novo = new Conta[this.contas.length + 1];
        for(int i = 0; i < this.contas.length; i++)
          novo[i] = contas[i];
        
        novo[novo.length - 1] =  conta;
        
        this.contas = novo;
        
    }    
    
    
    public Conta encontrarContaPeloNome(String nome){
        for(Conta atual : this.contas)
          if (atual.getNome().equals(nome))
            return atual;
        return null;  
    }    
    
    public void ajustar(String nomeContaCredito, String nomeContaDebito, double valor){
        this.encontrarContaPeloNome(nomeContaCredito).creditar(valor);
        this.encontrarContaPeloNome(nomeContaDebito).debitar(valor);        
    }  
    
    public String toString(){
        Ordenador ordenador = new Ordenador();
        ordenador.ordenar(this.contas);
        String rep = "";
        for(Conta atual : this.contas)
          rep += atual + "\n";
        return rep;  
    }    
    
    
}
