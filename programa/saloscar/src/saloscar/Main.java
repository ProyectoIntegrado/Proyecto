package saloscar;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Main extends JFrame {

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
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setTitle("Clientes Saloscar");
		setBounds(100, 100, 519, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/imagenes/unnamed.png")));
		
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
				
				
				//Conectar sql
				Conexion cn = new Conexion();
				Connection miConexion = cn.getCn();

				try {
					Statement st = miConexion.createStatement();
					ResultSet rs = st.executeQuery("SELECT * FROM empleado where nombre='"+usuarios+"' AND password='"+password+"'");
					
					if (rs.next()) {
						JOptionPane.showMessageDialog(Main.this, "Bienvenido a Saloscar, "+rs.getString("nombre")+" "+rs.getString("apellido1")+" "+rs.getString("apellido2"));
						Principal principa1 = new Principal();
						principa1.setVisible(true);
						dispose();
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
		
		JButton btnNewButton_1 = new JButton("Borrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usuario.setText("");
				contrasena.setText("");
			}
		});
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(usuario, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(contrasena))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(33))
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
							.addGap(27)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton)
								.addComponent(btnNewButton_1)
								.addComponent(btnNewButton_2)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	
	}
}
