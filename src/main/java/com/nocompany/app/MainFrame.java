package com.nocompany.app;

import java.awt.BorderLayout;

import javax.swing.JFrame;

class MainFrame extends JFrame {

  MainFrame() {
    super("Hello World");
    setLayout(new BorderLayout());

    TextPanel textPanel = new TextPanel();
    Toolbar toolbar = new Toolbar(textPanel::appendText);
    FormPanel formPanel = new FormPanel();

    formPanel.setFormListener(e -> {
      String name = e.getName();
      String occupation = e.getOccupation();
      int ageCat = e.getAgeCategory();

      textPanel.appendText(name + ": " + occupation + ": " + ageCat + "\n");
    });

    add(formPanel, BorderLayout.WEST);
    add(toolbar, BorderLayout.NORTH);
    add(textPanel, BorderLayout.CENTER);

    setSize(600, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
}
