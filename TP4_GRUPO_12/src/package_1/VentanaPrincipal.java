package package_1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame 
{
	private JPanel contentPane;
	
	private JButton btnEjercicio1;
	private JButton btnEjercicio2;
	private JButton btnEjercicio3;

	public VentanaPrincipal() 
	{
		setTitle("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 408);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblgrupo = new JLabel("GRUPO NRO 12");
		lblgrupo.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblgrupo.setHorizontalAlignment(SwingConstants.CENTER);
		lblgrupo.setBounds(10, 44, 125, 43);
		contentPane.add(lblgrupo);
		
		this.AgregarBotones();
	}
	
	public void ChangeVisibility(boolean estado)
	{
		setVisible(estado);
	}
	
	private void AgregarBotones() 
	{
		btnEjercicio1 = new JButton("Ejercicio 1");
		btnEjercicio1.addActionListener(new EventoBoton1());
		btnEjercicio1.setBounds(133, 114, 125, 31);
		contentPane.add(btnEjercicio1);
		
		btnEjercicio2 = new JButton("Ejercicio 2");
		btnEjercicio2.addActionListener(new EventoBoton2());
		btnEjercicio2.setBounds(133, 167, 125, 31);
		contentPane.add(btnEjercicio2);
		
		btnEjercicio3 = new JButton("Ejercicio 3");
		btnEjercicio3.addActionListener(new EventoBoton3());
		btnEjercicio3.setBounds(133, 219, 125, 31);
		contentPane.add(btnEjercicio3);
	}
	
	class EventoBoton1 implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			VentanaContactos ej1 = new VentanaContactos();
		}	
	}
	
	class EventoBoton2 implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			VentanaPromedio ej2 = new VentanaPromedio(); 
		}
	}
	
	class EventoBoton3 implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			VentanaSistemaOperativo ej3 = new VentanaSistemaOperativo(); 
		}
	}
	
}
