package saloscar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JCheckBox;

public class Mian extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTable table_1;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
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
		
		textField = new JTextField();
		textField.setColumns(10);
		Comercial.add(textField, "cell 1 2 4 1,growx,aligny center");
		
		JLabel lblNewLabel_9 = new JLabel("Consultas sobre comercial");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Comercial.add(lblNewLabel_9, "cell 5 2 5 1,alignx center");
		
		JLabel lblNewLabel_2 = new JLabel("Apellido 1");
		Comercial.add(lblNewLabel_2, "cell 0 3,alignx left");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		Comercial.add(textField_1, "cell 1 3 4 1,growx");
		
		JLabel lblNewLabel_10 = new JLabel("Consultas comercial");
		Comercial.add(lblNewLabel_10, "cell 5 3 2 1,alignx right");
		
		JComboBox comboBox = new JComboBox();
		Comercial.add(comboBox, "cell 7 3 3 1,growx");
		
		JLabel lblNewLabel_3 = new JLabel("Apellido 2");
		Comercial.add(lblNewLabel_3, "cell 0 4,alignx left");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		Comercial.add(textField_2, "cell 1 4 4 1,growx");
		
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
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		Comercial.add(textField_3, "cell 1 5 4 1,growx");
		
		JLabel lblNewLabel_5 = new JLabel("Telefono");
		Comercial.add(lblNewLabel_5, "cell 0 6,alignx left");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		Comercial.add(textField_4, "cell 1 6 4 1,growx");
		
		JLabel lblNewLabel_6 = new JLabel("E-mail");
		Comercial.add(lblNewLabel_6, "cell 0 7,alignx left");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		Comercial.add(textField_5, "cell 1 7 4 1,growx");
		
		JLabel lblNewLabel_7 = new JLabel("Cod_Empleado");
		Comercial.add(lblNewLabel_7, "cell 0 8,alignx left");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		Comercial.add(textField_6, "cell 1 8 4 1,growx");
		
		JButton btnNewButton_5 = new JButton("Anterior");
		Comercial.add(btnNewButton_5, "cell 0 12,growx");
		
		JButton btnNewButton_6 = new JButton("Enviar");
		Comercial.add(btnNewButton_6, "cell 1 12,growx");
		
		JButton btnNewButton_7 = new JButton("Editar");
		Comercial.add(btnNewButton_7, "cell 2 12,growx");
		
		JButton btnNewButton_8 = new JButton("Borrar");
		Comercial.add(btnNewButton_8, "cell 3 12,growx");
		
		JButton btnNewButton_9 = new JButton("Siguiente");
		Comercial.add(btnNewButton_9, "cell 4 12,growx");
		
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
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		Cliente.add(textField_7, "cell 1 1 4 1,grow");
		
		JLabel lblNewLabel_9_1 = new JLabel("Consultas sobre Clientes");
		lblNewLabel_9_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Cliente.add(lblNewLabel_9_1, "cell 5 1 5 1,growx");
		
		JLabel lblNewLabel_2_1 = new JLabel("Apellido 1");
		Cliente.add(lblNewLabel_2_1, "cell 0 2,alignx left");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		Cliente.add(textField_8, "cell 1 2 4 1,grow");
		
		JLabel lblNewLabel_10_1 = new JLabel("Consultas clientes");
		Cliente.add(lblNewLabel_10_1, "cell 5 2 2 1,alignx right");
		
		JComboBox comboBox_1 = new JComboBox();
		Cliente.add(comboBox_1, "cell 7 2 3 1,growx");
		
		JLabel lblNewLabel_3_1 = new JLabel("Apellido 2");
		Cliente.add(lblNewLabel_3_1, "cell 0 3,alignx left");
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		Cliente.add(textField_9, "cell 1 3 4 1,grow");
		
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
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		Cliente.add(textField_10, "cell 1 4 4 1,grow");
		
		JLabel lblNewLabel_5_1 = new JLabel("Direcci\u00F3n ");
		Cliente.add(lblNewLabel_5_1, "cell 0 5,alignx left");
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		Cliente.add(textField_11, "cell 1 5 4 1,grow");
		
		JLabel lblNewLabel_6_1 = new JLabel("Poblaci\u00F3n");
		Cliente.add(lblNewLabel_6_1, "cell 0 6,alignx left");
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		Cliente.add(textField_12, "cell 1 6 4 1,grow");
		
		JLabel lblNewLabel_7_1 = new JLabel("Telefono");
		Cliente.add(lblNewLabel_7_1, "cell 0 7,alignx left");
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		Cliente.add(textField_13, "cell 1 7 4 1,grow");
		
		JLabel lblNewLabel_12_1 = new JLabel("Fecha Nacimiento");
		Cliente.add(lblNewLabel_12_1, "cell 0 8");
		
		JDateChooser dateChooser = new JDateChooser();
		Cliente.add(dateChooser, "cell 1 8 4 1,grow");
		
		JLabel lblNewLabel_13 = new JLabel("E-mail");
		Cliente.add(lblNewLabel_13, "cell 0 9,alignx left");
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		Cliente.add(textField_14, "cell 1 9 4 1,grow");
		
		JButton btnNewButton_5_1 = new JButton("Anterior");
		Cliente.add(btnNewButton_5_1, "cell 0 12,growx");
		
		JButton btnNewButton_6_1 = new JButton("Enviar");
		Cliente.add(btnNewButton_6_1, "cell 1 12,growx");
		
		JButton btnNewButton_7_1 = new JButton("Editar");
		Cliente.add(btnNewButton_7_1, "cell 2 12,growx");
		
		JButton btnNewButton_8_1 = new JButton("Borrar");
		Cliente.add(btnNewButton_8_1, "cell 3 12,growx");
		
		JButton btnNewButton_9_1 = new JButton("Siguiente");
		Cliente.add(btnNewButton_9_1, "cell 4 12,growx");
		
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
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		Coche.add(textField_15, "cell 1 1 4 1,grow");
		
		JLabel lblNewLabel_9_2 = new JLabel("Consultas sobre coche");
		lblNewLabel_9_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Coche.add(lblNewLabel_9_2, "cell 5 1 5 1,grow");
		
		JLabel lblNewLabel_2_2 = new JLabel("Marca");
		Coche.add(lblNewLabel_2_2, "cell 0 2,alignx left");
		
		JComboBox comboBox_2 = new JComboBox();
		Coche.add(comboBox_2, "cell 1 2 4 1,grow");
		
		JLabel lblNewLabel_10_2 = new JLabel("Consultas coche");
		Coche.add(lblNewLabel_10_2, "cell 5 2 2 1,alignx right");
		
		JComboBox comboBox_3 = new JComboBox();
		Coche.add(comboBox_3, "cell 7 2 3 1,growx");
		
		JLabel lblNewLabel_3_2 = new JLabel("Modelo ");
		Coche.add(lblNewLabel_3_2, "cell 0 3,alignx left");
		
		JComboBox comboBox_1_1 = new JComboBox();
		Coche.add(comboBox_1_1, "cell 1 3 4 1,grow");
		
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
		
		JDateChooser dateChooser_1 = new JDateChooser();
		Coche.add(dateChooser_1, "cell 1 4 4 1,grow");
		
		JLabel lblNewLabel_5_2 = new JLabel("Color");
		Coche.add(lblNewLabel_5_2, "cell 0 5,alignx left");
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		Coche.add(textField_16, "cell 1 5 4 1,grow");
		
		JLabel lblNewLabel_6_2 = new JLabel("Numero de puertos");
		Coche.add(lblNewLabel_6_2, "cell 0 6,alignx left");
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		Coche.add(textField_17, "cell 1 6 4 1,grow");
		
		JButton btnNewButton_5_2 = new JButton("Anterior");
		Coche.add(btnNewButton_5_2, "cell 0 12,growx");
		
		JButton btnNewButton_6_2 = new JButton("Enviar");
		Coche.add(btnNewButton_6_2, "cell 1 12,growx");
		
		JButton btnNewButton_7_2 = new JButton("Editar");
		Coche.add(btnNewButton_7_2, "cell 2 12,growx");
		
		JButton btnNewButton_8_2 = new JButton("Borrar");
		Coche.add(btnNewButton_8_2, "cell 3 12,growx");
		
		JButton btnNewButton_9_2 = new JButton("Siguiente");
		Coche.add(btnNewButton_9_2, "cell 4 12,growx");
		
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
		
		JComboBox comboBox_2_1 = new JComboBox();
		Alquiler.add(comboBox_2_1, "cell 1 1 4 1,growx");
		
		JLabel lblNewLabel_2_3 = new JLabel("Matr\u00EDcula");
		Alquiler.add(lblNewLabel_2_3, "cell 0 2,alignx left");
		
		JComboBox comboBox_1_2 = new JComboBox();
		Alquiler.add(comboBox_1_2, "cell 1 2 4 1,growx");
		
		JLabel lblNewLabel_3_3 = new JLabel("Fecha alquilaer");
		Alquiler.add(lblNewLabel_3_3, "cell 0 3,alignx left");
		
		JDateChooser dateChooser_2 = new JDateChooser();
		Alquiler.add(dateChooser_2, "cell 1 3 4 1,grow");
		
		JLabel lblNewLabel_4_3 = new JLabel("Fecha entrega");
		Alquiler.add(lblNewLabel_4_3, "cell 0 4,alignx left");
		
		JDateChooser dateChooser_1_1 = new JDateChooser();
		Alquiler.add(dateChooser_1_1, "cell 1 4 4 1,grow");
		
		JButton btnNewButton_5_3 = new JButton("Anterior");
		Alquiler.add(btnNewButton_5_3, "cell 0 12,growx");
		
		JButton btnNewButton_6_3 = new JButton("Enviar");
		Alquiler.add(btnNewButton_6_3, "cell 1 12,growx");
		
		JButton btnNewButton_7_3 = new JButton("Editar");
		Alquiler.add(btnNewButton_7_3, "cell 2 12,growx");
		
		JButton btnNewButton_8_3 = new JButton("Borrar");
		Alquiler.add(btnNewButton_8_3, "cell 3 12,growx");
		
		JButton btnNewButton_9_3 = new JButton("Siguiente");
		Alquiler.add(btnNewButton_9_3, "cell 4 12,growx");
		
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
		
		JComboBox comboBox_2_2 = new JComboBox();
		Taller.add(comboBox_2_2, "cell 1 1 4 1,growx");
		
		JLabel lblNewLabel_9_3 = new JLabel("Consultas sobre Taller");
		lblNewLabel_9_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Taller.add(lblNewLabel_9_3, "cell 5 1 5 1,growx");
		
		JLabel lblNewLabel_2_4 = new JLabel("Matr\u00EDcula");
		Taller.add(lblNewLabel_2_4, "cell 0 2,alignx left");
		
		JComboBox comboBox_1_3 = new JComboBox();
		Taller.add(comboBox_1_3, "cell 1 2 4 1,growx");
		
		JLabel lblNewLabel_10_3 = new JLabel("Consultas Taller");
		Taller.add(lblNewLabel_10_3, "cell 5 2 2 1,alignx right");
		
		JComboBox comboBox_4 = new JComboBox();
		Taller.add(comboBox_4, "cell 7 2 3 1,growx");
		
		JLabel lblNewLabel_3_4 = new JLabel("Fecha entrada");
		Taller.add(lblNewLabel_3_4, "cell 0 3");
		
		JDateChooser dateChooser_3 = new JDateChooser();
		Taller.add(dateChooser_3, "cell 1 3 4 1,grow");
		
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
		
		JDateChooser dateChooser_1_2 = new JDateChooser();
		Taller.add(dateChooser_1_2, "cell 1 4 4 1,grow");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Aceite");
		Taller.add(chckbxNewCheckBox, "cell 0 5");
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(Mian.class.getResource("/imagenes/WhatsApp Image 2020-05-20 at 21.43.26.jpeg")));
		Taller.add(lblNewLabel_17, "cell 1 5 4 6,alignx center,aligny center");
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Frenos");
		Taller.add(chckbxNewCheckBox_1, "cell 0 6");
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Ruedos");
		Taller.add(chckbxNewCheckBox_2, "cell 0 7");
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Pintura");
		Taller.add(chckbxNewCheckBox_3, "cell 0 8");
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Bujios");
		Taller.add(chckbxNewCheckBox_4, "cell 0 9");
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Filrros");
		Taller.add(chckbxNewCheckBox_5, "cell 0 10");
		
		JButton btnNewButton_5_4 = new JButton("Anterior");
		Taller.add(btnNewButton_5_4, "cell 0 12,growx");
		
		JButton btnNewButton_6_4 = new JButton("Enviar");
		Taller.add(btnNewButton_6_4, "cell 1 12,growx");
		
		JButton btnNewButton_7_4 = new JButton("Editar");
		Taller.add(btnNewButton_7_4, "cell 2 12,growx");
		
		JButton btnNewButton_8_4 = new JButton("Borrar");
		Taller.add(btnNewButton_8_4, "cell 3 12,growx");
		
		JButton btnNewButton_9_4 = new JButton("Siguiente");
		Taller.add(btnNewButton_9_4, "cell 4 12,growx");
		
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
