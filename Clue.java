import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/*
	https://serprogramador.es/programando-mensajes-de-dialogo-en-java-parte-1/
	PARA APRENDER MAS SOBRE VENTANAS EMERGENTES
*/

public class Clue extends JFrame implements MouseListener, ActionListener{
	public	JLabel e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;
	public 	JMenuBar bar;
	public 	JMenu m1,sm1,m2,m3;
	public 	JMenuItem o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13,o14,o15;
	public JButton b1,b2,b3;
	int opcion=1;

	public Clue(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(255,255,191));
		setTitle("Investigaccion");
		setIconImage(new ImageIcon(getClass().getResource("ifm.jpeg")).getImage());

	//Fuentes
		Font f1 = new Font ("Arial" , Font.BOLD, 20);
		Font f2 = new Font ("Arial" , Font.BOLD, 12);

	//---------------Barra de arriba
		bar = new JMenuBar();
		setJMenuBar(bar);
	//---------------Menus y agregamos a la Barra
		m1 = new JMenu ("Personajes");
		bar.add(m1);
		m2 = new JMenu ("Lugares");
		bar.add(m2);
		m3 = new JMenu ("Arma");
		bar.add(m3);
	//---------------Opciones menu 1 Peronajes
		o1 = new JMenuItem ("Ethan Hunt");
		m1.add(o1);
		o2 = new JMenuItem ("Benji Dunn");
		m1.add(o2);
		o3 = new JMenuItem ("Ilsa Faust");
		m1.add(o3);
		o4 = new JMenuItem ("Luther Stickell");
		m1.add(o4);
		o5 = new JMenuItem ("Julia");
		m1.add(o5);
	//---------------Opciones menu 2 Lugares
		o6 = new JMenuItem ("Casa");
		m2.add(o6);
		o7 = new JMenuItem ("Parque");
		m2.add(o7);	
		o8 = new JMenuItem ("Centro comercial");
		m2.add(o8);
		o9 = new JMenuItem ("Campo de tiro");
		m2.add(o9);
		o10 = new JMenuItem ("Montaña");
		m2.add(o10);
	//---------------Opciones menu 3 Armas
		o11 = new JMenuItem ("Cuchillo");
		m3.add(o11);
		o12 = new JMenuItem ("Pistola");
		m3.add(o12);	
		o13 = new JMenuItem ("Machete");
		m3.add(o13);
		o14 = new JMenuItem ("Pala");
		m3.add(o14);
		o15 = new JMenuItem ("Hacha");
		m3.add(o15);	
	//---------etiquetas
// pesonajes-------------------------------------------------------------------------------------------------------------------
		e2 = new JLabel ("Personajes");
		e2.setFont(f1);
		e2.setBounds(145,10,120,30);
		add(e2);
	//----------Tom Cruse
		ImageIcon i1 = new ImageIcon("tom.jpeg");
		e1 = new JLabel(i1);
		e1.setBounds(30,50,150,170);
		Icon icon1 = new ImageIcon (i1.getImage().getScaledInstance(e1.getWidth(),e1.getHeight(),Image.SCALE_DEFAULT));
		e1.setIcon(icon1);
		add(e1); 
		e3 = new JLabel ("Ethan Hunt");
		e3.setFont(f2);
		e3.setBounds(50,230,80,20);
		add(e3);
	//---------- Simon Pegg	
		ImageIcon i2 = new ImageIcon("simon.jpeg");
		e4 = new JLabel(i2);
		e4.setBounds(30,260,150,170);
		Icon icon2 = new ImageIcon (i2.getImage().getScaledInstance(e4.getWidth(),e4.getHeight(),Image.SCALE_DEFAULT));
		e4.setIcon(icon2);
		add(e4); 
		e5 = new JLabel ("Benji Dunn");
		e5.setFont(f2);
		e5.setBounds(50,440,80,20);
		add(e5);
	//----------Rebecca Ferguson
		ImageIcon i3 = new ImageIcon("rebecca.jpeg");
		e6 = new JLabel(i3);
		e6.setBounds(190,50,150,170);
		Icon icon3 = new ImageIcon (i3.getImage().getScaledInstance(e6.getWidth(),e6.getHeight(),Image.SCALE_DEFAULT));
		e6.setIcon(icon3);
		add(e6); 
		e7 = new JLabel ("Ilsa Faust");
		e7.setFont(f2);
		e7.setBounds(210,230,120,20);
		add(e7);
	//---------- Ving Rhames
		ImageIcon i4 = new ImageIcon("ving.jpeg");
		e8 = new JLabel(i4);
		e8.setBounds(190,260,150,170);
		Icon icon4 = new ImageIcon (i4.getImage().getScaledInstance(e1.getWidth(),e1.getHeight(),Image.SCALE_DEFAULT));
		e8.setIcon(icon4);
		add(e8); 
		e9 = new JLabel ("Luther Stickell");
		e9.setFont(f2);
		e9.setBounds(230,440,120,20);
		add(e9);
	//---------- Michelle Monaghan
		ImageIcon i5 = new ImageIcon("michelle.jpeg");
		e8 = new JLabel(i5);
		e8.setBounds(120,470,150,170);
		Icon icon5 = new ImageIcon (i5.getImage().getScaledInstance(e1.getWidth(),e1.getHeight(),Image.SCALE_DEFAULT));
		e8.setIcon(icon5);
		add(e8); 
		e9 = new JLabel ("Julia");
		e9.setFont(f2);
		e9.setBounds(170,650,120,20);
		add(e9);	
		
// lugares-------------------------------------------------------------------------------------------------------------------
		e2 = new JLabel ("Lugares");
		e2.setFont(f1);
		e2.setBounds(540,10,120,30);
		add(e2);
	//----------Casa
		ImageIcon i6 = new ImageIcon("casa.jpeg");
		e1 = new JLabel(i6);
		e1.setBounds(430,50,150,170);
		Icon icon6 = new ImageIcon (i6.getImage().getScaledInstance(e1.getWidth(),e1.getHeight(),Image.SCALE_DEFAULT));
		e1.setIcon(icon6);
		add(e1); 
		e3 = new JLabel ("Casa");
		e3.setFont(f2);
		e3.setBounds(460,230,80,20);
		add(e3);
	//---------- Parque
		ImageIcon i7 = new ImageIcon("parque.jpeg");
		e4 = new JLabel(i7);
		e4.setBounds(430,260,150,170);
		Icon icon7 = new ImageIcon (i7.getImage().getScaledInstance(e4.getWidth(),e4.getHeight(),Image.SCALE_DEFAULT));
		e4.setIcon(icon7);
		add(e4); 
		e5 = new JLabel ("Parque");
		e5.setFont(f2);
		e5.setBounds(460,440,80,20);
		add(e5);
	//----------Centro comercial
		ImageIcon i8 = new ImageIcon("centro.jpeg");
		e6 = new JLabel(i8);
		e6.setBounds(610,50,150,170);
		Icon icon8 = new ImageIcon (i8.getImage().getScaledInstance(e6.getWidth(),e6.getHeight(),Image.SCALE_DEFAULT));
		e6.setIcon(icon8);
		add(e6); 
		e7 = new JLabel ("Centro comercial");
		e7.setFont(f2);
		e7.setBounds(620,230,120,20);
		add(e7);
	//---------- Campo de tiro
		ImageIcon i9 = new ImageIcon("campo.jpeg");
		e8 = new JLabel(i9);
		e8.setBounds(610,260,150,170);
		Icon icon9 = new ImageIcon (i9.getImage().getScaledInstance(e1.getWidth(),e1.getHeight(),Image.SCALE_DEFAULT));
		e8.setIcon(icon9);
		add(e8); 
		e9 = new JLabel ("Campo de tiro");
		e9.setFont(f2);
		e9.setBounds(640,440,80,20);
		add(e9);
	//---------- Montaña 
		ImageIcon i10 = new ImageIcon("montana.jpeg");
		e8 = new JLabel(i10);
		e8.setBounds(520,470,150,170);
		Icon icon10 = new ImageIcon (i10.getImage().getScaledInstance(e1.getWidth(),e1.getHeight(),Image.SCALE_DEFAULT));
		e8.setIcon(icon10);
		add(e8); 
		e9 = new JLabel ("Montaña");
		e9.setFont(f2);
		e9.setBounds(540,650,120,20);
		add(e9);	
// armas-------------------------------------------------------------------------------------------------------------------
		e2 = new JLabel ("Armas");
		e2.setFont(f1);
		e2.setBounds(980,10,120,30);
		add(e2);
	//----------Cuchillo
		ImageIcon i11 = new ImageIcon("cuchillo.jpeg");
		e1 = new JLabel(i11);
		e1.setBounds(840,50,150,170);
		Icon icon11 = new ImageIcon (i11.getImage().getScaledInstance(e1.getWidth(),e1.getHeight(),Image.SCALE_DEFAULT));
		e1.setIcon(icon11);
		add(e1); 
		e3 = new JLabel ("Cuchillo");
		e3.setFont(f2);
		e3.setBounds(880,230,80,20);
		add(e3);
	//---------- Pistola
		ImageIcon i12 = new ImageIcon("pistola.jpeg");
		e4 = new JLabel(i12);
		e4.setBounds(840,260,150,170);
		Icon icon12 = new ImageIcon (i12.getImage().getScaledInstance(e4.getWidth(),e4.getHeight(),Image.SCALE_DEFAULT));
		e4.setIcon(icon12);
		add(e4); 
		e5 = new JLabel ("Pistola");
		e5.setFont(f2);
		e5.setBounds(880,440,80,20);
		add(e5);
	//---------- Machete
		ImageIcon i13 = new ImageIcon("machete.jpeg");
		e6 = new JLabel(i13);
		e6.setBounds(1010,50,150,170);
		Icon icon13 = new ImageIcon (i13.getImage().getScaledInstance(e6.getWidth(),e6.getHeight(),Image.SCALE_DEFAULT));
		e6.setIcon(icon13);
		add(e6); 
		e7 = new JLabel ("Machete");
		e7.setFont(f2);
		e7.setBounds(1030,230,120,20);
		add(e7);
	//---------- Pala
		ImageIcon i14 = new ImageIcon("pala.jpeg");
		e8 = new JLabel(i14);
		e8.setBounds(1010,260,150,170);
		Icon icon14 = new ImageIcon (i14.getImage().getScaledInstance(e1.getWidth(),e1.getHeight(),Image.SCALE_DEFAULT));
		e8.setIcon(icon14);
		add(e8); 
		e9 = new JLabel ("Pala");
		e9.setFont(f2);
		e9.setBounds(1040,440,80,20);
		add(e9);
	//---------- Hacha
		ImageIcon i15 = new ImageIcon("hacha.jpeg");
		e8 = new JLabel(i15);
		e8.setBounds(925,470,150,170);
		Icon icon15 = new ImageIcon (i15.getImage().getScaledInstance(e1.getWidth(),e1.getHeight(),Image.SCALE_DEFAULT));
		e8.setIcon(icon15);
		add(e8); 
		e9 = new JLabel ("Hacha");
		e9.setFont(f2);
		e9.setBounds(950,650,120,20);
		add(e9);
		
//------------- AYUDA
		e10 = new JLabel ("Ayuda");
		e10.setFont(f1);
		e10.setBounds(1250,600,80,30);
		add(e10);

//------------ Botones
		b1 = new JButton("Comenzar");
		b1.setBounds(1200,170,120,40);
		add(b1);

