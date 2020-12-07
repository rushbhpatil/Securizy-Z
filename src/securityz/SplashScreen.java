/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securityz;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Rushi Dada
 */
public class SplashScreen {
    JFrame frame;
    JLabel image=new JLabel(new ImageIcon("D:\\Java Project\\SecurityZ\\src\\securityz\\Images\\Welcome2.jpg"));
    JProgressBar progressBar=new JProgressBar();
    JLabel load = new JLabel();
   
    SplashScreen()
    {
        createGUI();
        addload();
        addImage();
        addProgressBar();
        runningPBar();        
    }
    
    public void createGUI(){
        frame=new JFrame();
        frame.getContentPane().setLayout(null);//setting layout to null
        frame.setUndecorated(true);//Turning off Title bar
        frame.setSize(612,345);//Setting size
        frame.setLocationRelativeTo(null);//Setting location to the center of screen
        frame.getContentPane().setBackground(Color.black);//setting background color
        frame.setVisible(true);//setting visibility
        }
    public void addImage(){
        image.setSize(612,345);//Setting size of the image
        frame.add(image);//Adding image to the frame
    }
    
    public void addProgressBar(){
        progressBar.setBounds(100,300,400,20);//Setting Location and size
        progressBar.setBorderPainted(false);//Setting border painted property
        progressBar.setStringPainted(true);//Setting String painted property
        progressBar.setBackground(Color.black);//setting background color
        progressBar.setForeground(Color.DARK_GRAY);//setting foreground color
        progressBar.setValue(0);//setting progress bar current value
        frame.add(progressBar);//adding progress bar to frame
        
    }
    public void addload()
    {
        load.setVisible(true);
        load.setText("Please wait...");
        load.setBounds(100,315,400,30);//Setting the size and location of the label
        load.setForeground(Color.MAGENTA);//Setting foreground Color
        load.setFont(new Font("TIMES NEW ROMAN",Font.ITALIC,11));//Setting font properties
        frame.add(load);
    }
    
    public void runningPBar(){
        int i=0;//Creating an integer variable and intializing it to 0
 
        while( i<=100)
        {
            try{
                Thread.sleep(80);//Pausing execution for 80 milliseconds
                progressBar.setValue(i);//Setting value of Progress Bar
                i++;
                
                if(i==100)
                    frame.dispose();
                
            }catch(Exception e){
                e.printStackTrace();
            }
 
 
 
        }
    }
    
    public static void main(String a[])
    {
        new SplashScreen();
        new Login().setVisible(true);
 
        
    }
}
