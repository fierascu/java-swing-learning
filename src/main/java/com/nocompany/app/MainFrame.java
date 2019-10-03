package com.nocompany.app;

import java.awt.BorderLayout;

import javax.swing.JFrame;

class MainFrame extends JFrame {

  private Toolbar toolbar = new Toolbar();

  private TextPanel textPanel = new TextPanel();

  MainFrame() {
    super("Hello World");
    setLayout(new BorderLayout());

    toolbar.setTextPanel(textPanel);

    add(toolbar, BorderLayout.NORTH);
    add(textPanel, BorderLayout.CENTER);

    setSize(600, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
}
