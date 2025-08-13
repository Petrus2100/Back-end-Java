package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Cadastro;



public class CadastroDao {
	public void cadastrar(Cadastro cadastro) {
        String sql = "INSERT INTO usuarios (nome, email, telefone, senha) VALUES (?, ?, ?, ?)";

        try (Connection con = MySqlConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, cadastro.getNome());
            stmt.setString(2, cadastro.getEmail());
            stmt.setString(3, cadastro.getTelefone());
            stmt.setString(4, cadastro.getSenha());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
