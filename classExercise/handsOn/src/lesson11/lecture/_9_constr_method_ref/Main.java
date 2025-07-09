package lesson11.lecture._9_constr_method_ref;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Main extends JFrame {

    public Main() throws HeadlessException {
        super("Lecture 11 - Method Reference Example");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout( new FlowLayout() );
        //cfreate a button
        JButton button = new JButton("ok");
        add(button);

        List<String> labelsForButtons = List.of("Button 1", "Button 2", "Button 3", "Button 4", "Button 5");
        labelsForButtons.stream()
                .map(JButton::new) // Method reference to JButton constructor :::: data -> new JButton(data)
                .forEach(data -> add(data)); // Add each button to the JFrame

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(()->new Main().setVisible(true));
    }
}
