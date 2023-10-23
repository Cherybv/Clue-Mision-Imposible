import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class empezar extends JFrame implements ActionListener{

	public JButton b,b1,b2;
	public	JLabel e1,e2,e6;
	public JTextArea a;
	String h;
	int opcion=1;

	public empezar(){	//Inicio del constructor
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(255,255,230));
		setTitle("FMI");
		setIconImage(new ImageIcon(getClass().getResource("ifm.jpeg")).getImage());
	//Fuentes
		Font f1 = new Font ("Arial" , Font.BOLD, 18);
		Font f2 = new Font ("Arial" , Font.BOLD, 16);
		//Font f3 = new Font ("Arial" , Font.BOLD, 12);
	//Botones
		b = new JButton("Aceptar");
		b.setBackground(new Color (194,155,97));
		b.setBounds(130,400,150,40);
		add(b);

		b1 = new JButton("Abrir Misión");
		b1.setBackground(new Color (194,155,97));
		b1.setBounds(130,70,150,40);
		add(b1);

		b2 = new JButton("Cancelar");
		b2.setBackground(new Color (194,155,97));
		b2.setBounds(400,400,150,40);
		add(b2);
	// Etiquetas
		e1 = new JLabel("Asesinato de Solomon Lane");
		e1.setBounds(200,15,350,60);
		e1.setFont(f1);
		add(e1);
		ImageIcon i = new ImageIcon("solomon.jpeg");
		e6 = new JLabel(i);
		e6.setBounds(400,100,250,210);
		Icon icon = new ImageIcon (i.getImage().getScaledInstance(e6.getWidth(),e6.getHeight(),Image.SCALE_DEFAULT));
		e6.setIcon(icon);
		add(e6);
		e1 = new JLabel("Solomon Lane");
		e1.setBounds(460,320,230,80);
		e1.setFont(f2);
		add(e1);

		h=("Buenas tardes Agente 007 \n\n" + //
				"El anarquista Solomon Lane, el cual fue capturado por tu\n" + //
				"equipo hace dos años, condenado a 89 años de prisión por\n" + //
				"oposición a la ley y terrorismo en contra del estado. \n" + //
				"Hace dos semanas su grupo Los Apóstoles organizaron un plan\n" + //
				"de huida, desde entonces se colocó en la lista de los más\n" + //
				"buscados, el Pentágono realizó búsquedas  en el estado sin\n" + //
				"éxito, hasta el día de ayer que su cuerpo fue encontrado en\n" + //
				"la Montaña con signos de agresión, estrangulamiento,\n" + //
				"tortura, laceramiento en miembros superiores e inferiores.\n\n" + //
				"Su misión si decide aceptarla, es encontrar al asesino entre\n" + //
				"el grupo de Los Apostoles");

		//Areas de texto-----------------------------------
		a = new JTextArea("");
		a.setBounds(10,120,370,250);
		add(a);
	//----------------Agregar las opciones de botones
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}	//Fin del constructor

	public void actionPerformed(ActionEvent accion){	
		if(accion.getSource() == b){
			JOptionPane.showMessageDialog(this,"Este mensaje se autodestruirá en 3 segundos");
			try {
				Thread.sleep(3000); // Pausa de 5 segundos
				}catch (InterruptedException e) {
					// Manejo de excepciones
				}
			dispose();		
		}
		if(accion.getSource() == b1){
			a.setText(h);		
		}
		if(accion.getSource() == b2){
			opcion = JOptionPane.showConfirmDialog(null," ¿Estas Seguro? " );
		}else{}
		if(opcion == 0){
			dispose();		
		}

	}	

	public static void main (String args [] ){
		empezar v = new empezar();
		v.setBounds(500,200,680,500);
		v.setVisible(true);
		v.setResizable(false);
	}
}		