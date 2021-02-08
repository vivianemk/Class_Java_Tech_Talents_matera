package aula24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ContaDAO {

	public String criaNovaConta(Integer codigoCliente, String numeroConta, Connection conn) throws Exception {
		String query = "insert into contas.tb_conta (numero, codigo_cliente) values (?, ?);";

		PreparedStatement insertConta = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
		insertConta.setString(1, numeroConta);
		insertConta.setInt(2, codigoCliente);

		insertConta.executeUpdate();

		ResultSet rsCodigo = insertConta.getGeneratedKeys();

		if (rsCodigo.next()) {
			String id = rsCodigo.getString("numero");
			return id;
		}

		throw new Exception("Erro ao criar uma nova conta");

	}

}
