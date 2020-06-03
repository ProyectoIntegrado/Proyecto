package saloscar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;
import com.toedter.calendar.JCalendar;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class Principal extends JFrame {
	private JPanel contentPane;
	private JTextField Comercial_nombre;
	private JTextField Comercial_apellido1;
	private JTextField Comercial_apellido2;
	private JTextField Comercial_dni_nif;
	private JTextField Comercial_telefono;
	private JTextField Comercial_email;
	private JTable table;
	private JTextField Cliente_nombre;
	private JTextField Cliente_apellido1;
	private JTextField Cliente_apellido2;
	private JTextField Cliente_dni_nif;
	private JTextField Cliente_direccion;
	private JTextField Cliente_poblacion;
	private JTextField Cliente_telefono;
	private JTextField Cliente_email;
	private JTable table_1;
	private JTextField Coche_matricula;
	private JTextField Coche_color;
	private JTextField Coche_numero_puertos;
	private JTable table_2;
	private JTable table_3;
	private JTextField Coche_marca;
	private JTextField Coche_modelo;
	private JTextField Alquiler_matricula;
	private JTextField Taller_matricula;
	
	private ResultSet rsEmpleados;
	private ResultSet rsCliente;
	private ResultSet rsCoche;
	private ResultSet rsAlquiler;
	private ResultSet rsTaller;
	private JButton Comercial_seguente;
	private JCheckBox Taller_acetie;
	private JDateChooser Coche_fecha_matriculacion;
	private JDateChooser Alquiler_fecha_aquilar;
	private JDateChooser Alquiler_fecha_entrega;
	private JDateChooser Taller_entrada;
	private JDateChooser Taller_sailda;
	private JCheckBox Taller_frenos;
	private JCheckBox Taller_ruedos;
	private JCheckBox Taller_pintura;
	private JCheckBox Taller_bujias;
	private JCheckBox Taller_filrros;
	
	int lineaComer = 1;
	int lineaCliente = 1;
	int lineaCoche = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	@SuppressWarnings("unchecked")
	public Principal() {
		setTitle("Saloscar");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/imagenes/unnamed.png")));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int Answer = JOptionPane.showConfirmDialog(null, "¿Estás segura de que quieres salir?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	            if (Answer == JOptionPane.YES_OPTION) {
	                System.exit(0);
	            }
			}
			@Override
			public void windowOpened(WindowEvent arg0) {
				Comercial_seguente.setEnabled(false);
				Conexion cn = new Conexion();
				Connection miConexion = cn.getCn();
				
				try {
					PreparedStatement PstEmpleado = miConexion.prepareStatement("SELECT * FROM empleado");
					rsEmpleados = PstEmpleado.executeQuery();
					
					if(rsEmpleados.next()){
						Comercial c = new Comercial();
						c.setNombre(rsEmpleados.getString("nombre"));
						Comercial_nombre.setText(c.getNombre());
						c.setApellido1(rsEmpleados.getString("apellido1"));
						Comercial_apellido1.setText(c.getApellido1());
						c.setApellido2(rsEmpleados.getString("apellido2"));
						Comercial_apellido2.setText(c.getApellido2());
						c.setDni(rsEmpleados.getString("dniEmpleado"));
						Comercial_dni_nif.setText(c.getDni());
						c.setTelefono(rsEmpleados.getInt("tlf"));
						Comercial_telefono.setText(c.getTelefono());
						c.setEmail(rsEmpleados.getString("email"));
						Comercial_email.setText(c.getEmail());
						Comercial_seguente.setEnabled(true);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					PreparedStatement PstCliente = miConexion.prepareStatement("SELECT * FROM cliente");
					rsCliente = PstCliente.executeQuery();
					
					if(rsCliente.next()){
						Cliente cl = new Cliente();
						cl.setNombre(rsCliente.getString("nombre"));
						Cliente_nombre.setText(cl.getNombre());
						cl.setApellido1(rsCliente.getString("apellido1"));
						Cliente_apellido1.setText(cl.getApellido1());
						cl.setApellido2(rsCliente.getString("apellido2"));
						Cliente_apellido2.setText(cl.getApellido2());
						cl.setDni(rsCliente.getString("dniCliente"));
						Cliente_dni_nif.setText(cl.getDni());
						cl.setTelefono(rsCliente.getInt("tlf"));
						Cliente_telefono.setText(cl.getTelefono());
						cl.setEmail(rsCliente.getString("email"));
						Cliente_email.setText(cl.getEmail());
						cl.setDireccion(rsCliente.getString("direccion"));
						Cliente_direccion.setText(cl.getDireccion());
						cl.setPoblacion(rsCliente.getString("poblacion"));
						Cliente_poblacion.setText(cl.getPoblacion());
						Comercial_seguente.setEnabled(true);
				}
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					PreparedStatement PstCoche = miConexion.prepareStatement("SELECT * FROM cocheventa");
					rsCoche = PstCoche.executeQuery();
					
					if(rsCoche.next()){
						Coche co = new Coche();
						co.setMatricula(rsCoche.getString("matriculaCoche"));
						Coche_matricula.setText(co.getMatricula());
						co.setModelo(rsCoche.getString("modelo"));
						Coche_modelo.setText(co.getModelo());
						co.setMarca(rsCoche.getString("marca"));
						Coche_marca.setText(co.getMarca());
						co.setColor(rsCoche.getString("color"));
						Coche_color.setText(co.getColor());
						co.setNumPuertas(rsCoche.getInt("puertas"));
						Coche_numero_puertos.setText(co.getNumPuertas());
						co.setFechaMat(""+rsCoche.getDate("fechaMatriculacion"));
						Coche_fecha_matriculacion.setDate(rsCoche.getDate("fechaMatriculacion"));
						Comercial_seguente.setEnabled(true);
				}
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				try {
					PreparedStatement PstAlquiler = miConexion.prepareStatement("SELECT * FROM fechaalquiler, cochealquiler");
					rsAlquiler = PstAlquiler.executeQuery();
					
					if(rsAlquiler.next()){
						Alquiler a = new Alquiler();
						a.setMatricula(rsAlquiler.getString("matriculaAlquiler"));
						Alquiler_matricula.setText(a.getMatricula());
						a.setFechaAlq(""+rsAlquiler.getDate("fechaSalida"));
						Alquiler_fecha_aquilar.setDate(rsAlquiler.getDate("fechaSalida"));
						a.setFechaEnt(""+rsAlquiler.getDate("fechaEntrada"));
						Alquiler_fecha_entrega.setDate(rsAlquiler.getDate("fechaEntrada"));
						Comercial_seguente.setEnabled(true);
				}
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				try {
					PreparedStatement PstTaller = miConexion.prepareStatement("SELECT * FROM reparaciones, cliente");
					rsTaller = PstTaller.executeQuery();
					
					if(rsTaller.next()){
						Taller t = new Taller();
						t.setMatricula(rsTaller.getString("matriculaReparacion"));
						Taller_matricula.setText(t.getMatricula());
//						t.setCliente(rsTaller.getString("cliente.nombre"));
//						Taller_cliente.setText(t.getCliente());
						t.setFechaSal(""+rsTaller.getDate("fechaSalida"));
						Taller_sailda.setDate(rsTaller.getDate("fechaSalida"));
						t.setFechaEnt(""+rsTaller.getDate("fechaEntrada"));
						Taller_entrada.setDate(rsTaller.getDate("fechaEntrada"));
						if(rsTaller.getInt("aceite")==1) {
							t.setAceite(true);
						}else {t.setAceite(false);}
						Taller_acetie.setSelected(t.isAceite());
						if(rsTaller.getInt("ruedas")==1) {
							t.setRuedas(true);
						}else {t.setRuedas(false);}
						Taller_ruedos.setSelected(t.isRuedas());
						if(rsTaller.getInt("pintura")==1) {
							t.setPintura(true);
						}else {t.setPintura(false);}
						Taller_pintura.setSelected(t.isPintura());
						if(rsTaller.getInt("frenos")==1) {
							t.setFrenos(true);
						}else {t.setFrenos(false);}
						Taller_frenos.setSelected(t.isFrenos());
						if(rsTaller.getInt("bujias")==1) {
							t.setBujia(true);
						}else {t.setBujia(false);}
						Taller_bujias.setSelected(t.isBujia());
						if(rsTaller.getInt("filtro")==1) {
							t.setFiltro(true);
						}else {t.setFiltro(false);}
						Taller_filrros.setSelected(t.isFiltro());
						Comercial_seguente.setEnabled(true);
				}
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}});

		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 900, 590);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel.add(tabbedPane);
		
		JPanel Comercial = new JPanel();
		tabbedPane.addTab("Comercial", new ImageIcon(Principal.class.getResource("/imagenes/iconmonstr-id-card-9-32.png")), Comercial, null);
		Comercial.setLayout(new MigLayout("", "[100px][100px][100px][100px][100px][100px,grow][100px][100px,grow][100px][100px]", "[-14.00][][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][][81.00][20px:n][]"));
		
		JLabel lblNewLabel = new JLabel("Comercial");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Comercial.add(lblNewLabel, "cell 0 0 5 2,alignx center");
		
		JLabel lblNewLabel_8 = new JLabel("Buscar");
		lblNewLabel_8.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/iconmonstr-magnifier-4-32.png")));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setForeground(Color.BLUE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Comercial.add(lblNewLabel_8, "cell 5 1 5 1,alignx center");
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		Comercial.add(lblNewLabel_1, "cell 0 2,alignx left");
		
		Comercial_nombre = new JTextField();
		Comercial_nombre.setColumns(10);
		Comercial.add(Comercial_nombre, "cell 1 2 4 1,growx,aligny center");
		
		JLabel lblNewLabel_9 = new JLabel("Consultas sobre comercial");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Comercial.add(lblNewLabel_9, "cell 5 2 5 1,alignx center");
		
		JLabel lblNewLabel_2 = new JLabel("Apellido 1");
		Comercial.add(lblNewLabel_2, "cell 0 3,alignx left");
		
		Comercial_apellido1 = new JTextField();
		Comercial_apellido1.setColumns(10);
		Comercial.add(Comercial_apellido1, "cell 1 3 4 1,growx");
		
		JLabel lblNewLabel_10 = new JLabel("Consultas comercial");
		Comercial.add(lblNewLabel_10, "cell 5 3 2 1,alignx right");
		
		JComboBox Comercial_consultas = new JComboBox();
		Comercial.add(Comercial_consultas, "cell 7 3 3 1,growx");
		
		JLabel lblNewLabel_3 = new JLabel("Apellido 2");
		Comercial.add(lblNewLabel_3, "cell 0 4,alignx left");
		
		Comercial_apellido2 = new JTextField();
		Comercial_apellido2.setColumns(10);
		Comercial.add(Comercial_apellido2, "cell 1 4 4 1,growx");
		
		JScrollPane scrollPane = new JScrollPane();
		Comercial.add(scrollPane, "cell 5 4 5 8,grow");
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"DNI/NIF", "Nombre", "Apellidos", "Telefono", "E-mail", "Empleado"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_4 = new JLabel("DNI/NIF");
		Comercial.add(lblNewLabel_4, "cell 0 5,alignx left");
		
		Comercial_dni_nif = new JTextField();
		Comercial_dni_nif.setColumns(10);
		Comercial.add(Comercial_dni_nif, "cell 1 5 4 1,growx");
		
		JLabel lblNewLabel_5 = new JLabel("Telefono");
		Comercial.add(lblNewLabel_5, "cell 0 6,alignx left");
		
		Comercial_telefono = new JTextField();
		Comercial_telefono.setColumns(10);
		Comercial.add(Comercial_telefono, "cell 1 6 4 1,growx");
		
		JLabel lblNewLabel_6 = new JLabel("E-mail");
		Comercial.add(lblNewLabel_6, "cell 0 7,alignx left");
		
		Comercial_email = new JTextField();
		Comercial_email.setColumns(10);
		Comercial.add(Comercial_email, "cell 1 7 4 1,growx");
		
		JButton Comercial_anterior = new JButton("Anterior");
		Comercial_anterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					try {
						if(rsEmpleados.previous()){
							lineaComer--;
							System.out.println(lineaComer);
							Comercial c = new Comercial();
							c.setNombre(rsEmpleados.getString("nombre"));
							Comercial_nombre.setText(c.getNombre());
							c.setApellido1(rsEmpleados.getString("apellido1"));
							Comercial_apellido1.setText(c.getApellido1());
							c.setApellido2(rsEmpleados.getString("apellido2"));
							Comercial_apellido2.setText(c.getApellido2());
							c.setDni(rsEmpleados.getString("dniEmpleado"));
							Comercial_dni_nif.setText(c.getDni());
							c.setTelefono(rsEmpleados.getInt("tlf"));
							Comercial_telefono.setText(c.getTelefono());
							c.setEmail(rsEmpleados.getString("email"));
							Comercial_email.setText(c.getEmail());
							Comercial_seguente.setEnabled(true);
						}else {
							rsEmpleados.next();
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		});
		Comercial.add(Comercial_anterior, "cell 0 12,growx");
		
		JButton Comercial_enviar = new JButton("Enviar");
		Comercial_enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conexion cn = new Conexion();
				Connection miConexion = cn.getCn();
				PreparedStatement PstEmpleado;
				PreparedStatement PstEnviarEmpleado;
				try {
					PstEmpleado = miConexion.prepareStatement("SELECT * FROM empleado");
					rsEmpleados = PstEmpleado.executeQuery();
					rsEmpleados.next();
					PstEnviarEmpleado = miConexion.prepareStatement("UPDATE empleado SET nombre = ?, apellido1 = ?, apellido2 = ?, dniEmpleado = ?, tlf = ?, email = ? WHERE codEmpleado = ?");
					PstEnviarEmpleado.setString(1,  Comercial_nombre.getText());
					PstEnviarEmpleado.setString(2,  Comercial_apellido1.getText());
					PstEnviarEmpleado.setString(3,  Comercial_apellido2.getText());
					PstEnviarEmpleado.setString(4,  Comercial_dni_nif.getText());
					PstEnviarEmpleado.setString(5,  Comercial_telefono.getText());
					PstEnviarEmpleado.setString(6,  Comercial_email.getText());
					PstEnviarEmpleado.setInt(7,  lineaComer);
					PstEnviarEmpleado.executeUpdate();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		Comercial.add(Comercial_enviar, "cell 1 12,growx");
		
		JButton Comercial_editar = new JButton("Editar");
		Comercial.add(Comercial_editar, "cell 2 12,growx");
		
		JButton Comercial_borrar = new JButton("Borrar");
		Comercial_borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comercial c = new Comercial();
				c.setNombre("");
				Comercial_nombre.setText("");
				c.setApellido1("");
				Comercial_apellido1.setText("");
				c.setApellido2("");
				Comercial_apellido2.setText("");
				c.setDni("");
				Comercial_dni_nif.setText("");
				c.setTelefono(0);
				Comercial_telefono.setText("");
				c.setEmail("");
				Comercial_email.setText("");
				Comercial_seguente.setEnabled(true);
				
			}
		});
		Comercial.add(Comercial_borrar, "cell 3 12,growx");
		
		Comercial_seguente = new JButton("Siguiente");
		Comercial_seguente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(rsEmpleados.next()){
						lineaComer++;
						System.out.println(lineaComer);
						Comercial c = new Comercial();
						c.setNombre(rsEmpleados.getString("nombre"));
						Comercial_nombre.setText(c.getNombre());
						c.setApellido1(rsEmpleados.getString("apellido1"));
						Comercial_apellido1.setText(c.getApellido1());
						c.setApellido2(rsEmpleados.getString("apellido2"));
						Comercial_apellido2.setText(c.getApellido2());
						c.setDni(rsEmpleados.getString("dniEmpleado"));
						Comercial_dni_nif.setText(c.getDni());
						c.setTelefono(rsEmpleados.getInt("tlf"));
						Comercial_telefono.setText(c.getTelefono());
						c.setEmail(rsEmpleados.getString("email"));
						Comercial_email.setText(c.getEmail());
						Comercial_seguente.setEnabled(true);
					}else {
						rsEmpleados.previous();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Comercial.add(Comercial_seguente, "cell 4 12,growx");
		
		JButton Comercial_salir = new JButton("Salir");
		Comercial_salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Answer = JOptionPane.showConfirmDialog(null, "¿Estás segura de que quieres salir?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	            if (Answer == JOptionPane.YES_OPTION) {
	                System.exit(0);
	            }
				
			}
		});
		Comercial.add(Comercial_salir, "cell 9 12,growx");
		
		JPanel Cliente = new JPanel();
		tabbedPane.addTab("Cliente", new ImageIcon(Principal.class.getResource("/imagenes/iconmonstr-id-card-9-32.png")), Cliente, null);
		Cliente.setLayout(new MigLayout("", "[100px][100px,grow][100px][100px][100px][100px,grow][100px][100px,grow][100px][100px]", "[][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n]"));
		
		JLabel lblNewLabel_12 = new JLabel("Cliente ");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Cliente.add(lblNewLabel_12, "cell 0 0 5 1,alignx center");
		
		JLabel lblNewLabel_8_1 = new JLabel("Buscar");
		lblNewLabel_8_1.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/iconmonstr-magnifier-4-32.png")));
		lblNewLabel_8_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_1.setForeground(Color.BLUE);
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Cliente.add(lblNewLabel_8_1, "cell 5 0 5 1,alignx center");
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre");
		Cliente.add(lblNewLabel_1_1, "cell 0 1,alignx left");
		
		Cliente_nombre = new JTextField();
		Cliente_nombre.setColumns(10);
		Cliente.add(Cliente_nombre, "cell 1 1 4 1,grow");
		
		JLabel lblNewLabel_9_1 = new JLabel("Consultas sobre Clientes");
		lblNewLabel_9_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Cliente.add(lblNewLabel_9_1, "cell 5 1 5 1,growx");
		
		JLabel lblNewLabel_2_1 = new JLabel("Apellido 1");
		Cliente.add(lblNewLabel_2_1, "cell 0 2,alignx left");
		
		Cliente_apellido1 = new JTextField();
		Cliente_apellido1.setColumns(10);
		Cliente.add(Cliente_apellido1, "cell 1 2 4 1,grow");
		
		JLabel lblNewLabel_10_1 = new JLabel("Consultas clientes");
		Cliente.add(lblNewLabel_10_1, "cell 5 2 2 1,alignx right");
		
		JComboBox Cliente_consultas = new JComboBox();
		Cliente.add(Cliente_consultas, "cell 7 2 3 1,growx");
		
		JLabel lblNewLabel_3_1 = new JLabel("Apellido 2");
		Cliente.add(lblNewLabel_3_1, "cell 0 3,alignx left");
		
		Cliente_apellido2 = new JTextField();
		Cliente_apellido2.setColumns(10);
		Cliente.add(Cliente_apellido2, "cell 1 3 4 1,grow");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		Cliente.add(scrollPane_1, "cell 5 3 5 9,grow");
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"DNI/NIF", "Nombre", "Apellidos", "Direcci\u00F3n", "Poblaci\u00F3n", "Telefono", "Fecha Nacimiento"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("DNI/NIF");
		Cliente.add(lblNewLabel_4_1, "cell 0 4,alignx left");
		
		Cliente_dni_nif = new JTextField();
		Cliente_dni_nif.setColumns(10);
		Cliente.add(Cliente_dni_nif, "cell 1 4 4 1,grow");
		
		JLabel lblNewLabel_5_1 = new JLabel("Direcci\u00F3n ");
		Cliente.add(lblNewLabel_5_1, "cell 0 5,alignx left");
		
		Cliente_direccion = new JTextField();
		Cliente_direccion.setColumns(10);
		Cliente.add(Cliente_direccion, "cell 1 5 4 1,grow");
		
		JLabel lblNewLabel_6_1 = new JLabel("Poblaci\u00F3n");
		Cliente.add(lblNewLabel_6_1, "cell 0 6,alignx left");
		
		Cliente_poblacion = new JTextField();
		Cliente_poblacion.setColumns(10);
		Cliente.add(Cliente_poblacion, "cell 1 6 4 1,grow");
		
		JLabel lblNewLabel_7_1 = new JLabel("Telefono");
		Cliente.add(lblNewLabel_7_1, "cell 0 7,alignx left");
		
		Cliente_telefono = new JTextField();
		Cliente_telefono.setColumns(10);
		Cliente.add(Cliente_telefono, "cell 1 7 4 1,grow");
		
		JLabel lblNewLabel_13 = new JLabel("E-mail");
		Cliente.add(lblNewLabel_13, "cell 0 8,alignx left");
		
		Cliente_email = new JTextField();
		Cliente_email.setColumns(10);
		Cliente.add(Cliente_email, "cell 1 8 4 1,grow");
		
		JButton Cliente_anterior = new JButton("Anterior");
		Cliente_anterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(rsCliente.previous()){
						lineaComer--;
						Cliente cl = new Cliente();
						cl.setNombre(rsCliente.getString("nombre"));
						Cliente_nombre.setText(cl.getNombre());
						cl.setApellido1(rsCliente.getString("apellido1"));
						Cliente_apellido1.setText(cl.getApellido1());
						cl.setApellido2(rsCliente.getString("apellido2"));
						Cliente_apellido2.setText(cl.getApellido2());
						cl.setDni(rsCliente.getString("dniCliente"));
						Cliente_dni_nif.setText(cl.getDni());
						cl.setTelefono(rsCliente.getInt("tlf"));
						Cliente_telefono.setText(cl.getTelefono());
						cl.setEmail(rsCliente.getString("email"));
						Cliente_email.setText(cl.getEmail());
						cl.setDireccion(rsCliente.getString("direccion"));
						Cliente_direccion.setText(cl.getDireccion());
						cl.setPoblacion(rsCliente.getString("poblacion"));
						Cliente_poblacion.setText(cl.getPoblacion());
						Comercial_seguente.setEnabled(true);
}
					else {
						rsCliente.next();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Cliente.add(Cliente_anterior, "cell 0 12,growx");
		
		JButton Cliente_enviar = new JButton("Enviar");
		Cliente_enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conexion cn = new Conexion();
				Connection miConexion = cn.getCn();
				PreparedStatement PstCliente;
				PreparedStatement PstEnviarCliente;
				try {
					PstCliente = miConexion.prepareStatement("SELECT * FROM empleado");
					rsEmpleados = PstCliente.executeQuery();
					rsEmpleados.next();
					PstEnviarCliente = miConexion.prepareStatement("UPDATE cliente SET nombre = ?, apellido1 = ?, apellido2 = ?, dniCliente = ?, tlf = ?, email = ?, poblacion = ?, direccion = ? WHERE codCliente = ?");
					PstEnviarCliente.setString(1,  Cliente_nombre.getText());
					PstEnviarCliente.setString(2,  Cliente_apellido1.getText());
					PstEnviarCliente.setString(3,  Cliente_apellido2.getText());
					PstEnviarCliente.setString(4,  Cliente_dni_nif.getText());
					PstEnviarCliente.setString(5,  Cliente_telefono.getText());
					PstEnviarCliente.setString(6,  Cliente_email.getText());
					PstEnviarCliente.setString(7,  Cliente_poblacion.getText());
					PstEnviarCliente.setString(8,  Cliente_direccion.getText());
					PstEnviarCliente.setInt(9,  lineaCliente);
					PstEnviarCliente.executeUpdate();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Cliente.add(Cliente_enviar, "cell 1 12,growx");
		
		JButton Cliente_editar = new JButton("Editar");
		Cliente.add(Cliente_editar, "cell 2 12,growx");
		
		JButton Cliente_borrar = new JButton("Borrar");
		Cliente_borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cl = new Cliente();
				cl.setNombre(null);
				Cliente_nombre.setText(null);
				cl.setApellido1(null);
				Cliente_apellido1.setText(null);
				cl.setApellido2(null);
				Cliente_apellido2.setText(null);
				cl.setDni(null);
				Cliente_dni_nif.setText(null);
				cl.setTelefono(0);
				Cliente_telefono.setText(null);
				cl.setEmail(null);
				Cliente_email.setText(null);
				cl.setDireccion(null);
				Cliente_direccion.setText(null);
				cl.setPoblacion(null);
				Cliente_poblacion.setText(null);
				Comercial_seguente.setEnabled(true);
			}
		});
		Cliente.add(Cliente_borrar, "cell 3 12,growx");
		
		JButton Cliente_seguente = new JButton("Siguiente");
		Cliente_seguente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(rsCliente.next()){
						lineaComer++;
						Cliente cl = new Cliente();
						cl.setNombre(rsCliente.getString("nombre"));
						Cliente_nombre.setText(cl.getNombre());
						cl.setApellido1(rsCliente.getString("apellido1"));
						Cliente_apellido1.setText(cl.getApellido1());
						cl.setApellido2(rsCliente.getString("apellido2"));
						Cliente_apellido2.setText(cl.getApellido2());
						cl.setDni(rsCliente.getString("dniCliente"));
						Cliente_dni_nif.setText(cl.getDni());
						cl.setTelefono(rsCliente.getInt("tlf"));
						Cliente_telefono.setText(cl.getTelefono());
						cl.setEmail(rsCliente.getString("email"));
						Cliente_email.setText(cl.getEmail());
						cl.setDireccion(rsCliente.getString("direccion"));
						Cliente_direccion.setText(cl.getDireccion());
						cl.setPoblacion(rsCliente.getString("poblacion"));
						Cliente_poblacion.setText(cl.getPoblacion());
						Comercial_seguente.setEnabled(true);
				}
					else {
						rsCliente.previous();
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Cliente.add(Cliente_seguente, "cell 4 12,growx");
		
		JButton Cliente_salir = new JButton("Salir");
		Cliente_salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Answer = JOptionPane.showConfirmDialog(null, "¿Estás segura de que quieres salir?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	            if (Answer == JOptionPane.YES_OPTION) {
	                System.exit(0);
	            }
			}
		});
		Cliente.add(Cliente_salir, "cell 9 12,growx");
		
		JPanel Coche = new JPanel();
		tabbedPane.addTab("Coche", new ImageIcon(Principal.class.getResource("/imagenes/iconmonstr-car-3-32.png")), Coche, null);
		Coche.setLayout(new MigLayout("", "[100px][100px,grow][100px][100px][100px][100px,grow][100px][100px,grow][100px][100px]", "[30.00px:n,fill][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n]"));
		
		JLabel lblNewLabel_14 = new JLabel("Coche");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Coche.add(lblNewLabel_14, "cell 0 0 5 1,growx");
		
		JLabel lblNewLabel_8_2 = new JLabel("Buscar");
		lblNewLabel_8_2.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/iconmonstr-magnifier-4-32.png")));
		lblNewLabel_8_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_2.setForeground(Color.BLUE);
		lblNewLabel_8_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Coche.add(lblNewLabel_8_2, "cell 5 0 5 1,grow");
		
		JLabel lblNewLabel_1_2 = new JLabel("Matr\u00EDcula");
		Coche.add(lblNewLabel_1_2, "cell 0 1,alignx left");
		
		Coche_matricula = new JTextField();
		Coche_matricula.setColumns(10);
		Coche.add(Coche_matricula, "cell 1 1 4 1,grow");
		
		JLabel lblNewLabel_9_2 = new JLabel("Consultas sobre coche");
		lblNewLabel_9_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Coche.add(lblNewLabel_9_2, "cell 5 1 5 1,grow");
		
		JLabel lblNewLabel_2_2 = new JLabel("Marca");
		Coche.add(lblNewLabel_2_2, "cell 0 2,alignx left");
		
		Coche_marca = new JTextField();
		Coche.add(Coche_marca, "cell 1 2 4 1,growx");
		Coche_marca.setColumns(10);
		
		JLabel lblNewLabel_10_2 = new JLabel("Consultas coche");
		Coche.add(lblNewLabel_10_2, "cell 5 2 2 1,alignx right");
		
		JComboBox Coche_consultas = new JComboBox();
		Coche.add(Coche_consultas, "cell 7 2 3 1,growx");
		
		JLabel lblNewLabel_3_2 = new JLabel("Modelo ");
		Coche.add(lblNewLabel_3_2, "cell 0 3,alignx left");
		
		Coche_modelo = new JTextField();
		Coche.add(Coche_modelo, "cell 1 3 4 1,growx");
		Coche_modelo.setColumns(10);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		Coche.add(scrollPane_2, "cell 5 3 5 9,grow");
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Matricula", "Marca", "Modelo", "Fecha matriculacion"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("Fecha Matriculaci\u00F3n");
		Coche.add(lblNewLabel_4_2, "cell 0 4,alignx left");
		
		Coche_fecha_matriculacion = new JDateChooser();
		Coche.add(Coche_fecha_matriculacion, "cell 1 4 4 1,grow");
		
		JLabel lblNewLabel_5_2 = new JLabel("Color");
		Coche.add(lblNewLabel_5_2, "cell 0 5,alignx left");
		
		Coche_color = new JTextField();
		Coche_color.setColumns(10);
		Coche.add(Coche_color, "cell 1 5 4 1,grow");
		
		JLabel lblNewLabel_6_2 = new JLabel("Numero de puertas");
		Coche.add(lblNewLabel_6_2, "cell 0 6,alignx left");
		
		Coche_numero_puertos = new JTextField();
		Coche_numero_puertos.setColumns(10);
		Coche.add(Coche_numero_puertos, "cell 1 6 4 1,grow");
		
		JButton Coche_anterior = new JButton("Anterior");
		Coche_anterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(rsCoche.previous()){
						lineaCoche--;
						Coche co = new Coche();
						co.setMatricula(rsCoche.getString("matriculaCoche"));
						Coche_matricula.setText(co.getMatricula());
						co.setModelo(rsCoche.getString("modelo"));
						Coche_modelo.setText(co.getModelo());
						co.setMarca(rsCoche.getString("marca"));
						Coche_marca.setText(co.getMarca());
						co.setColor(rsCoche.getString("color"));
						Coche_color.setText(co.getColor());
						co.setNumPuertas(rsCoche.getInt("puertas"));
						Coche_numero_puertos.setText(co.getNumPuertas());
						co.setFechaMat(""+rsCoche.getDate("fechaMatriculacion"));
						Coche_fecha_matriculacion.setDate(rsCoche.getDate("fechaMatriculacion"));
						Comercial_seguente.setEnabled(true);
}
					else {
						rsCoche.next();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Coche.add(Coche_anterior, "cell 0 12,growx");
		
		JButton Coche_enviar = new JButton("Enviar");
		Coche_enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conexion cn = new Conexion();
				Connection miConexion = cn.getCn();
				PreparedStatement PstCoche;
				PreparedStatement PstEnviarCoche;
				try {
					PstCoche = miConexion.prepareStatement("SELECT * FROM empleado");
					rsEmpleados = PstCoche.executeQuery();
					rsEmpleados.next();

					PstEnviarCoche = miConexion.prepareStatement("UPDATE cocheventa SET matriculaCoche = ?, modelo = ?, marca = ?, color = ?, puertas = ?, fechaMatriculacion = ? WHERE codCliente = ?");
					PstEnviarCoche.setString(1,  Coche_matricula.getText());
					PstEnviarCoche.setString(2,  Coche_modelo.getText());
					PstEnviarCoche.setString(3,  Coche_marca.getText());
					PstEnviarCoche.setString(4,  Coche_color.getText());
					PstEnviarCoche.setString(5,  Coche_numero_puertos.getText());
					PstEnviarCoche.setString(6,  ""+Coche_fecha_matriculacion.getDate());
					PstEnviarCoche.setInt(7,  lineaCoche);
					PstEnviarCoche.executeUpdate();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Coche.add(Coche_enviar, "cell 1 12,growx");
		
		JButton Coche_editar = new JButton("Editar");
		Coche.add(Coche_editar, "cell 2 12,growx");
		
		JButton Coche_borrar = new JButton("Borrar");
		Coche_borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Coche co = new Coche();
				co.setMatricula("");
				Coche_matricula.setText("");
				co.setModelo("");
				Coche_modelo.setText("");
				co.setMarca("");
				Coche_marca.setText("");
				co.setColor("");
				Coche_color.setText("");
				co.setNumPuertas(0);
				Coche_numero_puertos.setText("");
				co.setFechaMat("");
				Coche_fecha_matriculacion.setDate(null);
				Comercial_seguente.setEnabled(true);
			}
		});
		Coche.add(Coche_borrar, "cell 3 12,growx");
		
		JButton Coche_siguente = new JButton("Siguiente");
		Coche_siguente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(rsCoche.next()){
						lineaCoche++;
						Coche co = new Coche();
						co.setMatricula(rsCoche.getString("matriculaCoche"));
						Coche_matricula.setText(co.getMatricula());
						co.setModelo(rsCoche.getString("modelo"));
						Coche_modelo.setText(co.getModelo());
						co.setMarca(rsCoche.getString("marca"));
						Coche_marca.setText(co.getMarca());
						co.setColor(rsCoche.getString("color"));
						Coche_color.setText(co.getColor());
						co.setNumPuertas(rsCoche.getInt("puertas"));
						Coche_numero_puertos.setText(co.getNumPuertas());
						co.setFechaMat(""+rsCoche.getDate("fechaMatriculacion"));
						Coche_fecha_matriculacion.setDate(rsCoche.getDate("fechaMatriculacion"));
						Comercial_seguente.setEnabled(true);
				}else {
					rsCoche.previous();
				}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Coche.add(Coche_siguente, "cell 4 12,growx");
		
		JButton Coche_salir = new JButton("Salir");
		Coche_salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Answer = JOptionPane.showConfirmDialog(null, "¿Estás segura de que quieres salir?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	            if (Answer == JOptionPane.YES_OPTION) {
	                System.exit(0);
	            }
			}
		});
		Coche.add(Coche_salir, "cell 9 12,growx");
		
		JPanel Alquiler = new JPanel();
		tabbedPane.addTab("Alquiler", new ImageIcon(Principal.class.getResource("/imagenes/iconmonstr-book-5-32.png")), Alquiler, null);
		Alquiler.setLayout(new MigLayout("", "[100px][100px,grow][100px][100px][100px][100px,grow][100px][100px][100px][100px]", "[20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n]"));
		
		JLabel lblNewLabel_15 = new JLabel("A\u00F1adir reserva alquiler");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Alquiler.add(lblNewLabel_15, "cell 0 0 5 1,growx");
		
		JLabel lblNewLabel_8_3 = new JLabel("Fecha");
		lblNewLabel_8_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_3.setForeground(Color.BLUE);
		lblNewLabel_8_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Alquiler.add(lblNewLabel_8_3, "cell 5 0 5 1,growx");
		
		JLabel lblNewLabel_1_3 = new JLabel("Cliente");
		Alquiler.add(lblNewLabel_1_3, "cell 0 1,alignx left");
		
		JComboBox Alquiler_cliente = new JComboBox();
		Alquiler.add(Alquiler_cliente, "cell 1 1 4 1,growx");
		Conexion cn = new Conexion();
		Connection miConexion = cn.getCn();
		
		try {
			Statement s = miConexion.createStatement();
			ResultSet rs = s.executeQuery ("SELECT * FROM cliente");
			while (rs.next())
			{

				Alquiler_cliente.addItem(rs.getString("nombre")+" "+rs.getString("apellido1")+" "+rs.getString("apellido2")  );
			}
			
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		
		
		JCalendar calendar = new JCalendar();
		Alquiler.add(calendar, "cell 5 1 5 11,grow");
		
		JLabel lblNewLabel_2_3 = new JLabel("Matr\u00EDcula");
		Alquiler.add(lblNewLabel_2_3, "cell 0 2,alignx left");
		
		Alquiler_matricula = new JTextField();
		Alquiler.add(Alquiler_matricula, "cell 1 2 4 1,growx");
		Alquiler_matricula.setColumns(10);
		
		JLabel lblNewLabel_3_3 = new JLabel("Fecha alquiler");
		Alquiler.add(lblNewLabel_3_3, "cell 0 3,alignx left");
		
		Alquiler_fecha_aquilar = new JDateChooser();
		Alquiler.add(Alquiler_fecha_aquilar, "cell 1 3 4 1,grow");
		
		JLabel lblNewLabel_4_3 = new JLabel("Fecha entrega");
		Alquiler.add(lblNewLabel_4_3, "cell 0 4,alignx left");
		
		Alquiler_fecha_entrega = new JDateChooser();
		Alquiler.add(Alquiler_fecha_entrega, "cell 1 4 4 1,grow");
		
		JButton Alquiler_anterior = new JButton("Anterior");
		Alquiler_anterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(rsAlquiler.previous()){
						Alquiler a = new Alquiler();
						a.setMatricula(rsAlquiler.getString("matriculaAlquiler"));
						Alquiler_matricula.setText(a.getMatricula());
						a.setFechaAlq(""+rsAlquiler.getDate("fechaSalida"));
						Alquiler_fecha_aquilar.setDate(rsAlquiler.getDate("fechaSalida"));
						a.setFechaEnt(""+rsAlquiler.getDate("fechaEntrada"));
						Alquiler_fecha_entrega.setDate(rsAlquiler.getDate("fechaEntrada"));
						Comercial_seguente.setEnabled(true);
}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Alquiler.add(Alquiler_anterior, "cell 0 12,growx");
		
		JButton Alquiler_enviar = new JButton("Enviar");
		Alquiler.add(Alquiler_enviar, "cell 1 12,growx");
		
		JButton Alquiler_editar = new JButton("Editar");
		Alquiler.add(Alquiler_editar, "cell 2 12,growx");
		
		JButton Alquiler_borrar = new JButton("Borrar");
		Alquiler_borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alquiler a = new Alquiler();
				a.setMatricula(null);
				Alquiler_matricula.setText(null);
				a.setFechaAlq(null);
				Alquiler_fecha_aquilar.setDate(null);
				a.setFechaEnt(null);
				Alquiler_fecha_entrega.setDate(null);
				Comercial_seguente.setEnabled(true);
			}
		});
		Alquiler.add(Alquiler_borrar, "cell 3 12,growx");
		
		JButton Alquiler_siguente = new JButton("Siguiente");
		Alquiler_siguente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(rsAlquiler.next()){
						Alquiler a = new Alquiler();
						a.setMatricula(rsAlquiler.getString("matriculaAlquiler"));
						Alquiler_matricula.setText(a.getMatricula());
						a.setFechaAlq(""+rsAlquiler.getDate("fechaSalida"));
						Alquiler_fecha_aquilar.setDate(rsAlquiler.getDate("fechaSalida"));
						a.setFechaEnt(""+rsAlquiler.getDate("fechaEntrada"));
						Alquiler_fecha_entrega.setDate(rsAlquiler.getDate("fechaEntrada"));
						Comercial_seguente.setEnabled(true);
				}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Alquiler.add(Alquiler_siguente, "cell 4 12,growx");
		
		JButton Alquiler_salir = new JButton("Salir");
		Alquiler_salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Answer = JOptionPane.showConfirmDialog(null, "¿Estás segura de que quieres salir?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	            if (Answer == JOptionPane.YES_OPTION) {
	                System.exit(0);
	            }
			}
		});
		Alquiler.add(Alquiler_salir, "cell 9 12,growx");
		
		JPanel Taller = new JPanel();
		tabbedPane.addTab("Taller", new ImageIcon(Principal.class.getResource("/imagenes/iconmonstr-wrench-24-32.png")), Taller, null);
		Taller.setLayout(new MigLayout("", "[100px][100px,grow][100px][100px][100px][100px,grow][100px][100px,grow][100px][100px]", "[38.00px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][13.00px:n][20px:n]"));
		
		JLabel lblNewLabel_16 = new JLabel("Cliente Taller");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Taller.add(lblNewLabel_16, "cell 0 0 5 1,growx");
		
		JLabel lblNewLabel_8_4 = new JLabel("Buscar");
		lblNewLabel_8_4.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/iconmonstr-magnifier-4-32.png")));
		lblNewLabel_8_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_4.setForeground(Color.BLUE);
		lblNewLabel_8_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Taller.add(lblNewLabel_8_4, "cell 5 0 5 1,growx");
		
		JLabel lblNewLabel_1_4 = new JLabel("Cliente");
		Taller.add(lblNewLabel_1_4, "cell 0 1,alignx left");
		
		JComboBox Taller_cliente = new JComboBox();
		Taller.add(Taller_cliente, "cell 1 1 4 1,growx");
		
		JLabel lblNewLabel_9_3 = new JLabel("Consultas sobre Taller");
		lblNewLabel_9_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Taller.add(lblNewLabel_9_3, "cell 5 1 5 1,growx");
		
		JLabel lblNewLabel_2_4 = new JLabel("Matr\u00EDcula");
		Taller.add(lblNewLabel_2_4, "cell 0 2,alignx left");
		
		Taller_matricula = new JTextField();
		Taller.add(Taller_matricula, "cell 1 2 4 1,growx");
		Taller_matricula.setColumns(10);
		
		JLabel lblNewLabel_10_3 = new JLabel("Consultas Taller");
		Taller.add(lblNewLabel_10_3, "cell 5 2 2 1,alignx right");
		
		JComboBox Taller_consultar = new JComboBox();
		Taller.add(Taller_consultar, "cell 7 2 3 1,growx");
		
		JLabel lblNewLabel_3_4 = new JLabel("Fecha entrada");
		Taller.add(lblNewLabel_3_4, "cell 0 3");
		
		Taller_entrada = new JDateChooser();
		Taller.add(Taller_entrada, "cell 1 3 4 1,grow");
		
		JScrollPane scrollPane_3 = new JScrollPane();
		Taller.add(scrollPane_3, "cell 5 3 5 9,grow");
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cliente", "Marricula", "Fecha entrada", "Fecha salida"
			}
		));
		scrollPane_3.setViewportView(table_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Fecha Salida");
		Taller.add(lblNewLabel_4_4, "cell 0 4");
		
		Taller_sailda = new JDateChooser();
		Taller.add(Taller_sailda, "cell 1 4 4 1,grow");
		
		Taller_acetie = new JCheckBox("Aceite");
		Taller.add(Taller_acetie, "cell 0 5");
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/WhatsApp Image 2020-05-20 at 21.43.26.jpeg")));
		Taller.add(lblNewLabel_17, "cell 1 5 4 6,alignx center,aligny center");
		
		Taller_frenos = new JCheckBox("Frenos");
		Taller.add(Taller_frenos, "cell 0 6");
		
		Taller_ruedos = new JCheckBox("Ruedos");
		Taller.add(Taller_ruedos, "cell 0 7");
		
		Taller_pintura = new JCheckBox("Pintura");
		Taller.add(Taller_pintura, "cell 0 8");
		
		Taller_bujias = new JCheckBox("Buj\u00EDas");
		Taller.add(Taller_bujias, "cell 0 9");
		
		Taller_filrros = new JCheckBox("Filtros");
		Taller.add(Taller_filrros, "cell 0 10");
		
		JButton Taller_anterior = new JButton("Anterior");
		Taller_anterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(rsTaller.previous()){
						Taller t = new Taller();
						t.setMatricula(rsTaller.getString("matriculaReparacion"));
						Taller_matricula.setText(t.getMatricula());
//					t.setCliente(rsTaller.getString("cliente.nombre"));
//					Taller_cliente.setText(t.getCliente());
						t.setFechaSal(""+rsTaller.getDate("fechaSalida"));
						Taller_sailda.setDate(rsTaller.getDate("fechaSalida"));
						t.setFechaEnt(""+rsTaller.getDate("fechaEntrada"));
						Taller_entrada.setDate(rsTaller.getDate("fechaEntrada"));
						if(rsTaller.getInt("aceite")==1) {
							t.setAceite(true);
						}else {t.setAceite(false);}
						Taller_acetie.setSelected(t.isAceite());
						if(rsTaller.getInt("ruedas")==1) {
							t.setRuedas(true);
						}else {t.setRuedas(false);}
						Taller_ruedos.setSelected(t.isRuedas());
						if(rsTaller.getInt("pintura")==1) {
							t.setPintura(true);
						}else {t.setPintura(false);}
						Taller_pintura.setSelected(t.isPintura());
						if(rsTaller.getInt("frenos")==1) {
							t.setFrenos(true);
						}else {t.setFrenos(false);}
						Taller_frenos.setSelected(t.isFrenos());
						if(rsTaller.getInt("bujias")==1) {
							t.setBujia(true);
						}else {t.setBujia(false);}
						Taller_bujias.setSelected(t.isBujia());
						if(rsTaller.getInt("filtro")==1) {
							t.setFiltro(true);
						}else {t.setFiltro(false);}
						Taller_filrros.setSelected(t.isFiltro());
						Comercial_seguente.setEnabled(true);
}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Taller.add(Taller_anterior, "cell 0 12,growx");
		
		JButton taller_enviar = new JButton("Enviar");
		Taller.add(taller_enviar, "cell 1 12,growx");
		
		JButton Taller_editar = new JButton("Editar");
		Taller.add(Taller_editar, "cell 2 12,growx");
		
		JButton Taller_borrar = new JButton("Borrar");
		Taller_borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Taller t = new Taller();
					t.setMatricula(null);
					Taller_matricula.setText(null);
//					t.setCliente(null);
//					Taller_cliente.setText(null);
					t.setFechaSal(null);
					Taller_sailda.setDate(null);
					t.setFechaEnt(null);
					Taller_entrada.setDate(null);
					Taller_acetie.setSelected(false);
					Taller_ruedos.setSelected(false);
					Taller_pintura.setSelected(false);
					Taller_frenos.setSelected(false);
					Taller_bujias.setSelected(false);
					Taller_filrros.setSelected(false);
					Comercial_seguente.setEnabled(true);
		}});
		Taller.add(Taller_borrar, "cell 3 12,growx");
		
		JButton Taller_siguente = new JButton("Siguiente");
		Taller_siguente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(rsTaller.next()){
						Taller t = new Taller();
						t.setMatricula(rsTaller.getString("matriculaReparacion"));
						Taller_matricula.setText(t.getMatricula());
//						t.setCliente(rsTaller.getString("cliente.nombre"));
//						Taller_cliente.setText(t.getCliente());
						t.setFechaSal(""+rsTaller.getDate("fechaSalida"));
						Taller_sailda.setDate(rsTaller.getDate("fechaSalida"));
						t.setFechaEnt(""+rsTaller.getDate("fechaEntrada"));
						Taller_entrada.setDate(rsTaller.getDate("fechaEntrada"));
						if(rsTaller.getInt("aceite")==1) {
							t.setAceite(true);
						}else {t.setAceite(false);}
						Taller_acetie.setSelected(t.isAceite());
						if(rsTaller.getInt("ruedas")==1) {
							t.setRuedas(true);
						}else {t.setRuedas(false);}
						Taller_ruedos.setSelected(t.isRuedas());
						if(rsTaller.getInt("pintura")==1) {
							t.setPintura(true);
						}else {t.setPintura(false);}
						Taller_pintura.setSelected(t.isPintura());
						if(rsTaller.getInt("frenos")==1) {
							t.setFrenos(true);
						}else {t.setFrenos(false);}
						Taller_frenos.setSelected(t.isFrenos());
						if(rsTaller.getInt("bujias")==1) {
							t.setBujia(true);
						}else {t.setBujia(false);}
						Taller_bujias.setSelected(t.isBujia());
						if(rsTaller.getInt("filtro")==1) {
							t.setFiltro(true);
						}else {t.setFiltro(false);}
						Taller_filrros.setSelected(t.isFiltro());
						Comercial_seguente.setEnabled(true);
				}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Taller.add(Taller_siguente, "cell 4 12,growx");
		
		JButton Taller_salir = new JButton("Salir");
		Taller_salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Answer = JOptionPane.showConfirmDialog(null, "¿Estás segura de que quieres salir?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	            if (Answer == JOptionPane.YES_OPTION) {
	                System.exit(0);
	            }
			}
		});
		Taller.add(Taller_salir, "cell 9 12,growx");
		
		JPanel panel_6 = new JPanel();
		contentPane.add(panel_6, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_11 = new JLabel("Aviso Alquiler ");
		lblNewLabel_11.setForeground(Color.RED);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 21));
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_11)
					.addContainerGap(710, Short.MAX_VALUE))
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGap(37)
					.addComponent(lblNewLabel_11)
					.addContainerGap(112, Short.MAX_VALUE))
		);
		panel_6.setLayout(gl_panel_6);
	}
}
