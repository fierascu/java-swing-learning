package com.nocompany.app;

import java.awt.BorderLayout;

import javax.swing.JFrame;

class MainFrame extends JFrame {

  MainFrame() {
    super("Hello World");
    setLayout(new BorderLayout());

    TextPanel textPanel = new TextPanel();
    Toolbar toolbar = new Toolbar(textPanel, textPanel::appendText);

    add(toolbar, BorderLayout.NORTH);
    add(textPanel, BorderLayout.CENTER);

    setSize(600, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
}
