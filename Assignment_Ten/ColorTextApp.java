// Text Color Switcher - Modern UI 
 
import java.awt.*; 
import java.awt.event.*; 
 
public class ColorTextApp extends Frame { 
 
    public ColorTextApp() {
	  setTitle("Text Color Switcher - Modern UI"); 
        setSize(480, 380); 
        setLayout(null); 
        setBackground(new Color(245, 245, 245)); 
 
        Label heading = new Label("Change Text Color"); 
        heading.setBounds(130, 40, 230, 40); 
        heading.setFont(new Font("SansSerif", Font.BOLD, 18)); 
        heading.setAlignment(Label.CENTER); 
 
        Label msg = new Label("WELCOME    "); 
        msg.setBounds(160, 110, 180, 40); 
        msg.setFont(new Font("SansSerif", Font.BOLD, 22)); 
        msg.setAlignment(Label.CENTER); 
 
        Button redBtn = new Button("Red"); 
        Button greenBtn = new Button("Green"); 
        Button blueBtn = new Button("Blue"); 
 
        redBtn.setBounds(60, 200, 100, 45); 
        greenBtn.setBounds(190, 200, 100, 45); 
        blueBtn.setBounds(320, 200, 100, 45); 
 
        redBtn.addActionListener(e -> 
msg.setForeground(Color.RED)); 
        greenBtn.addActionListener(e -> msg.setForeground(Color.GREEN)); 
        blueBtn.addActionListener(e -> msg.setForeground(Color.BLUE)); 
 
        add(heading); 
        add(msg); 
        add(redBtn); 
        add(greenBtn); 
        add(blueBtn); 
 
        addWindowListener(new WindowAdapter() { 
            public void windowClosing(WindowEvent e) { System.exit(0); } 
			}); 
 
        setVisible(true); 
    } 
 
    public static void main(String[] args) { 
        new ColorTextApp(); 
    } 
}
