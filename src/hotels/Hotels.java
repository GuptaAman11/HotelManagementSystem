package hotels;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Hotels extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1;
        
        public Hotels() {
		
                
                setSize(1950,1090);          // setContentPane(300,300,1366,390);   frame size
                setLayout(null);
               // setLocation(100,300);

		l1 = new JLabel("");
                b1 = new JButton("Next");
                
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
				
                
                ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/A1.jpeg"));
                Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2); 
                JLabel NewLabel = new JLabel(i3);
                NewLabel.setBounds(0, 0, 1950, 1000); 
                add(NewLabel);
               // ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/A1.jpeg"));
              //  Image i3 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
              //  ImageIcon i2 = new ImageIcon(i3);
              //  l1 = new JLabel(i2);
                
                JLabel lid=new JLabel("HOTEL MANAGEMENT SYSTEM");
                lid.setBounds(30,300,1500,100);
                lid.setFont(new Font("serif",Font.PLAIN,70));
                lid.setForeground(Color.red);
                l1.add(lid);
                
                b1.setBounds(1170,325,150,50);
		l1.setBounds(0, 0, 1366, 390);
                
                l1.add(b1);
		add(l1);
 
                b1.addActionListener(this);
                setVisible(true);
                
                while(true){
                        lid.setVisible(false); // lid =  j label
                    try{
                        Thread.sleep(500); //1000 = 1 second
                    }catch(Exception e){} 
                        lid.setVisible(true);
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){}
                }
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
                Hotels window = new Hotels();
                window.setVisible(true);			
	}
}
