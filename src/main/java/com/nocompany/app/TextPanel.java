package com.nocompany.app;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class TextPanel extends JPanel {

  private JTextArea textArea = new JTextArea();

  TextPanel() {
    setLayout(new BorderLayout());
    add(new JScrollPane(textArea), BorderLayout.CENTER);
  }

  void appendText(String text) {
    textArea.append(text);
  }
}
