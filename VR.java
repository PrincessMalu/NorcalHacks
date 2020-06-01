package puzzlevr;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.util.*;
import javax.swing.Icon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Container;
import java.net.URL;
import java.awt.Desktop;

public class VR extends JFrame //implements ActionListener
{ 
    URL VRlink;
    String link;
    private JButton press;
    private JFrame start;
    
    public VR(/*URL u*/) {
       // VRlink=u;
        link = VRlink.toString();
       setSize(626, 417);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Lobby");
        setLayout(null);

        Container c = getContentPane();
        c.setBackground(Color.PINK);
        
        press = new JButton("Good job :) Click to see your puzzle image in VR.");
        press.setBounds(170, 150, 300, 50);
        //press.addActionListener(this);
        c.add(press);
        
        ImageIcon bg = new ImageIcon(getClass().getResource("travel.png"));
        JLabel background = new JLabel("", bg, JLabel.CENTER);
        background.setBounds(0, 0, 626, 417);
        c.add(background);
        
    }
}

/*public void actionPerformed(ActionEvent e) {
     if (e.getSource() == press) {
            try {
    Desktop.getDesktop().browse(new URL(link).toURI());
} catch {
            
        }
}
}
*/