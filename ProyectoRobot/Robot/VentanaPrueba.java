import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaPrueba {
	public static void main(String[] args) {
		Font a = new Font ("TimesRoman", Font.PLAIN, 20);
		JFrame frame = new JFrame("VENTANA PRUEBA");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel labelTexto = new JLabel("Código: ");
		JTextField jtf1 = new JTextField();
		JTextField jtf2 = new JTextField();
		JButton btnPrueba = new JButton("Prueba");
		frame.setAlwaysOnTop(true);
		//frame.requestFocus();
		
		frame.setSize(500, 300);
		labelTexto.setBounds(10, 10, 100, 50);
		jtf1.setBounds(120, 10, 150, 20);
		jtf1.setSize(200,50);
		jtf2.setBounds(120, 60, 150, 20);
		jtf2.setSize(200,50);
		btnPrueba.setBounds(10, 80, 100, 50);
		
		frame.add(labelTexto);
		frame.add(jtf1);
		frame.add(jtf2);
		frame.add(btnPrueba);
		
		labelTexto.setFont(a);
		jtf1.setFont(a);
		jtf2.setFont(a);
		btnPrueba.setFont(a);
		
		frame.setLayout(null);
		frame.setVisible(true);
		//jtf2.requestFocus();
	}

}
