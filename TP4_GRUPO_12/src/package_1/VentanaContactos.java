package package_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class VentanaContactos extends JFrame {
	
	private JPanel contentPane;
	
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txttelefono;
	private JTextField txtfechaNac;
	
	private JLabel lbldatosingresdos;
	private JLabel lblresultado;
	
	private JButton btnMostrar;
	
	
	public VentanaContactos() 
	{
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 452, 401);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.AgregarLabels();
		this.AgregarTextFields();
		this.BotonMostrar();
		
		setVisible(true);
	}

	private void AgregarLabels() 
	{
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

		lbldatosingresdos = new JLabel("Los datos ingresados fueron:");
		lbldatosingresdos.setBounds(10, 331, 172, 14);
		contentPane.add(lbldatosingresdos);

		lblresultado = new JLabel("");
		lblresultado.setBounds(178, 331, 268, 14);
		contentPane.add(lblresultado);
	}

	private void AgregarTextFields() 
	{
		txtnombre = new JTextField();
		txtnombre.setBounds(135, 69, 258, 24);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		txtnombre.addMouseListener(new eventoTxt(txtnombre));

		txtapellido = new JTextField();
		txtapellido.setColumns(10);
		txtapellido.setBounds(135, 115, 258, 24);
		contentPane.add(txtapellido);
		txtapellido.addMouseListener(new eventoTxt(txtapellido));

		txttelefono = new JTextField();
		txttelefono.setColumns(10);
		txttelefono.setBounds(135, 160, 258, 24);
		contentPane.add(txttelefono);
		txttelefono.addMouseListener(new eventoTxt(txttelefono));

		txtfechaNac = new JTextField();
		txtfechaNac.setColumns(10);
		txtfechaNac.setBounds(135, 206, 258, 24);
		contentPane.add(txtfechaNac);
		txtfechaNac.addMouseListener(new eventoTxt(txtfechaNac));
	}
	
	private void BotonMostrar() 
	{
		btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(304, 263, 89, 23);
		contentPane.add(btnMostrar);
		
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)throws ExcepTxtVacio {
				boolean correcto = true;
				
				if(txtnombre.getText().equals("")) {
					correcto = false;
					txtnombre.setBackground(Color.red);
				}
				if(txtapellido.getText().equals("")) {
					correcto = false;
					txtapellido.setBackground(Color.red);
				}
				if(txttelefono.getText().equals("")) {
					correcto = false;
					txttelefono.setBackground(Color.red);
				}
				if(txtfechaNac.getText().equals("")) {
					txtfechaNac.setBackground(Color.red);
					correcto = false;
				}
				if(correcto == true) {
					lblresultado.setVisible(true);
					lblresultado.setText(txtnombre.getText() + ", "+txtapellido.getText()+", "+txttelefono.getText()+", "+txtfechaNac.getText());
				}
				else {
					throw new ExcepTxtVacio();		
					
				}
				txtnombre.setText("");
				txtnombre.setBackground(Color.white);
				
				txtapellido.setText("");
				txtapellido.setBackground(Color.white);
				
				txttelefono.setText("");
				txttelefono.setBackground(Color.white);
				
				txtfechaNac.setText("");
				txtfechaNac.setBackground(Color.white);
			}
		});
	}

	class eventoTxt implements MouseListener 
	{

		private JTextField txt;

		public eventoTxt(JTextField control) {
			txt = control;
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			txt.setBackground(Color.white);

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}
}