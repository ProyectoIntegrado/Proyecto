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

@SuppressWarnings("serial")
public class Mian extends JFrame {

	private JPanel contentPane;
	private JTextField Comercial_nombre;
	private JTextField Comercial_apellido1;
	private JTextField Comercial_apellido2;
	private JTextField Comercial_dni_nif;
	private JTextField Comercial_telefono;
	private JTextField Comercial_email;
	private JTextField Comercial_cod_empleado;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mian frame = new Mian();
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
	public Mian() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		tabbedPane.addTab("Comercial", new ImageIcon(Mian.class.getResource("/imagenes/iconmonstr-id-card-9-32.png")), Comercial, null);
		Comercial.setLayout(new MigLayout("", "[100px][100px][100px][100px][100px][100px,grow][100px][100px,grow][100px][100px]", "[-14.00][][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][][81.00][20px:n][]"));
		
		JLabel lblNewLabel = new JLabel("Comercial");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Comercial.add(lblNewLabel, "cell 0 0 5 2,alignx center");
		
		JLabel lblNewLabel_8 = new JLabel("Buscar");
		lblNewLabel_8.setIcon(new ImageIcon(Mian.class.getResource("/imagenes/iconmonstr-magnifier-4-32.png")));
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
		
		JLabel lblNewLabel_7 = new JLabel("Cod_Empleado");
		Comercial.add(lblNewLabel_7, "cell 0 8,alignx left");
		
		Comercial_cod_empleado = new JTextField();
		Comercial_cod_empleado.setColumns(10);
		Comercial.add(Comercial_cod_empleado, "cell 1 8 4 1,growx");
		
		JButton Comercial_anterior = new JButton("Anterior");
		Comercial.add(Comercial_anterior, "cell 0 12,growx");
		
		JButton Comercial_enviar = new JButton("Enviar");
		Comercial.add(Comercial_enviar, "cell 1 12,growx");
		
		JButton Comercial_editar = new JButton("Editar");
		Comercial.add(Comercial_editar, "cell 2 12,growx");
		
		JButton Comercial_borrar = new JButton("Borrar");
		Comercial.add(Comercial_borrar, "cell 3 12,growx");
		
		JButton Comercial_seguente = new JButton("Siguiente");
		Comercial.add(Comercial_seguente, "cell 4 12,growx");
		
		JPanel Cliente = new JPanel();
		tabbedPane.addTab("Cliente", new ImageIcon(Mian.class.getResource("/imagenes/iconmonstr-id-card-9-32.png")), Cliente, null);
		Cliente.setLayout(new MigLayout("", "[100px][100px,grow][100px][100px][100px][100px,grow][100px][100px,grow][100px][100px]", "[][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n]"));
		
		JLabel lblNewLabel_12 = new JLabel("Cliente ");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Cliente.add(lblNewLabel_12, "cell 0 0 5 1,alignx center");
		
		JLabel lblNewLabel_8_1 = new JLabel("Buscar");
		lblNewLabel_8_1.setIcon(new ImageIcon(Mian.class.getResource("/imagenes/iconmonstr-magnifier-4-32.png")));
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
		
		JLabel lblNewLabel_12_1 = new JLabel("Fecha Nacimiento");
		Cliente.add(lblNewLabel_12_1, "cell 0 8");
		
		JDateChooser Cliente_fecha_naciminto = new JDateChooser();
		Cliente.add(Cliente_fecha_naciminto, "cell 1 8 4 1,grow");
		
		JLabel lblNewLabel_13 = new JLabel("E-mail");
		Cliente.add(lblNewLabel_13, "cell 0 9,alignx left");
		
		Cliente_email = new JTextField();
		Cliente_email.setColumns(10);
		Cliente.add(Cliente_email, "cell 1 9 4 1,grow");
		
		JButton Cliente_anterior = new JButton("Anterior");
		Cliente.add(Cliente_anterior, "cell 0 12,growx");
		
		JButton Cliente_enviar = new JButton("Enviar");
		Cliente.add(Cliente_enviar, "cell 1 12,growx");
		
		JButton Cliente_editar = new JButton("Editar");
		Cliente.add(Cliente_editar, "cell 2 12,growx");
		
		JButton Cliente_borrar = new JButton("Borrar");
		Cliente.add(Cliente_borrar, "cell 3 12,growx");
		
