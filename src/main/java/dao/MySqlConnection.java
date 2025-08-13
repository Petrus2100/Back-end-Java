package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {

	public static Connection getConnection() throws SQLException {
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        return DriverManager.getConnection(
	            "jdbc:mysql://localhost:3308/cadastro?useSSL=false&serverTimezone=UTC", 
	            "root", 
	            "123456"
	        );
	    } catch (ClassNotFoundException e) {
	        throw new SQLException("Driver não encontrado.", e);
	    } catch (SQLException e) {
	        throw new SQLException("Erro ao conectar no banco.", e);
	    }
	
        
        
        
    
    }
}
