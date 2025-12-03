// Color Switcher App (Modern UI)  
 
import java.awt.*; 
import java.awt.event.*; 
 
public class ColorSwitcherApp { 
 
    public static void main(String[] args) { 
 
        Frame frame = new Frame("Color Switcher - Modern UI"); 
        frame.setSize(450, 350); 
        frame.setLayout(null); 
        frame.setBackground(new Color(240, 240, 240)); // soft theme 
 
        Label heading = new Label("Choose a Color"); 
        heading.setBounds(140, 60, 200, 40); 
        heading.setFont(new Font("SansSerif", Font.BOLD, 18)); 
        heading.setAlignment(Label.CENTER); 
 
        Button redBtn = new Button("Red"); 
        Button greenBtn = new Button("Green"); 
        Button blueBtn = new Button("Blue");
		redBtn.setBounds(50, 150, 100, 45); 
        greenBtn.setBounds(175, 150, 100, 45); 
        blueBtn.setBounds(300, 150, 100, 45); 
 
        redBtn.addActionListener(e -> frame.setBackground(Color.RED)); 
        greenBtn.addActionListener(e -> frame.setBackground(Color.GREEN)); 
        blueBtn.addActionListener(e -> frame.setBackground(Color.BLUE)); 
 
        frame.add(heading); 
        frame.add(redBtn); 
        frame.add(greenBtn); 
        frame.add(blueBtn); 
 
        frame.addWindowListener(new WindowAdapter() { 
            public void windowClosing(WindowEvent e) { System.exit(0); } 
        }); 
 
        frame.setVisible(true); 
    }
}
