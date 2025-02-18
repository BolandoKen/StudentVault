import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame {
    public GUI() {
        this.setSize(1280, 832);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel background = new JPanel(new GridBagLayout());
        background.setBackground(new Color(0x5C2434));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weighty = 1.0;

        JPanel sidePanel = new JPanel();
        sidePanel.setBackground(new Color(0x5C2434));
        gbc.gridx = 0;
        gbc.weightx = 0.05;
        background.add(sidePanel, gbc);

        JPanel column2 = new JPanel(new GridBagLayout());
        column2.setBackground(Color.WHITE);
        gbc.gridx = 1;
        gbc.weightx = 0.7;
        background.add(column2, gbc);

        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.fill = GridBagConstraints.BOTH;
        gbc2.weightx = 1.0;

        JPanel row1 = new JPanel(new GridBagLayout());
        row1.setBackground(Color.WHITE);
        gbc2.gridy = 0;
        gbc2.weighty = 0.02;
        gbc2.weightx = 1.0;
        column2.add(row1, gbc2);

        JTextField searchField = new RoundedTextField(200, 10);
        searchField.setPreferredSize(new Dimension(480, 40));
        searchField.setMinimumSize(new Dimension(480, 40));
        searchField.setMaximumSize(new Dimension(1000, 40));
        searchField.setBackground(new Color(0xE7E7E7));
        searchField.setFont(new Font("Helvetica", Font.PLAIN, 18));

        searchField.addActionListener(e -> {
            String query = searchField.getText();
            System.out.println("Searching for: " + query);
        });

        gbc2.gridx = 0;
        gbc2.weightx = 1.0;
        gbc2.insets = new Insets(10, 10, 10, 0);
        row1.add(searchField, gbc2);

        ImageIcon filterIcon = new ImageIcon("Assets/FilterIcon.png");
        JButton filterButton = new JButton(filterIcon);
        filterButton.setPreferredSize(new Dimension(40, 40));
        filterButton.setBackground(new Color(0x5C2434));
        filterButton.setBorderPainted(false);
        filterButton.setFocusPainted(false);
        filterButton.setContentAreaFilled(false);

        filterButton.setMargin(new Insets(0, 10, 0, 10)); 

        gbc2.gridx = 1;
        gbc2.weightx = 0.0;
        gbc2.insets = new Insets(10, 0, 10, 0);
        row1.add(filterButton, gbc2);

        filterButton.addActionListener(e -> {
            System.out.println("Filtering");
        });

        JPanel row2 = new JPanel(new GridBagLayout());
        row2.setBackground(new Color(0xF4F1A3));
        gbc2.gridy = 1;
        gbc2.weighty = 0.98;
        column2.add(row2, gbc2);

        this.add(background);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}
