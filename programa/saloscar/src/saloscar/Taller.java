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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;
import java.awt.SystemColor;

public class Taller extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtMatriculaTaller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Taller frame = new Taller();
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
	public Taller() {
		setAutoRequestFocus(false);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 924, 418);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel Bot�n = new JPanel();
		contentPane.add(Bot�n, BorderLayout.NORTH);
		Bot�n.setLayout(new GridLayout(0, 5, 0, 0));
		
		JButton btnNewButton = new JButton("Comercial");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comercial comercial = new Comercial();
				comercial.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setToolTipText("");
		btnNewButton.setIcon(new ImageIcon(Taller.class.getResource("/imagenes/iconmonstr-id-card-9-32.png")));
		Bot�n.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cliente ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = new Cliente();
				cliente.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setIcon(new ImageIcon(Taller.class.getResource("/imagenes/iconmonstr-id-card-9-32.png")));
		Bot�n.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Coche");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Coche coche = new Coche();
				coche.setVisible(true);
			}
		});
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setIcon(new ImageIcon(Taller.class.getResource("/imagenes/iconmonstr-car-3-32.png")));
		Bot�n.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Alquiler");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alquiler alquiler = new Alquiler();
				alquiler.setVisible(true);
			}
		});
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setIcon(new ImageIcon(Taller.class.getResource("/imagenes/iconmonstr-book-5-32.png")));
		Bot�n.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Taller");
		btnNewButton_4.setEnabled(false);
		btnNewButton_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton_4.setIcon(new ImageIcon(Taller.class.getResource("/imagenes/iconmonstr-wrench-24-32.png")));
		Bot�n.add(btnNewButton_4);
		
		JPanel Comercial = new JPanel();
		Comercial.setBackground(SystemColor.control);
		contentPane.add(Comercial, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("Cliente Taller");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("Cliente");
		
		JLabel lblNewLabel_2 = new JLabel("Matr\u00EDcula");
		
		JLabel lblNewLabel_3 = new JLabel("Fecha entrada");
		
		JLabel lblNewLabel_4 = new JLabel("Fecha Salida");
		Comercial.setLayout(new MigLayout("", "[71px][5px][63px,grow][5px][61px,grow][5px][63px][5px][76.00px][9.00]", "[25px][20px][20px][20px][20px][grow][][][][][][20px]"));
		Comercial.add(lblNewLabel, "cell 0 0 9 1,alignx center,aligny top");
		Comercial.add(lblNewLabel_1, "cell 0 1,alignx left,aligny center");
		
		JComboBox comboClienteTaller = new JComboBox();
		Comercial.add(comboClienteTaller, "cell 2 1 7 1,growx");
		Comercial.add(lblNewLabel_2, "cell 0 2,alignx left,aligny center");
		
		txtMatriculaTaller = new JTextField();
		Comercial.add(txtMatriculaTaller, "cell 2 2 7 1,growx");
		txtMatriculaTaller.setColumns(10);
		Comercial.add(lblNewLabel_3, "cell 0 3,alignx left,aligny center");
		
		JDateChooser dateEntradaTaller = new JDateChooser();
		Comercial.add(dateEntradaTaller, "cell 2 3 7 1,growx,aligny top");
		Comercial.add(lblNewLabel_4, "cell 0 4,alignx left,aligny center");
		
		JDateChooser dateSalidaTaller = new JDateChooser();
		Comercial.add(dateSalidaTaller, "cell 2 4 7 1,growx,aligny top");
		
		JCheckBox CheckBoxAceite = new JCheckBox("Aceite");
		Comercial.add(CheckBoxAceite, "cell 0 5");
		
		JPanel panel = new JPanel();
		Comercial.add(panel, "cell 4 5 5 6,grow");
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Taller.class.getResource("/imagenes/WhatsApp Image 2020-05-20 at 21.43.26.jpeg")));
		panel.add(lblNewLabel_5);
		
		JCheckBox CheckBoxFiltro = new JCheckBox("Filtros");
		Comercial.add(CheckBoxFiltro, "cell 0 6");
		
		JCheckBox CheckBoxFrenos = new JCheckBox("Frenos");
		Comercial.add(CheckBoxFrenos, "cell 0 7");
		
		JCheckBox CheckBoxRuedas = new JCheckBox("Ruedas");
		Comercial.add(CheckBoxRuedas, "cell 0 8");
		
		JCheckBox CheckBoxPintura = new JCheckBox("Pintura");
		Comercial.add(CheckBoxPintura, "cell 0 9");
		
		JCheckBox CheckBoxBujias = new JCheckBox("Bujias");
		Comercial.add(CheckBoxBujias, "cell 0 10");
		
		JButton btnNewButton_5 = new JButton("Anterior");
		Comercial.add(btnNewButton_5, "cell 0 11,alignx left,aligny top");
		
		JButton btnNewButton_6 = new JButton("Enviar");
		Comercial.add(btnNewButton_6, "cell 2 11,alignx left,aligny top");
		
		JButton btnNewButton_7 = new JButton("Editar");
		Comercial.add(btnNewButton_7, "cell 4 11,alignx left,aligny top");
		
		JButton btnNewButton_8 = new JButton("Borrar");
		Comercial.add(btnNewButton_8, "cell 6 11,alignx left,aligny top");
		
		JButton btnNewButton_9 = new JButton("Siguiente");
		Comercial.add(btnNewButton_9, "cell 8 11,alignx left,aligny top");
		
		JPanel Buscar = new JPanel();
		contentPane.add(Buscar, BorderLayout.EAST);
		
		JLabel lblNewLabel_8 = new JLabel("Buscar");
		lblNewLabel_8.setIcon(new ImageIcon(Taller.class.getResource("/imagenes/iconmonstr-magnifier-4-32.png")));
		lblNewLabel_8.setForeground(Color.BLUE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_9 = new JLabel("Consultas sobre Taller");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_10 = new JLabel("Consultas Taller");
		
		JComboBox comboBox = new JComboBox();
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_Buscar = new GroupLayout(Buscar);
		gl_Buscar.setHorizontalGroup(
			gl_Buscar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Buscar.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Buscar.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_9, GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
						.addComponent(lblNewLabel_8, GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
						.addGroup(gl_Buscar.createSequentialGroup()
							.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 308, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_Buscar.setVerticalGroup(
			gl_Buscar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Buscar.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_8)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Buscar.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Buscar.createSequentialGroup()
							.addGap(4)
							.addComponent(lblNewLabel_10))
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(34, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Cliente", "Matricula", "Entrada", "Salida"
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
