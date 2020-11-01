package barraProgreso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hilos implements Runnable
{
	JProgressBar Bar;
		public void run() 
		{
			for (int i = 0; i<=100; i++)
			{
				try 
				{
					Thread.sleep(30);		
				}
				catch (Exception e) 
				{	
				}
				this.getBar().setValue(i);
				if(this.getBar().getValue() == 100) {
					 JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
				}
			}
		}
			
			
	
	public void setBar(JProgressBar Bar) {
		this.Bar = Bar;
	}
	public JProgressBar getBar() {
		return Bar;
	}
	
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hilos window = new Hilos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hilos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JProgressBar miBarra = new JProgressBar();
		miBarra.setBounds(10, 45, 414, 68);
		frame.getContentPane().add(miBarra);
		
		JButton btnComenzar = new JButton("Comenzar");
		btnComenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Hilos Avance = new Hilos();
				Avance.setBar(miBarra);
		        Thread miHilo = new Thread(Avance);
		        miHilo.start();
			}
		});
		btnComenzar.setBounds(145, 147, 142, 43);
		frame.getContentPane().add(btnComenzar);
	}

}
