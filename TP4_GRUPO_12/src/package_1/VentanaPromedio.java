package package_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class VentanaPromedio extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtPromedio;
	private JTextField txtCondicion;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaPromedio () {
		setTitle("Promedio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(150, 150, 506, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlNotas = new JPanel();
		pnlNotas.setBorder(new TitledBorder(new LineBorder(new Color(153, 180, 209)), "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlNotas.setBounds(29, 36, 297, 195);
		contentPane.add(pnlNotas);
		pnlNotas.setLayout(null);
		
		JLabel lblNota1 = new JLabel("Nota 1");
		lblNota1.setBounds(46, 37, 46, 14);
		pnlNotas.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2");
		lblNota2.setBounds(46, 75, 46, 14);
		pnlNotas.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3");
		lblNota3.setBounds(46, 114, 46, 14);
		pnlNotas.add(lblNota3);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(102, 34, 86, 20);
		pnlNotas.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(102, 72, 86, 20);
		pnlNotas.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(102, 111, 86, 20);
		pnlNotas.add(txtNota3);
		txtNota3.setColumns(10);
		
		JLabel lblTPS = new JLabel("TPS");
		lblTPS.setBounds(46, 153, 46, 14);
		pnlNotas.add(lblTPS);
		
		JComboBox<ComboItem> comboBox = new JComboBox<ComboItem>();
		comboBox.setBounds(102, 150, 86, 20);
		comboBox.addItem(new ComboItem("Aprobado","1"));
		comboBox.addItem(new ComboItem("Desaprobado","2"));
		
		pnlNotas.add(comboBox);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setForeground(SystemColor.desktop);
		btnCalcular.setBounds(359, 57, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(359, 103, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(359, 154, 89, 23);
		btnSalir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		contentPane.add(btnSalir);
		
		JPanel pnlResultado = new JPanel();
		pnlResultado.setBorder(new TitledBorder(new LineBorder(new Color(153, 180, 209)), "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlResultado.setBounds(29, 261, 297, 110);
		contentPane.add(pnlResultado);
		pnlResultado.setLayout(null);
		
		JLabel lblPromedio = new JLabel("Promedio");
		lblPromedio.setBounds(29, 31, 58, 14);
		pnlResultado.add(lblPromedio);
		
		JLabel lblCondicion = new JLabel("Condicion");
		lblCondicion.setBounds(29, 68, 58, 14);
		pnlResultado.add(lblCondicion);
		
		txtPromedio = new JTextField();
		txtPromedio.setBounds(119, 28, 150, 20);
		pnlResultado.add(txtPromedio);
		txtPromedio.setColumns(25);
		
		txtCondicion = new JTextField();
		txtCondicion.setBounds(119, 65, 150, 20);
		pnlResultado.add(txtCondicion);
		txtCondicion.setColumns(10);
	}
}

