// Factorial Calculator - Modern UI

import java.awt.*;
import java.awt.event.*;

public class FactorialApp extends Frame {

    private TextField input, resultField;
    private Button calcBtn;

    public FactorialApp() {

        setTitle("Factorial Calculator - Modern UI");
        setSize(450, 350);
        setLayout(null);
        setBackground(new Color(245, 245, 245));

        Label heading = new Label("Factorial Calculator");
        heading.setBounds(120, 40, 220, 40);
        heading.setFont(new Font("SansSerif", Font.BOLD, 18));
        heading.setAlignment(Label.CENTER);

        Label label1 = new Label("Enter Number:");
        Label label2 = new Label("Result:");

        label1.setBounds(50, 110, 120, 30);
        label2.setBounds(50, 160, 120, 30);

        input = new TextField();
        resultField = new TextField();
        resultField.setEditable(false);

        input.setBounds(180, 110, 200, 30);
        resultField.setBounds(180, 160, 200, 30);

        calcBtn = new Button("Calculate");
        calcBtn.setBounds(170, 220, 100, 45);

        calcBtn.addActionListener(e -> {
            try {
                int n = Integer.parseInt(input.getText());
                long fact = 1;
                for(int i=1; i<=n; i++)
                    fact *= i;
                resultField.setText(Long.toString(fact));
            } catch(Exception ex) {
                resultField.setText("Invalid");
            }
        });

        add(heading);
        add(label1); add(input);
        add(label2); add(resultField);
        add(calcBtn);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new FactorialApp();
    }
}
