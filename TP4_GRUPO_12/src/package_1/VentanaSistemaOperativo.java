package package_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class VentanaSistemaOperativo extends JFrame 
{
	private JPanel contentPane;
	private JPanel So;
	private JPanel Esp;
	private JPanel Esp2;
	private JPanel Esp3;
	private JPanel Horas;
	
	private JTextField txtHoras;
	
	private JRadioButton ButtonW;
	private JRadioButton ButtonM;
	private JRadioButton ButtonL;
	
	private JCheckBox CheckBox1;
	private JCheckBox CheckBox2;
	private JCheckBox CheckBox3;

	private ButtonGroup buttonGroup;

	public VentanaSistemaOperativo() 
	{
		setTitle("Seleccion multiple");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 446);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(13, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		this.SetPanelSistemaOperativo();
		this.AddSeccionSistemaOperativo();
		
		this.SetPanelEspecialidad();
		this.AddSeccionEspecialidad();
		
		this.SetPanelCantHoras();
		AddSeccionHoras();
		
		setVisible(true);
	}

	public void SetPanelSistemaOperativo() {
		So = new JPanel();
		So.setBounds(47, 56, 670, 27);
		So.setBorder(new LineBorder(new Color(0, 0, 0)));
		So.setForeground(Color.BLACK);
		contentPane.add(So);
		So.setLayout(new GridLayout(0, 4, 0, 0));
	}

	public void AddSeccionSistemaOperativo() {
		JLabel lblNewLabel = new JLabel("Elije un sistema Operativo: ");
		So.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));

		ButtonW = new JRadioButton("Windows");
		ButtonW.setFont(new Font("Tahoma", Font.PLAIN, 13));
		So.add(ButtonW);

		ButtonM = new JRadioButton("Mac");
		ButtonM.setFont(new Font("Tahoma", Font.PLAIN, 13));
		So.add(ButtonM);

		ButtonL = new JRadioButton("Linux");
		ButtonL.setFont(new Font("Tahoma", Font.PLAIN, 13));
		So.add(ButtonL);

		buttonGroup = new ButtonGroup();
		buttonGroup.add(ButtonM);
		buttonGroup.add(ButtonL);
		buttonGroup.add(ButtonW);
	}

	public void SetPanelEspecialidad() {
		Esp = new JPanel();
		Esp.setBounds(47, 111, 670, 96);
		Esp.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(Esp);
		Esp.setLayout(new GridLayout(1, 0, 0, 0));

		Esp2 = new JPanel();
		Esp2.setBorder(new EmptyBorder(0, 0, 0, 0));
		Esp.add(Esp2);
		Esp2.setLayout(new GridLayout(0, 1, 0, 0));

		Esp3 = new JPanel();
		Esp3.setBorder(new EmptyBorder(0, 0, 0, 0));
		Esp.add(Esp3);
		Esp3.setLayout(new BorderLayout(0, 0));
	}

	public void AddSeccionEspecialidad() {
		JLabel lblNewLabel_1 = new JLabel("Elije una especialidad");
		lblNewLabel_1.setForeground(SystemColor.windowText);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		Esp2.add(lblNewLabel_1);

		CheckBox1 = new JCheckBox("Programacion");
		CheckBox1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Esp3.add(CheckBox1, BorderLayout.NORTH);

		CheckBox2 = new JCheckBox("Administracion");
		CheckBox2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Esp3.add(CheckBox2, BorderLayout.CENTER);

		CheckBox3 = new JCheckBox("Dise\\u00F1o Grafico");
		CheckBox3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Esp3.add(CheckBox3, BorderLayout.SOUTH);
	}

	public void SetPanelCantHoras() {
		Horas = new JPanel();
		Horas.setBounds(47, 241, 670, 127);
		Horas.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.add(Horas);
		Horas.setLayout(null);
	}

	public void AddSeccionHoras() {
		JLabel lblNewLabel_2 = new JLabel("Cantidad de horas en el computador:");
		lblNewLabel_2.setBounds(38, 41, 272, 16);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Horas.add(lblNewLabel_2);

		txtHoras = new JTextField();
		txtHoras.setBounds(317, 38, 116, 22);
		Horas.add(txtHoras);
		txtHoras.setColumns(10);

		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new eventoBtnAceptar(ButtonW, ButtonM, ButtonL, CheckBox1, CheckBox2, CheckBox3, txtHoras));
		btnNewButton.setBounds(440, 98, 99, 27);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Horas.add(btnNewButton);
	}

	class eventoBtnAceptar implements ActionListener
	{
		private JRadioButton rdbtnWindows;
		private JRadioButton rdbtnMac;
		private JRadioButton rdbtnLinux;

		private JCheckBox chckbxAdministracion;
		private JCheckBox chckbxProgramacion;
		private JCheckBox chckbxDisenoGrfico;

		private JTextField txtHoras;

		public eventoBtnAceptar(JRadioButton rdbtnWindows, JRadioButton rdbtnMac, JRadioButton rdbtnLinux,
				JCheckBox chckbxAdministracion, JCheckBox chckbxProgramacion, JCheckBox chckbxDisenoGrfico,
				JTextField txtHoras) 
		{
			this.rdbtnWindows = rdbtnWindows;
			this.rdbtnMac = rdbtnMac;
			this.rdbtnLinux = rdbtnLinux;

			this.chckbxAdministracion = chckbxAdministracion;
			this.chckbxProgramacion = chckbxProgramacion;
			this.chckbxDisenoGrfico = chckbxDisenoGrfico;

			this.txtHoras = txtHoras;
		}

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			mostrarInformacion();
		}
		
		public void mostrarInformacion() 
		{
			String textDialog = "";

			if (rdbtnWindows.isSelected())
				textDialog += "Windows - ";

			if (rdbtnMac.isSelected())
				textDialog += "Mac - ";

			if (rdbtnLinux.isSelected())
				textDialog += "Linux - ";

			
			if (chckbxProgramacion.isSelected())
				textDialog += "Programacion - ";

			if (chckbxAdministracion.isSelected())
				textDialog += "Administracion - ";

			if (chckbxDisenoGrfico.isSelected())
				textDialog += "Diseño Grafico - ";

			
			textDialog += txtHoras.getText() + " Hs";

			JOptionPane.showMessageDialog(null, textDialog);
		}
	}
}
