package package_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame 
{
	private JPanel contentPane;

	public VentanaPrincipal() {
		setResizable(false);
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
		
		JButton btnEjercicio1 = new JButton("Ejercicio 1");
		btnEjercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaContactos ventana = new VentanaContactos();
				ventana.setVisible(true);
			}
		});
		btnEjercicio1.setBounds(133, 114, 125, 31);
		contentPane.add(btnEjercicio1);
		
		JButton btnEjercicio2 = new JButton("Ejercicio 2");
		btnEjercicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPromedio ventana = new VentanaPromedio();
				ventana.setVisible(true);
			}
		});
		btnEjercicio2.setBounds(133, 167, 125, 31);
		contentPane.add(btnEjercicio2);
		
		JButton btnEjercicio3 = new JButton("Ejercicio 3");
		btnEjercicio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaSistemaOperativo v= new VentanaSistemaOperativo();
				v.setVisible(true);
			}
		});
		
		btnEjercicio3.setBounds(133, 219, 125, 31);
		contentPane.add(btnEjercicio3);
	}
	
	public void ChangeVisibility(boolean estado)
	{
		setVisible(estado);
	}

}
