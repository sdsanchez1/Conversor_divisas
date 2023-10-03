import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Temperatura extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txt_temperatura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temperatura frame = new Temperatura();
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
	double valor;
	int divisa;
	public Temperatura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_temperatura = new JTextField();
		txt_temperatura.setBounds(48, 59, 86, 20);
		contentPane.add(txt_temperatura);
		txt_temperatura.setColumns(10);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBounds(262, 19, 1, 1);
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(contentPane_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(51, 64, 117, 23);
		contentPane_1.add(textField);
		
		JComboBox cbxTemp1 = new JComboBox();
		cbxTemp1.setModel(new DefaultComboBoxModel(new String[] {"Celcius", "Farenheit", "Kelvin"}));
		cbxTemp1.setBounds(144, 59, 80, 21);
		contentPane.add(cbxTemp1);
		
		JComboBox cbxTemp2 = new JComboBox();
		cbxTemp2.setModel(new DefaultComboBoxModel(new String[] {"Celcius", "Fahrenheit", "Kelvin"}));
		cbxTemp2.setBounds(234, 59, 83, 21);
		contentPane.add(cbxTemp2);
		
		JTextArea resultado = new JTextArea();
		resultado.setBounds(61, 142, 223, 99);
		contentPane.add(resultado);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor = Double.parseDouble(txt_temperatura.getText());
				int temperatura = cbxTemp1.getSelectedIndex();
				int tempFinal = cbxTemp2.getSelectedIndex();
	
				OperacionesTemp puente = new OperacionesTemp();
				
				puente.setValor(valor);
				puente.setTemperatura(temperatura);
				puente.setTempFinal(tempFinal);
				
				double resultadoFinal = puente.convertir();
				
				resultado.setText("");
				
				resultado.append(""+resultadoFinal);
			}
		});
		btnConvertir.setBounds(130, 108, 89, 23);
		contentPane.add(btnConvertir);
		
		JButton btnVolver = new JButton("Regresar");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				divisas_temperatura volver = new divisas_temperatura();
				volver.setVisible(true);
			}
		});
		btnVolver.setBounds(10, 11, 89, 23);
		contentPane.add(btnVolver);
		
	}
}
