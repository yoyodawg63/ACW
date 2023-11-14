import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class UI {
  JFrame window;
  JPanel titleNamePanel, startButtonPanel;
  JLabel titleNameLabel;
  JButton startButton;
  Font titleFont = new Font("Times New Roman", Font.PLAIN, 40);
  Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);

  private JTextArea mainTextArea;
  private JButton saveButton, loadButton, statsButton, skillsButton, manualButton;
  private JPanel imagePanel, responsePanel;
  private JButton[] responseButtons;

  public void createUI() {
    window = new JFrame();
    window.setSize(1600, 1200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.getContentPane().setBackground(Color.BLACK);
    window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.Y_AXIS)); // Set BoxLayout in vertical orientation
    window.setVisible(true);

    titleNamePanel = new JPanel();
    titleNamePanel.setBackground(Color.BLACK);
    titleNamePanel.setBounds(100, 100, 600, 500);
    titleNameLabel = new JLabel("A Life To Be Lived: The American Civil War");
    titleNameLabel.setForeground(Color.WHITE);
    titleNameLabel.setFont(titleFont);
    titleNamePanel.add(titleNameLabel);

    startButtonPanel = new JPanel();
    startButtonPanel.setBackground(Color.BLACK);
    startButtonPanel.setBounds(300, 400, 200, 100);
    startButton = new JButton("START");
    startButton.setBackground(Color.BLACK);
    startButton.setForeground(Color.WHITE);
    startButton.setFont(normalFont);
    startButton.setFocusPainted(false);
    startButtonPanel.add(startButton);

    window.add(titleNamePanel);
    window.add(startButtonPanel);
    window.pack();
    window = new JFrame("Game Screen");
    window.setSize(800, 600);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setLayout(new BorderLayout());
    window.setVisible(true);

    // Main text area
    mainTextArea = new JTextArea();
    mainTextArea.setEditable(false);
    mainTextArea.setLineWrap(true);
    mainTextArea.setWrapStyleWord(true);
    JScrollPane scrollPane = new JScrollPane(mainTextArea);
    window.add(scrollPane, BorderLayout.CENTER);

    // Top panel with buttons
    JPanel topPanel = new JPanel();
    topPanel.setLayout(new FlowLayout());

    saveButton = new JButton("Save");
    loadButton = new JButton("Load");
    statsButton = new JButton("Stats");
    skillsButton = new JButton("Skills");
    manualButton = new JButton("Manual");

    topPanel.add(saveButton);
    topPanel.add(loadButton);
    topPanel.add(statsButton);
    topPanel.add(skillsButton);
    topPanel.add(manualButton);

    window.add(topPanel, BorderLayout.NORTH);

    // Right panel for images
    imagePanel = new JPanel();
    imagePanel.setBackground(Color.WHITE);
    imagePanel.setPreferredSize(new Dimension(200, 0));
    window.add(imagePanel, BorderLayout.EAST);

    // Bottom panel for responses
    responsePanel = new JPanel();
    responsePanel.setLayout(new GridLayout(2, 4));

    responseButtons = new JButton[8];
    for (int i = 0; i < 8; i++) {
      responseButtons[i] = new JButton("Response " + (i + 1));
      responseButtons[i].addActionListener(new ResponseButtonListener());
      responsePanel.add(responseButtons[i]);
    }

    window.add(responsePanel, BorderLayout.SOUTH);
  }

  private class ResponseButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      JButton button = (JButton) e.getSource();
      String buttonText = button.getText();
      mainTextArea.append("Selected response: " + buttonText + "\n");
    }
  }
}
