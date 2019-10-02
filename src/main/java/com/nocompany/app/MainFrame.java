package com.nocompany.app;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class MainFrame extends JFrame {

  private JTextArea textArea;

  private JButton btn;

  MainFrame() {
    super("Hello World");

    setLayout(new BorderLayout());

    textArea = new JTextArea();
    btn = new JButton("Click me");
    btn.addActionListener((actionEvent) -> textArea.append("Hello\n"));

    add(textArea, BorderLayout.CENTER);
    add(btn, BorderLayout.SOUTH);

    setSize(600, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
}
