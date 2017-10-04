
package inf008.persistencia.memory;

import inf008.contabil.Conta;
import inf008.persistencia.ContaDAO;
import inf008.util.ordenacao.Ordenador;

public class BalancoContabil implements ContaDAO{
    private Conta[] contas = new Conta[0];
    
    public void addConta(Conta conta){
        Conta[] novo = new Conta[this.contas.length + 1];
        for(int i = 0; i < this.contas.length; i++)
          novo[i] = contas[i];
        
        novo[novo.length - 1] =  conta;
        
        this.contas = novo;
        
    }    
    
    
    public Conta findByName(String nome){
        for(Conta atual : this.contas)
          if (atual.getNome().equals(nome))
            return atual;
        return null;  
    }    
    
    public void ajustar(String nomeContaCredito, String nomeContaDebito, double valor){
        this.findByName(nomeContaCredito).creditar(valor);
        this.findByName(nomeContaDebito).debitar(valor);        
    }  
    
    public String toString(){
        Ordenador ordenador = new Ordenador();
        ordenador.ordenar(this.contas);
        String rep = "";
        for(Conta atual : this.contas)
          rep += atual + "\n";
        return rep;  
    }


	@Override
	public void save(Conta conta) throws Exception {
		
		
	}


	@Override
	public void add(Conta conta) throws Exception {
				
	}


	@Override
	public void remove(Conta conta) throws Exception {
	
		
	}  
    
    
}
