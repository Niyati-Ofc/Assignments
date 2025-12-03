// Add & Subtract Calculator - Modern UI 
 
import java.awt.*; 
import java.awt.event.*; 
 
public class AddSubtractApp extends Frame 
{ 
 
    private TextField input1, input2, 
resultField; 
    private Button addBtn, subBtn; 
 
    public AddSubtractApp() { 
 
        setTitle("Add & Subtract - Modern UI"); 
		 setSize(480, 380); 
        setLayout(null); 
        setBackground(new Color(245, 245, 245)); // Light gray UI 
 
        Label heading = new Label("Add & Subtract Calculator"); 
        heading.setBounds(100, 40, 280, 40); 
        heading.setFont(new Font("SansSerif", Font.BOLD, 18)); 
        heading.setAlignment(Label.CENTER); 
 
        Label l1 = new Label("Enter 1st Number:"); 
        Label l2 = new Label("Enter 2nd Number:"); 
        Label l3 = new Label("Result:"); 
 
        l1.setBounds(50, 110, 130, 30); 
        l2.setBounds(50, 150, 130, 30); 
        l3.setBounds(50, 190, 130, 30);  
 
        input1 = new TextField(); 
        input2 = new TextField(); 
        resultField = new TextField(); 
        resultField.setEditable(false); 
 
        input1.setBounds(190, 110, 220, 30); 
        input2.setBounds(190, 150, 220, 30); 
        resultField.setBounds(190, 190, 220, 30); 
 
        addBtn = new Button("Add"); 
        subBtn = new Button("Subtract"); 
 
        addBtn.setBounds(120, 250, 100, 45);
		subBtn.setBounds(260, 250, 100, 45); 
 
        addBtn.addActionListener(e -> calculate('+')); 
        subBtn.addActionListener(e -> calculate('-')); 
 
        add(heading); 
        add(l1); add(input1); 
        add(l2); add(input2); 
        add(l3); add(resultField); 
        add(addBtn); add(subBtn); 
 
        addWindowListener(new WindowAdapter() { 
            public void windowClosing(WindowEvent e) { System.exit(0); } 
        });
		 setVisible(true); 
    } 
 
    private void calculate(char op) { 
        try { 
            int a = Integer.parseInt(input1.getText()); 
            int b = Integer.parseInt(input2.getText()); 
            int result = (op == '+') ? (a + b) : (a - b); 
            resultField.setText(Integer.toString(result)); 
        } catch (Exception ex) { 
            resultField.setText("Invalid"); 
        } 
    } 
 
    public static void main(String[] args) { 
        new AddSubtractApp(); 
    } 
}
