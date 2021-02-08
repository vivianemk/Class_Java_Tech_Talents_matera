package aula24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonalDAO {

	public String criaNovoPersonal(String cref, String cpf, String nome, String inicio_atuacao, int codigo_localizacao, Connection conn) throws Exception {
		String query = "select * public.tb_personal";

		PreparedStatement insertConta = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
		insertConta.executeUpdate();
		
		ResultSet rsCodigo = insertConta.getGeneratedKeys();
		
		if (rsCodigo.next()) {
			String id = rsCodigo.getString("numero");
			return id;
		}

		throw new Exception("Erro ao criar uma nova conta");

	}

}
