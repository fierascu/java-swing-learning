package com.nocompany.app;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;

import javax.swing.JButton;
import javax.swing.JPanel;

class Toolbar extends JPanel implements ActionListener {

  private Consumer<String> textListener;

  Toolbar(Consumer<String> textListener) {
    this();
    this.textListener = textListener;
  }

  private Toolbar() {
    JButton helloButton = new JButton("Hello");
    helloButton.addActionListener(this);

    JButton goodbyeButton = new JButton("Goodbye");
    goodbyeButton.addActionListener(this);

    setLayout(new FlowLayout(FlowLayout.LEFT));

    add(helloButton);
    add(goodbyeButton);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JButton clicked = (JButton)e.getSource();
    if (textListener != null && clicked != null) {
      textListener.accept(clicked.getText() + '\n');
    }
  }
}