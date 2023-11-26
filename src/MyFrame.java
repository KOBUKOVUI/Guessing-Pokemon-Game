import javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
public class MyFrame extends JFrame {
    MyPanel panel1; 
    MyButton button1; 
    MyLabel label1; 

    public MyFrame(){
        //set the frame;
        this.setSize(1080, 720);
        this.setTitle("Guessing Pokemon Game");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(0, 255, 128));
        ImageIcon image1 = new ImageIcon("/home/clayzzz/javaproject/learningOOP/GUI/Guessing Pokemon Game/src/logo.png");
        this.setIconImage(image1.getImage());
        this.setVisible(true);
        //set the button 
        button1 = new MyButton(); 
        this.add(button1);
        // set the label and panel display first;
        panel1 = new MyPanel(); 
        label1 = new MyLabel("Who's that pokemon ?"); 
        panel1.add(label1); 
        this.add(panel1); 
        label1.setVisible(true);
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button1){
                    button1.setEnabled(true);
                    label1.setText("This is a Venusaur");
                }
            }
            
        };
        button1.addActionListener(actionListener);
    }
  
}
