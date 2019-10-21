package com.nocompany.app;

import java.awt.Dimension;

import javax.swing.JPanel;


class FormPanel extends JPanel {
	FormPanel() {
		Dimension dim = getPreferredSize();
		dim.width = 250;
		setPreferredSize(dim);
	}
}