		b2 = new JButton("Solución");
		b2.setBounds(1200,280,120,40);
		add(b2);

		b3 = new JButton("Cerrar");
		b3.setBounds(1200,390,120,40);
		add(b3);

	//----------------Agregar las opciones al ActionListener
		o1.addActionListener(this);
		o2.addActionListener(this);
		o3.addActionListener(this);
		o4.addActionListener(this);
		o5.addActionListener(this);
		o6.addActionListener(this);
		o7.addActionListener(this);
		o8.addActionListener(this);
		o9.addActionListener(this);
		o10.addActionListener(this);
		o11.addActionListener(this);
		o12.addActionListener(this);
		o13.addActionListener(this);
		o14.addActionListener(this);
		o15.addActionListener(this);

	//----------------Agregar las opciones al MouseListener
		e10.addMouseListener(this);

	//----------------Agregar las opciones de botones
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);


	}//Fin del contructor 
//Metodos de MouseListener --------------------------------------------
	//Metodo mouseEntered**********
	public void mouseEntered (MouseEvent accion){
		if(accion.getSource() == e10){	
			JOptionPane.showMessageDialog(this,"Puedes realizar estas operaciones:\n1) Seleccionar el boton comenzar para saber la misión \n2) En el menú encontraras los 5 personajes, lugares y armas \n3) Selecciona la persona, lugar o arma que te interesa \n4) Presionar el boton Solucion para dar tus conclusiones \n5) Presiona boton cerrar para salir");
		}
	}
