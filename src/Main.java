import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Main  {
	public static void setLocationasg(int x,int y){
		asg.setLocation(x, y);
		asg.setBackground(Color.BLACK);
	}
	
	public static void setLocationskrull(int x,int y){
		skrull1.setLocation(x, y);
		skrull1.setBackground(Color.BLACK);
	}
	
	public static void setLocationxandar(int x,int y){
		xandar1.setLocation(x, y);
		xandar1.setBackground(Color.BLACK);
	}
	
	
	
	static JFrame asg;
	static JFrame xandar1;
	static JFrame skrull1;
	static JFrame galli;
		
	public static void fasgard(){
		
		Planets asgard = new Planets();
		 
		 asgard.name="Asgard";
		 asgard.masa="7485784579";
		 asgard.vida="Si, Thor";
		 asgard.pop=" 397.345.234";
		 
			
		 asg =new JFrame("Asgard");
		 asg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 asg.getContentPane().setLayout(null);
		 asg.setPreferredSize(new Dimension(100,100));        
		// asg.setLocation(x,y);
		 asg.pack();
		 asg.setVisible(true);
		 
			JButton button3 = new JButton("Info");
			button3.setSize(40, 40);
			button3.addActionListener(
					
					new ActionListener(){
						
						@Override
						public void actionPerformed(ActionEvent e){
								Showinfo(asgard);
						}
				}
			);
			asg.add(button3);
	}	
	
	public static void fxandar(){
		Planets xandar = new Planets();
		 
		 xandar.name="Xandar";
		 xandar.masa="42698734";
		 xandar.vida="Nope";
		 xandar.pop=" 445.595.234";
		 
			
		 xandar1 =new JFrame("Xandar");
		 xandar1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 xandar1.getContentPane().setLayout(null);
		 xandar1.setPreferredSize(new Dimension(100,100));
		// xandar1.setLocation(x,y);
		 xandar1.pack();
		 xandar1.setVisible(true);
		

		JButton button1 = new JButton("Info");
		button1.setSize(40, 40);
		button1.addActionListener(
					new ActionListener(){
						
						@Override
						public void actionPerformed(ActionEvent e){
								Showinfo(xandar);
						}
				}
			);
			xandar1.add(button1);
	}
		 
	public  static void fskrull(){
		
		
		Planets skrull = new Planets();
		 
		 skrull.name="Skrull";
		 skrull.masa="347658794";
		 skrull.vida="Nope";
		 skrull.pop=" 445.595.234";
		 
		 skrull1 =new JFrame("Skrull");
		 skrull1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 skrull1.getContentPane().setLayout(null);
		 skrull1.setPreferredSize(new Dimension(100,100));
		// skrull1.setLocation(x,y);
		 skrull1.pack();
		 skrull1.setVisible(true);
		 
			JButton button2 = new JButton("Info");
			button2.setSize(40, 40);
			button2.addActionListener(
					
					new ActionListener(){
						
						@Override
						public void actionPerformed(ActionEvent e){
								Showinfo(skrull);
						}
				}
			);
			skrull1.add(button2);
					
	}
	
		public static void fgallif(){
			
			 Planets gallif = new Planets();
			 
			 gallif.name="Gallifrey";
			 gallif.masa="347658794";
			 gallif.vida="Yes, TimeLords";
			 gallif.pop=" 445.595.234";
				
				galli =new JFrame("gallifrey");
				 galli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 galli.getContentPane().setLayout(null);
				 galli.setPreferredSize(new Dimension(100,100));
				 galli.setLocation(550,300);
				 galli.pack();
				 galli.setVisible(true);
				
				 JButton button4 = new JButton("Info");
					button4.setSize(40, 40);
					button4.addActionListener(
							
							new ActionListener(){
								
								@Override
								public void actionPerformed(ActionEvent e){
										Showinfo(gallif);
								}
						}
					);
					galli.add(button4);
		}
		 
		
	
	 public static void main(String[] args) {
		 Hilo hilo=new Hilo("1");
		 hilo.start();
	 }
	 
	 public static void Showinfo(Planets object){
		 JFrame info =new JFrame("Información");
			info.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			info.getContentPane().setLayout(null);
			info.setPreferredSize(new Dimension(250,200));
			info.setLocation(1000,700);
			
			JLabel name = new JLabel();
			JLabel pop = new JLabel();
			JLabel live = new JLabel();
			JLabel mass = new JLabel();
			
			name.setBounds(20,20,200,25);
			pop.setBounds(20,20,200,50);
			live.setBounds(20,20,200,75);
			mass.setBounds(20,20,200,100);
			
			name.setLocation(20, 25);
			pop.setLocation(20, 50);
			live.setLocation(20,75);
			mass.setLocation(20,100);
			
			name.setText("Name: " +object.name);
			pop.setText("Population: "+object.pop);
			live.setText("Life:"+object.vida);
			mass.setText("Mass: "+object.masa);
			
			info.add(name);
			info.add(pop);
			info.add(live);
			info.add(mass);
			
			info.pack();
			info.setVisible(true);
			
		 
	 }

 }	

