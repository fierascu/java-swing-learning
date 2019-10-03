package com.nocompany.app;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MainFrame extends JFrame {

  private Toolbar toolbar;

  private TextPanel textPanel;

  private JButton btn;

  MainFrame() {
    super("Hello World");

    setLayout(new BorderLayout());

    toolbar = new Toolbar();
    textPanel = new TextPanel();

    btn = new JButton("Click me");
    btn.addActionListener((actionEvent) -> textPanel.appendText("Hello\n"));

    add(toolbar, BorderLayout.NORTH);
    add(textPanel, BorderLayout.CENTER);
    add(btn, BorderLayout.SOUTH);

    setSize(600, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
}
