
import javax.swing.*; 
import java.awt.*; 
public class MyButton  extends JButton{
    public MyButton (){
        ImageIcon image1 = new ImageIcon("/home/clayzzz/javaproject/learningOOP/GUI/Guessing Pokemon Game/src/logo.png");
        this.setIcon(image1);
        this.setText("No.003");
        this.setFont(new Font("MV Bolic", Font.ITALIC, 20));
        this.setBackground(new Color(0, 255, 128));
        this.setFocusable(false);
        this.setBounds(280,100 , 500, 230);
        this.setBorder(null);
        this.setHorizontalTextPosition(CENTER);
        this.setVerticalTextPosition(BOTTOM);        
    }
    
}
