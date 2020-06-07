package saloscar;

import java.sql.*;

import javax.swing.JOptionPane;

public class Conexion {
	private Connection cn = null;
	
	public Conexion() {
		try {
			//cn = DriverManager.getConnection ("jdbc:mysql://saloscar.cf:3306/saloscar_saloscar?autoReconnect=true&useSSL=false","saloscar", "EnNk7zY39NZY");
			cn = DriverManager.getConnection ("jdbc:mysql://saloscar.cf:3306/saloscar_saloscar?autoReconnect=true&useSSL=false","saloscar", "EnNk7zY39NZY");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al conectar las base de Datos \n\n "+ e.getMessage());
			e.printStackTrace();
		}
	}
	public Connection getCn() {
		return cn;
	}
}

