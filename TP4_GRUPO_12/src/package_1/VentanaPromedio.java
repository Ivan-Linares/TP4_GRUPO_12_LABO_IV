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

@SuppressWarnings("serial")
public class VentanaPromedio extends JFrame
{
	private JPanel contentPane;
	private JPanel pnlNotas;
	private JPanel pnlResultado;
	
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtPromedio;
	private JTextField txtCondicion;
	
	private JComboBox<ComboItem> comboBox;

	public VentanaPromedio () 
	{
		setTitle("Promedio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(150, 150, 506, 463);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.SetPanelInput();
		this.SetBotones();
		this.SetPanelOutput();
		
		setVisible(true);
	}
	
	private void SetPanelInput()
	{
		pnlNotas = new JPanel();
		pnlNotas.setBorder(new TitledBorder(new LineBorder(new Color(153, 180, 209)), "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlNotas.setBounds(29, 36, 297, 195);
		contentPane.add(pnlNotas);
		pnlNotas.setLayout(null);
		
		this.SetLabelsInput();
		this.SetTextFieldsInput();
		this.SetComboBoxTPS();
	}
	
	private void SetLabelsInput()
	{
		JLabel lblNota1 = new JLabel("Nota 1");
		lblNota1.setBounds(46, 37, 46, 14);
		pnlNotas.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2");
		lblNota2.setBounds(46, 75, 46, 14);
		pnlNotas.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3");
		lblNota3.setBounds(46, 114, 46, 14);
		pnlNotas.add(lblNota3);
		
		JLabel lblTPS = new JLabel("TPS");
		lblTPS.setBounds(46, 153, 46, 14);
		pnlNotas.add(lblTPS);
	}
	
	private void SetTextFieldsInput()
	{
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
	}
	
	private void SetComboBoxTPS()
	{
		comboBox = new JComboBox<ComboItem>();
		comboBox.setBounds(102, 150, 86, 20);
		comboBox.addItem(new ComboItem("Aprobado","1"));
		comboBox.addItem(new ComboItem("Desaprobado","2"));
		
		pnlNotas.add(comboBox);
	}
	
	private void SetBotones()
	{
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				 String nota1Text = txtNota1.getText();
				 double nota1 = Double.parseDouble(nota1Text);
				 
				 String nota2Text = txtNota2.getText();
				 double nota2 = Double.parseDouble(nota2Text);
				 
				 String nota3Text = txtNota3.getText();
				 double nota3 = Double.parseDouble(nota3Text);
				 
				 ComboItem selectedComboItem = (ComboItem) comboBox.getSelectedItem();				  
		         String selectedValue = selectedComboItem.getValue();		           		           
		         String valueGuardado = selectedValue;
		         
		         double promedio = (nota1 + nota2 + nota3) / 3.0;
		         
		         txtPromedio.setText(String.valueOf(promedio));
		         
		     
				if((nota1 >= 6 && nota2 >= 6 && nota3 >= 6) && selectedComboItem != null && valueGuardado == "1") {
					
					
					if(nota1 >= 8 && nota2 >= 8 && nota3 >= 8) {
						txtCondicion.setText("promocionado");
					}
					
					else {
						txtCondicion.setText("Regular");
					}
				}
				
				else {		
					txtCondicion.setText("libre");
				}
				
			}
		});
		btnCalcular.setForeground(SystemColor.desktop);
		btnCalcular.setBounds(359, 57, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 txtNota1.setText("");
				 txtNota2.setText("");;
				 txtNota3.setText("");;
				 txtPromedio.setText("");
				 txtCondicion.setText("");
				
			}
		});
		btnNuevo.setBounds(359, 103, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnSalir.setBounds(359, 154, 89, 23);
		contentPane.add(btnSalir);
		
	}
	
	private void SetPanelOutput()
	{
		pnlResultado = new JPanel();
		pnlResultado.setBorder(new TitledBorder(new LineBorder(new Color(153, 180, 209)), "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlResultado.setBounds(29, 261, 297, 110);
		contentPane.add(pnlResultado);
		pnlResultado.setLayout(null);
		
		this.SetLabelsOutput();
		this.SetTextFieldsOutput();
	}
	
	private void SetLabelsOutput()
	{
		JLabel lblPromedio = new JLabel("Promedio");
		lblPromedio.setBounds(29, 31, 58, 14);
		pnlResultado.add(lblPromedio);
		
		JLabel lblCondicion = new JLabel("Condicion");
		lblCondicion.setBounds(29, 68, 58, 14);
		pnlResultado.add(lblCondicion);
	}
	
	private void SetTextFieldsOutput()
	{
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

