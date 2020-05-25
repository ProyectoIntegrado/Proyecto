package saloscar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Conexion;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

@SuppressWarnings("serial")
public class usuario extends JFrame {

	private JPanel contentPane;
	private JTextField usuario;
	private JPasswordField contrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					usuario frame = new usuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public usuario() {
		setResizable(false);
		setTitle("Clientes Saloscar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(usuario.class.getResource("/imagenes/unnamed.png")));
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		usuario = new JTextField();
		usuario.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		contrasena = new JPasswordField();
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuarios = usuario.getText();
				char[] contrasenas = contrasena.getPassword();
				
				
				String password = new String(contrasenas); 
				Comercial comercial = new Comercial();
				
				//Conectar sql
				Conexion cn = new Conexion();
				Connection miConexion = cn.getCn();

				try {
					Statement st = miConexion.createStatement();
					ResultSet rs = st.executeQuery("SELECT * FROM usuarios where usuario='"+usuarios+"' AND contrasena='"+password+"'");
					
					if (rs.next()) {
						JOptionPane.showMessageDialog(usuario.this, "Bienvenido a Saloscar, "+rs.getString("nombre")+" "+rs.getString("apellidos"));
						comercial.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null, "Error usuario y contraseña","Error",JOptionPane.ERROR_MESSAGE);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Error al conectar las base de Datos \n\n  ","",JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
				

					
			
			
			}
		});
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(usuario, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnNewButton)
								.addComponent(lblNewLabel_2))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(contrasena)
								.addComponent(btnNewButton_1))))
					.addGap(12))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(28)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(usuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2)
								.addComponent(contrasena, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(36)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton)
								.addComponent(btnNewButton_1)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
