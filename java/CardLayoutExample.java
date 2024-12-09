import javax.swing.*;
import java.awt.*;

public class CardLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Multi-step Interface");
        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);

        // First panel: Name registration
        JPanel namePanel = new JPanel();
        JTextField nameField = new JTextField(15);
        JButton nextButton = new JButton("Next");
        namePanel.add(new JLabel("Enter your name:"));
        namePanel.add(nameField);
        namePanel.add(nextButton);

        // Second panel: Main interface
        JPanel mainInterfacePanel = new JPanel();
        JLabel welcomeLabel = new JLabel();
        mainInterfacePanel.add(welcomeLabel);

        nextButton.addActionListener(e -> {
            String name = nameField.getText();
            if (!name.isEmpty()) {
                welcomeLabel.setText("Welcome, " + name + "!");
                cardLayout.show(mainPanel, "MainInterface");
            } else {
                JOptionPane.showMessageDialog(frame, "Please enter a name!");
            }
        });

        mainPanel.add(namePanel, "NameRegistration");
        mainPanel.add(mainInterfacePanel, "MainInterface");

        frame.add(mainPanel);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
