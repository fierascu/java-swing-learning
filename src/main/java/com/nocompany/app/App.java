package com.nocompany.app;

import javax.swing.SwingUtilities;

public class App {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(MainFrame::new);
  }
}
