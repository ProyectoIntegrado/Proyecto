package saloscar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToggleButton;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField;
	private JTextField textField_6;
	private JTable table;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente frame = new Cliente();
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
	public Cliente() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 924, 418);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel Botón = new JPanel();
		contentPane.add(Botón, BorderLayout.NORTH);
		Botón.setLayout(new GridLayout(0, 5, 0, 0));
		
		JButton btnNewButton = new JButton("Comerciol");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comercial comercial = new Comercial();
				comercial.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setToolTipText("");
		btnNewButton.setIcon(new ImageIcon(Cliente.class.getResource("/imagenes/iconmonstr-id-card-9-32.png")));
		Botón.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cliente ");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setIcon(new ImageIcon(Cliente.class.getResource("/imagenes/iconmonstr-id-card-9-32.png")));
		Botón.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Coche");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Coche coche = new Coche();
				coche.setVisible(true);
			}
		});
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setIcon(new ImageIcon(Cliente.class.getResource("/imagenes/iconmonstr-car-3-32.png")));
		Botón.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Alquiler");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alquiler alquiler = new Alquiler();
				alquiler.setVisible(true);
			}
		});
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setIcon(new ImageIcon(Cliente.class.getResource("/imagenes/iconmonstr-book-5-32.png")));
		Botón.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Taller");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Taller taller = new Taller();
				taller.setVisible(true);
			}
		});
		btnNewButton_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton_4.setIcon(new ImageIcon(Cliente.class.getResource("/imagenes/iconmonstr-wrench-24-32.png")));
		Botón.add(btnNewButton_4);
		
		JPanel Comercial = new JPanel();
		Comercial.setBackground(Color.LIGHT_GRAY);
		contentPane.add(Comercial, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("Cliente ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido 1");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido 2");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("DNI/NIF");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Direcci\u00F3n ");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Poblaci\u00F3n");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Telefono");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		Comercial.setLayout(new MigLayout("", "[71px][5px][63px,grow][5px][61px][5px][63px][5px][76.00px][9.00]", "[25px][20px][20px][20px][20px][20px][20px][20px][23px,grow][][]"));
		Comercial.add(lblNewLabel, "cell 0 0 9 1,alignx center,aligny top");
		Comercial.add(lblNewLabel_1, "cell 0 1,alignx left,aligny center");
		Comercial.add(textField, "cell 2 1 7 1,growx,aligny top");
		Comercial.add(lblNewLabel_2, "cell 0 2,alignx left,aligny center");
		Comercial.add(textField_1, "cell 2 2 7 1,growx,aligny top");
		Comercial.add(lblNewLabel_3, "cell 0 3,alignx left,aligny center");
		Comercial.add(textField_2, "cell 2 3 7 1,growx,aligny top");
		Comercial.add(lblNewLabel_4, "cell 0 4,alignx left,aligny center");
		Comercial.add(textField_3, "cell 2 4 7 1,growx,aligny top");
		Comercial.add(lblNewLabel_5, "cell 0 5,alignx left,aligny center");
		Comercial.add(textField_4, "cell 2 5 7 1,growx,aligny top");
		Comercial.add(lblNewLabel_6, "cell 0 6,alignx left,aligny center");
		Comercial.add(textField_5, "cell 2 6 7 1,growx,aligny top");
		Comercial.add(lblNewLabel_7, "cell 0 7,alignx left,aligny center");
		Comercial.add(textField_6, "cell 2 7 7 1,growx,aligny top");
		
		JLabel lblNewLabel_12 = new JLabel("Fecha Nacimiento");
		Comercial.add(lblNewLabel_12, "cell 0 8");
		
		JDateChooser dateChooser = new JDateChooser();
		Comercial.add(dateChooser, "cell 2 8 7 1,grow");
		
		JLabel lblNewLabel_13 = new JLabel("E-mail");
		Comercial.add(lblNewLabel_13, "cell 0 9");
		
		textField_7 = new JTextField();
		Comercial.add(textField_7, "cell 2 9 7 1,growx");
		textField_7.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Anterior");
		Comercial.add(btnNewButton_5, "cell 0 10,alignx left,aligny top");
		
		JButton btnNewButton_6 = new JButton("Enviar");
		Comercial.add(btnNewButton_6, "cell 2 10,alignx left,aligny top");
		
		JButton btnNewButton_7 = new JButton("Editar");
		Comercial.add(btnNewButton_7, "cell 4 10,alignx left,aligny top");
		
		JButton btnNewButton_8 = new JButton("Borrar");
		Comercial.add(btnNewButton_8, "cell 6 10,alignx left,aligny top");
		
		JButton btnNewButton_9 = new JButton("Siguiente");
		Comercial.add(btnNewButton_9, "cell 8 10,alignx left,aligny top");
		
		JPanel Buscar = new JPanel();
		contentPane.add(Buscar, BorderLayout.EAST);
		
		JLabel lblNewLabel_8 = new JLabel("Buscar");
		lblNewLabel_8.setIcon(new ImageIcon(Cliente.class.getResource("/imagenes/iconmonstr-magnifier-4-32.png")));
		lblNewLabel_8.setForeground(Color.BLUE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_9 = new JLabel("Consultas sobre Clientes");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_10 = new JLabel("Consultas clientes");
		
		JComboBox comboBox = new JComboBox();
		
		JPanel panel = new JPanel();
		GroupLayout gl_Buscar = new GroupLayout(Buscar);
		gl_Buscar.setHorizontalGroup(
			gl_Buscar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Buscar.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_Buscar.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_Buscar.createSequentialGroup()
							.addComponent(lblNewLabel_10)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboBox, 0, 268, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_Buscar.createSequentialGroup()
							.addGap(10)
							.addComponent(lblNewLabel_9, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
						.addComponent(lblNewLabel_8, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
						.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_Buscar.setVerticalGroup(
			gl_Buscar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Buscar.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_8)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_9)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Buscar.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_10)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"DNI/NIF", "Nombre", "Apellidos", "Direcci\u00F3n", "poblaci\u00F3n", "Telefono", "Fecha Nacimiento"
			}
		));
		scrollPane.setViewportView(table);
		Buscar.setLayout(gl_Buscar);
		
		JPanel aviso = new JPanel();
		contentPane.add(aviso, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_11 = new JLabel("Aviso Alquiler ");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_11.setForeground(Color.RED);
		GroupLayout gl_aviso = new GroupLayout(aviso);
		gl_aviso.setHorizontalGroup(
			gl_aviso.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_aviso.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_11, GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_aviso.setVerticalGroup(
			gl_aviso.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_aviso.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_11)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		aviso.setLayout(gl_aviso);
	}
}
