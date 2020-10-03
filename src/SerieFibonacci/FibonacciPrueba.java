package SerieFibonacci;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;public class FibonacciPrueba {

	private JFrame frmSerieFibonacci;
	private JTextField txtValorInicial;
	private JTextField txtValorFinal;
	private JComboBox<Integer> cboMostrarLista;
	private JButton btnLimpiar;
	private JLabel lblNewLabel_2;
	private JTextField txtIncremento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FibonacciPrueba window = new FibonacciPrueba();
					window.frmSerieFibonacci.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FibonacciPrueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSerieFibonacci = new JFrame();
		frmSerieFibonacci.setTitle("Serie Fibonacci");
		frmSerieFibonacci.setBounds(100, 100, 581, 306);
		frmSerieFibonacci.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSerieFibonacci.getContentPane().setLayout(null);
		
		JButton btnMostrar = new JButton("Mostar Lista");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cboMostrarLista.setEditable(false);
				int VarX, VarY ,Incremento; 	
				VarX = Integer.parseInt(txtValorInicial.getText());
				VarY = Integer.parseInt(txtValorFinal.getText());
				Incremento= Integer.parseInt(txtIncremento.getText());
				for (int i = 1; i <=Incremento ; i++) {
					VarY= VarX+VarY;//2+2+0 ;2=2+2 =4 ;4=2+4 =6 ;6=4+6  =10;  10=6+10 =16;	     
 					VarX= VarY-VarX;//0=2-0 ;2=4-2 =2 ;2=6-2 =4 ;4=10-4 =6;	  6=16-6  =10;	 
					 cboMostrarLista.addItem(VarY);//2;4;6;10;16; 
				}
			}
		});
		
		
		btnMostrar.setBounds(192, 179, 150, 23);
		frmSerieFibonacci.getContentPane().add(btnMostrar);
		
		txtValorInicial = new JTextField();
		txtValorInicial.setBounds(192, 54, 150, 20);
		frmSerieFibonacci.getContentPane().add(txtValorInicial);
		txtValorInicial.setColumns(10);
		
		txtValorFinal = new JTextField();
		txtValorFinal.setBounds(192, 85, 150, 20);
		frmSerieFibonacci.getContentPane().add(txtValorFinal);
		txtValorFinal.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ingrese en valor incial");
		lblNewLabel.setBounds(20, 57, 132, 14);
		frmSerieFibonacci.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese el segundo valor ");
		lblNewLabel_1.setBounds(20, 77, 172, 36);
		frmSerieFibonacci.getContentPane().add(lblNewLabel_1);
		
		cboMostrarLista = new JComboBox<Integer>();
		cboMostrarLista.setBounds(368, 38, 176, 22);
		frmSerieFibonacci.getContentPane().add(cboMostrarLista);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cboMostrarLista.removeAllItems();	
				txtValorInicial.setText("");
				txtValorFinal.setText("");
				txtIncremento.setText("");
				
			}
		});
		btnLimpiar.setBounds(192, 213, 150, 23);
		frmSerieFibonacci.getContentPane().add(btnLimpiar);
		
		lblNewLabel_2 = new JLabel("Cantidad incremento maximo");
		lblNewLabel_2.setBounds(0, 124, 192, 14);
		frmSerieFibonacci.getContentPane().add(lblNewLabel_2);
		
		txtIncremento = new JTextField();
		txtIncremento.setBounds(192, 121, 150, 20);
		frmSerieFibonacci.getContentPane().add(txtIncremento);
		txtIncremento.setColumns(10);
	}
}