		JButton Cliente_seguente = new JButton("Siguiente");
		Cliente.add(Cliente_seguente, "cell 4 12,growx");
		
		JPanel Coche = new JPanel();
		tabbedPane.addTab("Coche", new ImageIcon(Mian.class.getResource("/imagenes/iconmonstr-car-3-32.png")), Coche, null);
		Coche.setLayout(new MigLayout("", "[100px][100px,grow][100px][100px][100px][100px,grow][100px][100px,grow][100px][100px]", "[30.00px:n,fill][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n]"));
		
		JLabel lblNewLabel_14 = new JLabel("Coche");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Coche.add(lblNewLabel_14, "cell 0 0 5 1,growx");
		
		JLabel lblNewLabel_8_2 = new JLabel("Buscar");
		lblNewLabel_8_2.setIcon(new ImageIcon(Mian.class.getResource("/imagenes/iconmonstr-magnifier-4-32.png")));
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
		
		JComboBox Coche_marca = new JComboBox();
		Coche.add(Coche_marca, "cell 1 2 4 1,grow");
		
		JLabel lblNewLabel_10_2 = new JLabel("Consultas coche");
		Coche.add(lblNewLabel_10_2, "cell 5 2 2 1,alignx right");
		
		JComboBox Coche_consultas = new JComboBox();
		Coche.add(Coche_consultas, "cell 7 2 3 1,growx");
		
		JLabel lblNewLabel_3_2 = new JLabel("Modelo ");
		Coche.add(lblNewLabel_3_2, "cell 0 3,alignx left");
		
		JComboBox Coche_modelo = new JComboBox();
		Coche.add(Coche_modelo, "cell 1 3 4 1,grow");
		
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
		
		JDateChooser Coche_fecha_matriculacion = new JDateChooser();
		Coche.add(Coche_fecha_matriculacion, "cell 1 4 4 1,grow");
		
		JLabel lblNewLabel_5_2 = new JLabel("Color");
		Coche.add(lblNewLabel_5_2, "cell 0 5,alignx left");
		
		Coche_color = new JTextField();
		Coche_color.setColumns(10);
		Coche.add(Coche_color, "cell 1 5 4 1,grow");
		
		JLabel lblNewLabel_6_2 = new JLabel("Numero de puertos");
		Coche.add(lblNewLabel_6_2, "cell 0 6,alignx left");
		
		Coche_numero_puertos = new JTextField();
		Coche_numero_puertos.setColumns(10);
		Coche.add(Coche_numero_puertos, "cell 1 6 4 1,grow");
		
		JButton Coche_anterior = new JButton("Anterior");
		Coche.add(Coche_anterior, "cell 0 12,growx");
		
		JButton Coche_enviar = new JButton("Enviar");
		Coche.add(Coche_enviar, "cell 1 12,growx");
		
		JButton Coche_editar = new JButton("Editar");
		Coche.add(Coche_editar, "cell 2 12,growx");
		
		JButton Coche_borrar = new JButton("Borrar");
		Coche.add(Coche_borrar, "cell 3 12,growx");
		
		JButton Coche_siguente = new JButton("Siguiente");
		Coche.add(Coche_siguente, "cell 4 12,growx");
		
		JPanel Alquiler = new JPanel();
		tabbedPane.addTab("Alquiler", new ImageIcon(Mian.class.getResource("/imagenes/iconmonstr-book-5-32.png")), Alquiler, null);
		Alquiler.setLayout(new MigLayout("", "[100px][100px,grow][100px][100px][100px][100px][100px][100px][100px][100px]", "[20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n]"));
		
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
		
		JLabel lblNewLabel_2_3 = new JLabel("Matr\u00EDcula");
		Alquiler.add(lblNewLabel_2_3, "cell 0 2,alignx left");
		
		JComboBox Alquiler_matricula = new JComboBox();
		Alquiler.add(Alquiler_matricula, "cell 1 2 4 1,growx");
		
		JLabel lblNewLabel_3_3 = new JLabel("Fecha alquilaer");
		Alquiler.add(lblNewLabel_3_3, "cell 0 3,alignx left");
		
		JDateChooser Alquiler_fecha_aquilar = new JDateChooser();
		Alquiler.add(Alquiler_fecha_aquilar, "cell 1 3 4 1,grow");
		
		JLabel lblNewLabel_4_3 = new JLabel("Fecha entrega");
		Alquiler.add(lblNewLabel_4_3, "cell 0 4,alignx left");
		
