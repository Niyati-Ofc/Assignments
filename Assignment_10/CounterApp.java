// Click Counter App - Modern UI 
 
import java.awt.*;
import java.awt.event.*; 
 
public class CounterApp extends Frame { 
 
    private TextField countField; 
    private Button countBtn, resetBtn;  
    private int count = 0; 
 
    public CounterApp() { 
 
        setTitle("Click Counter - Modern UI"); 
        setSize(460, 360); 
        setLayout(null); 
        setBackground(new Color(245, 245, 245)); 
 
        Label heading = new Label("Counter Application"); 
        heading.setBounds(130, 40, 220, 40); 
        heading.setFont(new Font("SansSerif", Font.BOLD, 18)); 
        heading.setAlignment(Label.CENTER); 
 
        Label l = new Label("Count Value:"); 
        l.setBounds(70, 130, 120, 30); 
 
        countField = new TextField("0"); 
        countField.setEditable(false); 
        countField.setBounds(200, 130, 200, 30); 
 
        countBtn = new Button("Count"); 
        resetBtn = new Button("Reset"); 
 
        countBtn.setBounds(120, 200, 100, 45); 
        resetBtn.setBounds(260, 200, 100, 45); 
 
        countBtn.addActionListener(e -> { 
            count++; 
            countField.setText(Integer.toString(count)); 
        });
		   resetBtn.addActionListener(e -> { 
            count = 0; 
            countField.setText("0"); 
        }); 
 
        add(heading); 
        add(l); add(countField); 
        add(countBtn); add(resetBtn); 
 
        addWindowListener(new WindowAdapter() { 
            public void windowClosing(WindowEvent e) { System.exit(0); } 
        }); 
 
        setVisible(true); 
    } 
 
    public static void main(String[] args) { 
        new CounterApp(); 
    } 
}