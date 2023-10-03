import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Divisas extends JFrame {

	private JPanel contentPane;
	private JTextField txt_divisa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Divisas frame = new Divisas();
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
	public Divisas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_divisa = new JTextField();
		txt_divisa.setBounds(51, 64, 117, 23);
		contentPane.add(txt_divisa);
		txt_divisa.setColumns(10);
		
		JComboBox cbxDivisa1 = new JComboBox();
		cbxDivisa1.setBounds(191, 65, 46, 20);
		cbxDivisa1.setModel(new DefaultComboBoxModel(new String[] {"USD", "EUR", "COL", "LIBRAS ESTERLINAS", "YEN", "WON"}));
		contentPane.add(cbxDivisa1);
		
		JComboBox cbxDivisa2 = new JComboBox();
		cbxDivisa2.setBounds(247, 65, 46, 20);
		cbxDivisa2.setModel(new DefaultComboBoxModel(new String[] {"USD", "EUR", "COL", "LIBRAS ESTERLINAS", "YEN", "WON"}));
		contentPane.add(cbxDivisa2);
		
		JTextArea resultado = new JTextArea();
		resultado.setBounds(29, 174, 295, 113);
		contentPane.add(resultado);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor = Double.parseDouble(txt_divisa.getText());
				int divisa = cbxDivisa1.getSelectedIndex();
				int divisaFinal = cbxDivisa2.getSelectedIndex();
	
				Operaciones puente = new Operaciones();
				
				puente.setValor(valor);
				puente.setDivisa(divisa);
				puente.setDivisaFinal(divisaFinal);
				
				double resultadoFinal = puente.convertir();
				
				resultado.setText("");
				
				resultado.append(""+resultadoFinal);
			}
		});
		btnConvertir.setBounds(130, 117, 89, 23);
		contentPane.add(btnConvertir);
		
		JButton btnVolver = new JButton("Regresar");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				divisas_temperatura volver = new divisas_temperatura();
				volver.setVisible(true);
			}
		});
		btnVolver.setBounds(10, 11, 117, 23);
		contentPane.add(btnVolver);
		
	}

}
