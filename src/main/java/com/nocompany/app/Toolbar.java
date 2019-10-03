package com.nocompany.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

class Toolbar extends JPanel implements ActionListener {

  private JButton helloButton = new JButton("Hello");

  private JButton goodbyeButton = new JButton("Goodbye");

  private TextPanel textPanel;

  private StringListener textListener;

  Toolbar() {
    helloButton.addActionListener(this);
    goodbyeButton.addActionListener(this);

    add(helloButton);
    add(goodbyeButton);
  }

  void setTextPanel(TextPanel textPanel) {
    this.textPanel = textPanel;
  }

  void setStringListener(StringListener listener) {
    this.textListener = listener;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JButton clicked = (JButton)e.getSource();
    if (textListener != null && clicked != null) {
      textListener.textEmitted(clicked.getText() + '\n');
    }
  }
}