//Metodo mouseExited*************
public void mouseExited (MouseEvent accion){
		
}
//Metodo mousePressed*************
public void mousePressed (MouseEvent accion){
	
}
//Metodo mouseReleased*******************
public void mouseReleased (MouseEvent accion){

}
//Metodo mouseClicked***********************
public void mouseClicked (MouseEvent accion){

}

	//Metodo actionPerformed
	public void actionPerformed(ActionEvent m){	
	//----Menu 1
		if(m.getSource() == o1)
		{
			JOptionPane.showMessageDialog(this,"Ethan Hunt \n\nDice haber estado en el Centro Comercial \ncon Julia y vio el arma Pistola");
		}
		if(m.getSource() == o2)
		{
			JOptionPane.showMessageDialog(this,"Benji Dunn \n\nDice haber estado en el parque pero fue al campo de tiro \n" + //
					"por un hacha ya que su machete se estravio");
		}
		if(m.getSource() == o3)
		{
			JOptionPane.showMessageDialog(this,"Ilsa Faust \n\nDice haber estado en casa minutos antes \ncon Ethan Hunt y vio el arma cuchillo");
		}
		if(m.getSource() == o4)
		{
			JOptionPane.showMessageDialog(this,"Luther Stickell \n\nDice haber estado en campo de tiro \ncon la Pistola y vio el arma hacha \nque se la llevo Benji Dunn minutos despues");
		}
		if(m.getSource() == o5)
		{
			JOptionPane.showMessageDialog(this,"Julia \n\nDice haber estado en el Centro Comercial \nsola y vio el arma pala ");
		}
	//----Menu 2
		if(m.getSource() == o6)
		{
			JOptionPane.showMessageDialog(this,"En Casa \n\nNo hay camaras de seguridad pero se \nencuentra el arma cuchillo");
		}
		if(m.getSource() == o7)
		{
			JOptionPane.showMessageDialog(this,"Parque \n\nNo hay camaras de seguridad pero\nel lugar presenta arbustos en mal estado, \ngotas de sangre y rayones de algo con filo, \nno se encontro ningun arma");
		}
		if(m.getSource() == o8)
		{
			JOptionPane.showMessageDialog(this,"Centro comercial \n\nLas camaras muestran a Julia sola \ny el arma pala");
		}
		if(m.getSource() == o9)
		{
			JOptionPane.showMessageDialog(this,"Campo de tiro \n\nLas camaras muestran a Luther Stickell con la pistola\ny el arma hacha que llega Benji Dunn por ella ");
		}
		if(m.getSource() == o10)
		{
			JOptionPane.showMessageDialog(this,"Montaña \n\nNo hay camaras de seguridad pero se\nencuentran rastros de una camioneta \nque llego y dio vuelta cerca de donde \nse encontro el cuelpo de Solomon Lane");
		}
	//----Menu 3
		if(m.getSource() == o11)
		{
			JOptionPane.showMessageDialog(this,"Cuchillo \n\nSe encontró en la casa, \nno parece haber sido usada");
		}
		if(m.getSource() == o12)
		{
			JOptionPane.showMessageDialog(this,"Pistola \n\nSe encuentra en el campo de tiro \ny muestra haber sido disparada");
		}
		if(m.getSource() == o13)
		{
			JOptionPane.showMessageDialog(this,"Machete \n\nNo a sido localizada");
		}
		if(m.getSource() == o14)
		{
			JOptionPane.showMessageDialog(this,"Pala \n\nSe encuentra en el Centro Comercial \ny parece no haber sido usada");
		}
		if(m.getSource() == o15)
		{
			JOptionPane.showMessageDialog(this,"Hacha \n\nSe encuentra en el Parque \ny a sido usada");
		}
	//----Botones

		if(m.getSource() == b1){
			empezar v2 = new empezar();
			v2.setBounds(350,100,680,500);
			v2.setVisible(true);
			v2.setResizable(false);
		}
		if(m.getSource() == b2){
			solucion v2 = new solucion();
			v2.setBounds(350,100,680,500);
			v2.setVisible(true);
			v2.setResizable(false);
		}
		if(m.getSource() == b3){
			opcion = JOptionPane.showConfirmDialog(null," ¿Estas Seguro? " );
		}else{}
		if(opcion == 0){
			System.exit(0);
		}
		
	}//Fin del metodo actionPerformed

	//Main
	public static void main (String args [] ){
		Clue v = new Clue();
		v.setExtendedState(JFrame.MAXIMIZED_BOTH);
		v.setVisible(true);
		v.setResizable(false);
	}//Fin del main
}//Fin de la clase 