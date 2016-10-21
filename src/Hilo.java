import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Hilo extends Thread{

	
	
	public  String id;
	public boolean flag=true;
	private boolean alive;

	
	public Hilo (String id){
		
	this.id=id;
	
	}
	int x;
	int y;
	public void run(){
		Main.fasgard();
		Main.fxandar();
		Main.fskrull();
		Main.fgallif();
		JFrame menu =new JFrame("Menu");
		 menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 menu.getContentPane().setLayout(null);
		 menu.setPreferredSize(new Dimension(150,150));        
		 menu.setLocation(600,30);
		 menu.pack();
		 menu.setVisible(true);
		 
		 
		 JButton Play = new JButton("Play");
             Play.setSize(40, 40);
        	 menu.setLocation(10,30);
			 Play.addActionListener(
					
					new ActionListener(){
						
						@Override
						public void actionPerformed(ActionEvent e){
								play();
						}
				}
			);
			menu.add(Play);
			
			JButton pause = new JButton("Pause");
			pause.setSize(70, 40);
		    pause.setLocation(50,30);
			pause.addActionListener(
					
					new ActionListener(){
						
						@Override
						public void actionPerformed(ActionEvent e){
								pause();
						}
				}
			);
			menu.add(pause);
		while (flag){
			try {
				Main.setLocationskrull(550,450);
				Main.setLocationxandar(550,550);
				Main.setLocationasg(550,50);
				Thread.sleep(1000);
				Main.setLocationskrull(620,350);
				Main.setLocationxandar(620,500);
				Main.setLocationasg(650,400);
				Thread.sleep(1000);
				Main.setLocationskrull(550,415);
				Main.setLocationxandar(670,300);
				Main.setLocationasg(425,470);
				Thread.sleep(1000);
				Main.setLocationskrull(450,350);
				Main.setLocationxandar(550,50);
				Main.setLocationasg(300,300);
				Thread.sleep(1000);
				Main.setLocationxandar(400,250);
				Main.setLocationasg(150,70);
				Thread.sleep(1000);

				

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			/*if (flag==false){
				pause();
			}*/
		}
		
	}
	
	public void pause(){
		flag=false;
		while(flag==false){
			try {
				wait(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	synchronized void play(){
		flag=true;
		notify();
		
		
	}
}
