import java.awt.AWTException;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.*;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

class Ventana{
	int numeroSS = 1;
	Font a = new Font ("TimesRoman", Font.PLAIN, 20);
	JFrame frame = new JFrame("Pruebas");
	
	Ventana(){
		crearVentana();
	}

	private void crearVentana() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel labelTexto = new JLabel("Código: ");
		JTextField jtf1 = new JTextField();
		JTextField jtf2 = new JTextField();
		JButton btnPrueba = new JButton("Prueba");
		
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
		btnPrueba.addActionListener(new accionBtn());
		btnPrueba.addKeyListener(new accionBtn());
		
		frame.setLayout(null);
		frame.setVisible(true);
		//jtf2.requestFocus();
	}
	
	public class accionBtn implements ActionListener, KeyListener{		
		@Override
		public void actionPerformed(ActionEvent e) {
			/*try {
				Robot robot = new Robot();
				String path = "C:/Users/DIEGOALEJANDRONORIEG/Desktop/SS/screenshotCLICK"+numeroSS+".jpg";
				Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
				BufferedImage Image = robot.createScreenCapture(capture);
	            ImageIO.write(Image, "jpg", new File(path));
	            System.out.println("Screenshot saved");
	            numeroSS += 1;
			}catch(AWTException | IOException ex) {
				System.out.println(ex);
			}*/
			System.out.println("Hola");
		}
		@Override
		public void keyPressed(KeyEvent e) {
			/*try {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					Robot robot = new Robot();
					String path = "C:/Users/DIEGOALEJANDRONORIEG/Desktop/SS/screenshotENTER"+numeroSS+".jpg";
					Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
					BufferedImage Image = robot.createScreenCapture(capture);
		            ImageIO.write(Image, "jpg", new File(path));
		            System.out.println("Screenshot saved");
		            numeroSS += 1;
				}
				
			}catch(AWTException | IOException ex) {
				System.out.println(ex);
			}*/
			System.out.println("Hola");
		}
		@Override
		public void keyReleased(KeyEvent arg) {
			
		}
		@Override
		public void keyTyped(KeyEvent arg) {
			// TODO Auto-generated method stub
			
		}
	}
}

/*class robot{
	robot() throws AWTException{
		Robot robot = new Robot();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:/Users/DIEGOALEJANDRONORIEG/Desktop/prueba.txt"));
			String line = reader.readLine();
			
			while (line != null) {
				
				//mandar a clipboard el renglón ("line") del archivo .txt 
				StringSelection stringSelection = new StringSelection(line);
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				//copiar en jtextfield
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.delay(300);
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				
				
				line = reader.readLine();
			}
			
			robot.delay(300);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			reader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}*/

public class BotFrame {
	public static void main(String[] args) throws AWTException {
		new Ventana();
		//new robot();
	}
}
