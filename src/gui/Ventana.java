package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import logica.Descriptiva;

public class Ventana {

	private JFrame frmEstadisticaDescriptiva;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum3;
	private JTextField txtNum4;
	private JTextField txtNum5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frmEstadisticaDescriptiva.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEstadisticaDescriptiva = new JFrame();
		frmEstadisticaDescriptiva.setTitle("Estadistica Descriptiva");
		frmEstadisticaDescriptiva.setBounds(100, 100, 450, 300);
		frmEstadisticaDescriptiva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEstadisticaDescriptiva.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Estadística Descriptiva");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(124, 24, 192, 14);
		frmEstadisticaDescriptiva.getContentPane().add(lblTitulo);
		
		JLabel lblNum1 = new JLabel("Número 1");
		lblNum1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNum1.setBounds(26, 72, 79, 14);
		frmEstadisticaDescriptiva.getContentPane().add(lblNum1);
		
		JLabel lblNum2 = new JLabel("Número 2");
		lblNum2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNum2.setBounds(26, 98, 79, 14);
		frmEstadisticaDescriptiva.getContentPane().add(lblNum2);
		
		JLabel lblNum3 = new JLabel("Número 3");
		lblNum3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNum3.setBounds(26, 123, 79, 14);
		frmEstadisticaDescriptiva.getContentPane().add(lblNum3);
		
		JLabel lblNum4 = new JLabel("Número 4");
		lblNum4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNum4.setBounds(26, 148, 79, 14);
		frmEstadisticaDescriptiva.getContentPane().add(lblNum4);
		
		JLabel lblNum5 = new JLabel("Número 5");
		lblNum5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNum5.setBounds(26, 173, 79, 14);
		frmEstadisticaDescriptiva.getContentPane().add(lblNum5);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(189, 69, 86, 20);
		frmEstadisticaDescriptiva.getContentPane().add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(189, 95, 86, 20);
		frmEstadisticaDescriptiva.getContentPane().add(txtNum2);
		txtNum2.setColumns(10);
		
		txtNum3 = new JTextField();
		txtNum3.setBounds(189, 120, 86, 20);
		frmEstadisticaDescriptiva.getContentPane().add(txtNum3);
		txtNum3.setColumns(10);
		
		txtNum4 = new JTextField();
		txtNum4.setBounds(189, 145, 86, 20);
		frmEstadisticaDescriptiva.getContentPane().add(txtNum4);
		txtNum4.setColumns(10);
		
		txtNum5 = new JTextField();
		txtNum5.setBounds(189, 170, 86, 20);
		frmEstadisticaDescriptiva.getContentPane().add(txtNum5);
		txtNum5.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/estadistica2-.jpg")));
		lblNewLabel_1_1.setBounds(317, 72, 107, 126);
		frmEstadisticaDescriptiva.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnProm = new JButton("Promedio");
		btnProm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(txtNum1.getText());
					double num2 = Double.parseDouble(txtNum2.getText());
					double num3 = Double.parseDouble(txtNum3.getText());
					double num4 = Double.parseDouble(txtNum4.getText());
					double num5 = Double.parseDouble(txtNum5.getText());
					Descriptiva calculo = new Descriptiva(num1,num2,num3,num4,num5);
					double prom = calculo.promedio();
					JOptionPane.showMessageDialog(null, "El promedio es: " + prom);
				}
				catch(NumberFormatException e2){
					JOptionPane.showMessageDialog(null, "chamo ponga numeros, colabore joven ", "Se pudrio todo", JOptionPane.DEFAULT_OPTION );

				}
			}
		});
		btnProm.setBounds(26, 227, 105, 23);
		frmEstadisticaDescriptiva.getContentPane().add(btnProm);
		
		JButton btnVar = new JButton("Varianza");
		btnVar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(txtNum1.getText());
					double num2 = Double.parseDouble(txtNum2.getText());
					double num3 = Double.parseDouble(txtNum3.getText());
					double num4 = Double.parseDouble(txtNum4.getText());
					double num5 = Double.parseDouble(txtNum5.getText());
					Descriptiva calculo = new Descriptiva(num1,num2,num3,num4,num5);
					double var = calculo.varianza();
					JOptionPane.showMessageDialog(null, "La varianza es: " + var);
				}
				catch(NumberFormatException e2){
					JOptionPane.showMessageDialog(null, "chamo ponga numeros, colabore joven ", "Se pudrio todo", JOptionPane.DEFAULT_OPTION );

				}
			}
		});
		btnVar.setBounds(175, 227, 107, 23);
		frmEstadisticaDescriptiva.getContentPane().add(btnVar);
		
		JButton btnDesv = new JButton("Desviación");
		btnDesv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(txtNum1.getText());
					double num2 = Double.parseDouble(txtNum2.getText());
					double num3 = Double.parseDouble(txtNum3.getText());
					double num4 = Double.parseDouble(txtNum4.getText());
					double num5 = Double.parseDouble(txtNum5.getText());
					Descriptiva calculo = new Descriptiva(num1,num2,num3,num4,num5);
					double desv = calculo.desviacion();
					JOptionPane.showMessageDialog(null, "La desviacion es: " + desv);
				}
				catch(NumberFormatException e2){
					JOptionPane.showMessageDialog(null, "chamo ponga numeros, colabore joven ", "Se pudrio todo", JOptionPane.DEFAULT_OPTION );

				}
			}
		});
		btnDesv.setBounds(315, 227, 109, 23);
		frmEstadisticaDescriptiva.getContentPane().add(btnDesv);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(175, 201, 106, 23);
		frmEstadisticaDescriptiva.getContentPane().add(btnSalir);
	}
}