		JDateChooser Alquiler_fecha_entrega = new JDateChooser();
		Alquiler.add(Alquiler_fecha_entrega, "cell 1 4 4 1,grow");
		
		JButton Alquiler_anterior = new JButton("Anterior");
		Alquiler.add(Alquiler_anterior, "cell 0 12,growx");
		
		JButton Alquiler_enviar = new JButton("Enviar");
		Alquiler.add(Alquiler_enviar, "cell 1 12,growx");
		
		JButton Alquiler_editar = new JButton("Editar");
		Alquiler.add(Alquiler_editar, "cell 2 12,growx");
		
		JButton Alquiler_borrar = new JButton("Borrar");
		Alquiler.add(Alquiler_borrar, "cell 3 12,growx");
		
		JButton Alquiler_siguente = new JButton("Siguiente");
		Alquiler.add(Alquiler_siguente, "cell 4 12,growx");
		
		JPanel Taller = new JPanel();
		tabbedPane.addTab("Taller", new ImageIcon(Mian.class.getResource("/imagenes/iconmonstr-wrench-24-32.png")), Taller, null);
		Taller.setLayout(new MigLayout("", "[100px][100px,grow][100px][100px][100px][100px,grow][100px][100px,grow][100px][100px]", "[38.00px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][20px:n][13.00px:n][20px:n]"));
		
		JLabel lblNewLabel_16 = new JLabel("Cliente Taller");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Taller.add(lblNewLabel_16, "cell 0 0 5 1,growx");
		
		JLabel lblNewLabel_8_4 = new JLabel("Buscar");
		lblNewLabel_8_4.setIcon(new ImageIcon(Mian.class.getResource("/imagenes/iconmonstr-magnifier-4-32.png")));
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
		
		JComboBox Taller_matricula = new JComboBox();
		Taller.add(Taller_matricula, "cell 1 2 4 1,growx");
		
		JLabel lblNewLabel_10_3 = new JLabel("Consultas Taller");
		Taller.add(lblNewLabel_10_3, "cell 5 2 2 1,alignx right");
		
		JComboBox Taller_consultar = new JComboBox();
		Taller.add(Taller_consultar, "cell 7 2 3 1,growx");
		
		JLabel lblNewLabel_3_4 = new JLabel("Fecha entrada");
		Taller.add(lblNewLabel_3_4, "cell 0 3");
		
		JDateChooser Taller_entrada = new JDateChooser();
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
		
		JDateChooser Taller_sailda = new JDateChooser();
		Taller.add(Taller_sailda, "cell 1 4 4 1,grow");
		
		JCheckBox Taller_acetie = new JCheckBox("Aceite");
		Taller.add(Taller_acetie, "cell 0 5");
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(Mian.class.getResource("/imagenes/WhatsApp Image 2020-05-20 at 21.43.26.jpeg")));
		Taller.add(lblNewLabel_17, "cell 1 5 4 6,alignx center,aligny center");
		
		JCheckBox Taller_frenos = new JCheckBox("Frenos");
		Taller.add(Taller_frenos, "cell 0 6");
		
		JCheckBox Taller_ruedos = new JCheckBox("Ruedos");
		Taller.add(Taller_ruedos, "cell 0 7");
		
		JCheckBox Taller_pintura = new JCheckBox("Pintura");
		Taller.add(Taller_pintura, "cell 0 8");
		
		JCheckBox Taller_bujos = new JCheckBox("Bujios");
		Taller.add(Taller_bujos, "cell 0 9");
		
		JCheckBox Taller_filrros = new JCheckBox("Filrros");
		Taller.add(Taller_filrros, "cell 0 10");
		
		JButton Taller_anterior = new JButton("Anterior");
		Taller.add(Taller_anterior, "cell 0 12,growx");
		
		JButton taller_enviar = new JButton("Enviar");
		Taller.add(taller_enviar, "cell 1 12,growx");
		
		JButton Taller_editar = new JButton("Editar");
		Taller.add(Taller_editar, "cell 2 12,growx");
		
		JButton Taller_borrar = new JButton("Borrar");
		Taller.add(Taller_borrar, "cell 3 12,growx");
		
		JButton Taller_siguente = new JButton("Siguiente");
		Taller.add(Taller_siguente, "cell 4 12,growx");
		
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
