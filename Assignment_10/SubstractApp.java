// Subtraction App - Modern UI 
 
import java.awt.*; 
import java.awt.event.*; 
 
public class SubtractApp extends Frame {
 private TextField input1, input2, resultField; 
    private Button subtractBtn; 
 
    public SubtractApp() { 
 
        setTitle("Subtraction App - Modern UI"); 
        setSize(450, 350); 
        setLayout(null); 
        setBackground(new Color(245, 245, 245)); // Soft gray UI 
 
        Label heading = new Label("Subtraction Calculator"); 
        heading.setBounds(120, 40, 220, 40); 
        heading.setFont(new Font("SansSerif", Font.BOLD, 18)); 
        heading.setAlignment(Label.CENTER); 
 
        Label l1 = new Label("Enter 1st Number:"); 
        Label l2 = new Label("Enter 2nd Number:"); 
        Label l3 = new Label("Result:"); 
 
        l1.setBounds(50, 100, 120, 30); 
        l2.setBounds(50, 140, 120, 30); 
        l3.setBounds(50, 180, 120, 30); 
 
        input1 = new TextField(); 
        input2 = new TextField(); 
        resultField = new TextField(); 
        resultField.setEditable(false); 
 
        input1.setBounds(180, 100, 200, 30); 
        input2.setBounds(180, 140, 200, 30); 
        resultField.setBounds(180, 180, 200, 30); 
 
        subtractBtn = new Button("Subtract"); 
        subtractBtn.setBounds(170, 230, 100, 45); 
 
        subtractBtn.addActionListener(e -> { 
            try { 
                int a = Integer.parseInt(input1.getText()); 
                int b = Integer.parseInt(input2.getText()); 
                resultField.setText(Integer.toString(a - b)); 
            } catch (Exception ex) { 
                resultField.setText("Invalid"); 
            }
			 }); 
 
        add(heading); 
        add(l1); add(input1); 
        add(l2); add(input2); 
        add(l3); add(resultField); 
        add(subtractBtn); 
 
        addWindowListener(new WindowAdapter() { 
            public void windowClosing(WindowEvent e) { System.exit(0); } 
        }); 
 
        setVisible(true); 
    } 
 
    public static void main(String[] args) { 
        new SubtractApp(); 
    } 
}