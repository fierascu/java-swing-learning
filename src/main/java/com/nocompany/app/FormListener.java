package com.nocompany.app;

import java.util.EventListener;

public interface FormListener extends EventListener {
  void formEventOccurred(FormEvent e);
}
