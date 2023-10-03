import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class divisas_temperatura extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					divisas_temperatura frame = new divisas_temperatura();
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
	public divisas_temperatura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 419, 121);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("DIVISAS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Divisas abrir = new Divisas();
				abrir.setVisible(true);
			}
		});
		btnNewButton.setBounds(90, 45, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("SELECCIONA UNA OPCION PARA REALIZAR LA CONVERSION");
		lblNewLabel.setBounds(47, 11, 301, 23);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("TEMPERATURA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Temperatura abrir = new Temperatura();
				abrir.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(194, 45, 105, 23);
		contentPane.add(btnNewButton_1);
	}
}
