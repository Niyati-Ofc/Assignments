// Digit Counter App - Modern UI

import java.awt.*;
import java.awt.event.*;

public class DigitCounterApp extends Frame {

    private TextField input, resultField;
    private Button countBtn;

    public DigitCounterApp() {

        setTitle("Digit Counter - Modern UI");
        setSize(480, 360);
        setLayout(null);
        setBackground(new Color(245, 245, 245));

        Label heading = new Label("Digit Counter Tool");
        heading.setBounds(140, 40, 200, 40);
        heading.setFont(new Font("SansSerif", Font.BOLD, 18));
        heading.setAlignment(Label.CENTER);

        Label label1 = new Label("Enter Number:");
        Label label2 = new Label("Digit Count:");

        label1.setBounds(70, 120, 120, 30);
        label2.setBounds(70, 170, 120, 30);

        input = new TextField();
        resultField = new TextField();
        resultField.setEditable(false);

        input.setBounds(200, 120, 200, 30);
        resultField.setBounds(200, 170, 200, 30);

        countBtn = new Button("Count Digits");
        countBtn.setBounds(180, 230, 100, 45);

        countBtn.addActionListener(e -> {
            try {
                String num = input.getText().trim();
                int cnt = num.length();
                if(num.startsWith("-")) cnt--; // don't count minus sign
                resultField.setText(Integer.toString(cnt));
            } catch(Exception ex) {
                resultField.setText("Invalid");
            }
        });

        add(heading);
        add(label1); add(input);
        add(label2); add(resultField);
        add(countBtn);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new DigitCounterApp();
    }
}
