package inf008.persistencia;
import java.sql.SQLException;

import inf008.contabil.Conta;

public interface ContaDAO {
	
	public void save(Conta conta) throws Exception;
	
	public void add(Conta conta) throws Exception;
	
	public void remove(Conta conta) throws Exception;

	public void ajustar(String nomeContaCredito, String nomeContaDebito, double valor);

	public Conta findByName(String nomeContaCredito) throws SQLException;
	
}
