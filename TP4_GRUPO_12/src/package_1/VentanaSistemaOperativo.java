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
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;

public class VentanaSistemaOperativo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSistemaOperativo frame = new VentanaSistemaOperativo();
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
	public VentanaSistemaOperativo() {
		setTitle("Seleccion multiple");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(13, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel So = new JPanel();
		So.setBounds(47, 56, 670, 27);
		So.setBorder(new LineBorder(new Color(0, 0, 0)));
		So.setForeground(Color.BLACK);
		contentPane.add(So);
		So.setLayout(new GridLayout(0, 4, 0, 0));
		
		JPanel So2 = new JPanel();
		So2.setBorder(new EmptyBorder(0, 0, 0, 0));
		So.add(So2);
		So2.setLayout(null);
		JLabel lblNewLabel = new JLabel("Elije un sistema Operativo");
		lblNewLabel.setBounds(0, 5, 167, 16);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		So2.add(lblNewLabel);
		
		JRadioButton ButtonW = new JRadioButton("Windows");
		ButtonW.setFont(new Font("Tahoma", Font.PLAIN, 13));
		So.add(ButtonW);
		
		JRadioButton ButtonM = new JRadioButton("Mac");
		ButtonM.setFont(new Font("Tahoma", Font.PLAIN, 13));
		So.add(ButtonM);
		
		JRadioButton ButtonL = new JRadioButton("Linux");
		ButtonL.setFont(new Font("Tahoma", Font.PLAIN, 13));
		So.add(ButtonL);
		
		JPanel Esp = new JPanel();
		Esp.setBounds(47, 111, 670, 96);
		Esp.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(Esp);
		Esp.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel Esp2 = new JPanel();
		Esp2.setBorder(new EmptyBorder(0, 0, 0, 0));
		Esp.add(Esp2);
		Esp2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Elije una especialidad");
		lblNewLabel_1.setForeground(SystemColor.windowText);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		Esp2.add(lblNewLabel_1);
		
		JPanel Esp3 = new JPanel();
		Esp3.setBorder(new EmptyBorder(0, 0, 0, 0));
		Esp.add(Esp3);
		Esp3.setLayout(new BorderLayout(0, 0));
		
		JCheckBox CheckBox1 = new JCheckBox("Programaci\u00F3n");
		CheckBox1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Esp3.add(CheckBox1, BorderLayout.NORTH);
		
		JCheckBox CheckBox2 = new JCheckBox("Administraci\u00F3n");
		CheckBox2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Esp3.add(CheckBox2, BorderLayout.CENTER);
		
		JCheckBox CheckBox3 = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		CheckBox3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Esp3.add(CheckBox3, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		panel.setBounds(47, 241, 670, 127);
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Cantidad de horas en el computador:");
		lblNewLabel_2.setBounds(38, 41, 272, 16);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(317, 38, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(440, 98, 99, 27);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(btnNewButton);
		

		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(ButtonM);
		buttonGroup.add(ButtonL);
		buttonGroup.add(ButtonW);
		
		
	}
}
