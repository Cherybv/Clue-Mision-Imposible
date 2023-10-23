import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class solucion extends JFrame implements ActionListener, ItemListener{

	public JButton b,b1;
	public	JLabel e1,e2,e3,e4,e5,e6;
	public JComboBox <String> c1;
	public JComboBox <String> c2;
	public JComboBox <String> c3;
	int x=0;

	public solucion(){	//Inicio del constructor
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(255,255,230));
		setTitle("FMI");
		setIconImage(new ImageIcon(getClass().getResource("ifm.jpeg")).getImage());
	//Fuentes
		Font f1 = new Font ("Arial" , Font.BOLD, 18);
		Font f2 = new Font ("Arial" , Font.BOLD, 16);
	//	Font f3 = new Font ("Arial" , Font.BOLD, 12);
	//Botones
		b = new JButton("Aceptar");
		b.setBackground(new Color (194,155,97));
		b.setBounds(130,400,150,40);
		add(b);

		b1 = new JButton("Cerrar");
		b1.setBackground(new Color (194,155,97));
		b1.setBounds(300,400,150,40);
		add(b1);
	// Etiquetas
		e1 = new JLabel("Quién, donde y con qué asesinaron a Solomon Lane");
		e1.setBounds(50,15,500,60);
		e1.setFont(f1);
		add(e1);
		ImageIcon i = new ImageIcon("solomon.jpeg");
		e6 = new JLabel(i);
		e6.setBounds(400,100,250,210);
		Icon icon = new ImageIcon (i.getImage().getScaledInstance(e6.getWidth(),e6.getHeight(),Image.SCALE_DEFAULT));
		e6.setIcon(icon);
		add(e6);
		e1 = new JLabel("Solomon Lane");
		e1.setBounds(460,320,250,40);
		e1.setFont(f2);
		add(e1);
		
		e3 = new JLabel("Persona");
		e3.setBounds(25,120,80,20);
		e3.setFont(f2);
		add(e3);
		e4 = new JLabel("Lugar");
		e4.setBounds(25,190,80,20);
		e4.setFont(f2);
		add(e4);
		e5 = new JLabel("Arma");
		e5.setBounds(25,260,80,20);
		e5.setFont(f2);
		add(e5);


		// Listas Combinadas	
		c1 = new JComboBox <String> ();
		c1.setEditable(true);
		c1.setSelectedItem("Persona");
		c1.setBounds(25,150,160,30);
		add(c1);
		c1.addItem("Ethan Hunt");
		c1.addItem("Benji Dunn");
		c1.addItem("Ilsa Faust");
		c1.addItem("Luther Stickell");
		c1.addItem("Julia");

		c2 = new JComboBox <String> ();
		c2.setEditable(true);
		c2.setSelectedItem("Lugar");
		c2.setBounds(25,220,160,30);
		add(c2);
		c2.addItem("Casa");
		c2.addItem("Parque");
		c2.addItem("Centro comercial");
		c2.addItem("Campo de tiro");
		c2.addItem("Montaña");

		c3 = new JComboBox <String> ();
		c3.setEditable(true);
		c3.setSelectedItem("Arma");
		c3.setBounds(25,290,160,30);
		add(c3);
		c3.addItem("Cuchillo");
		c3.addItem("Pistola");
		c3.addItem("Machete");
		c3.addItem("Pala");
		c3.addItem("Hacha");
	//----------------Agregar las opciones de botones
		b.addActionListener(this);
		b1.addActionListener(this);
	//----------------Agregar las opciones de botones
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	}	//Fin del constructor

	public void itemStateChanged(ItemEvent accion){
		String sc1 = c1.getSelectedItem().toString();
		String sc2 = c2.getSelectedItem().toString();
		String sc3 = c3.getSelectedItem().toString();
		if(sc1 == "Ethan Hunt"){
			if(sc2 == "Parque"){
				if(sc3 == "Machete"){
					x=1;
				}
			}
			
		}
	}
	public void actionPerformed(ActionEvent accion){
		if(accion.getSource() == b){
			if(x == 1){
				JOptionPane.showMessageDialog(this,"Correcto");	
				x=0;
				dispose();
			}else{
				JOptionPane.showMessageDialog(this,"Incorrecto");	
			}
			dispose();
		}
		if(accion.getSource() == b1){
			dispose();		
		}
	}	

	public static void main (String args [] ){
		solucion v = new solucion();
		v.setBounds(500,200,680,500);
		v.setVisible(true);
		v.setResizable(false);
	}
}		