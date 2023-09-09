package package_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaContactos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaContactos frame = new VentanaContactos();
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
	public VentanaContactos() {
		setTitle("Contactos");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblNombre.setBounds(46, 67, 116, 24);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblApellido.setBounds(46, 113, 116, 24);
		contentPane.add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblTelefono.setBounds(46, 156, 116, 24);
		contentPane.add(lblTelefono);
		
		JLabel lblFechaNac = new JLabel("Fecha Nac:");
		lblFechaNac.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblFechaNac.setBounds(46, 202, 116, 24);
		contentPane.add(lblFechaNac);
		
		textField = new JTextField();
		textField.setBounds(135, 69, 258, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(135, 115, 258, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(135, 160, 258, 24);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(135, 206, 258, 24);
		contentPane.add(textField_3);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(304, 263, 89, 23);
		contentPane.add(btnMostrar);
		
		JLabel lbldatosingresdos = new JLabel("Los datos ingresados fueron:");
		lbldatosingresdos.setBounds(46, 347, 148, 14);
		contentPane.add(lbldatosingresdos);
		
		JLabel lblresultado = new JLabel("");
		lblresultado.setBounds(191, 347, 136, 14);
		contentPane.add(lblresultado);
	}
}
