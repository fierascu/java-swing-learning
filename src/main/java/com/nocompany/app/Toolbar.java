package com.nocompany.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

class Toolbar extends JPanel implements ActionListener {

  private TextPanel textPanel;

  private StringListener textListener;

  Toolbar(TextPanel textPanel, StringListener textListener) {
    this();
    this.textPanel = textPanel;
    this.textListener = textListener;
  }

  private Toolbar() {
    JButton helloButton = new JButton("Hello");
    helloButton.addActionListener(this);

    JButton goodbyeButton = new JButton("Goodbye");
    goodbyeButton.addActionListener(this);

    add(helloButton);
    add(goodbyeButton);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JButton clicked = (JButton)e.getSource();
    if (textListener != null && clicked != null) {
      textListener.textEmitted(clicked.getText() + '\n');
    }
  }
}