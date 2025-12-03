// Reverse Number App - Modern UI 
 
import java.awt.*; 
import java.awt.event.*;
public class ReverseNumberApp extends Frame { 
 
    private TextField input, resultField;  
    private Button reverseBtn; 
 
    public ReverseNumberApp() { 
 
        setTitle("Reverse Number - Modern UI"); 
        setSize(460, 360); 
        setLayout(null); 
        setBackground(new Color(245, 245, 245)); 
 
        Label heading = new Label("Reverse Number Tool"); 
        heading.setBounds(130, 40, 220, 40); 
        heading.setFont(new Font("SansSerif", Font.BOLD, 18)); 
        heading.setAlignment(Label.CENTER); 
 
        Label label1 = new Label("Enter Number:"); 
        Label label2 = new Label("Reversed Value:"); 
 
        label1.setBounds(60, 120, 120, 30); 
        label2.setBounds(60, 170, 120, 30); 
 
        input = new TextField(); 
        resultField = new TextField(); 
        resultField.setEditable(false); 
 
        input.setBounds(200, 120, 200, 30); 
        resultField.setBounds(200, 170, 200, 30); 
 
        reverseBtn = new Button("Reverse"); 
        reverseBtn.setBounds(180, 230, 100, 45); 
 
        reverseBtn.addActionListener(e -> { 
            try { 
                long n = Long.parseLong(input.getText());
				  long rev = 0; 
                while(n != 0) { 
                    rev = rev * 10 + n % 10; 
                    n /= 10; 
                } 
                resultField.setText(Long.toString(rev)); 
            } catch(Exception ex) { 
                resultField.setText("Invalid"); 
            } 
        }); 
 
        add(heading); 
        add(label1); add(input); 
        add(label2); add(resultField); 
        add(reverseBtn); 
 
        addWindowListener(new WindowAdapter() { 
            public void windowClosing(WindowEvent e) { System.exit(0); } 
        }); 
 
        setVisible(true); 
    } 
 
    public static void main(String[] args) { 
        new ReverseNumberApp(); 
    } 
}