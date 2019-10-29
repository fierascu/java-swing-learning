package com.nocompany.app;

import java.util.EventObject;

class FormEvent extends EventObject {

  private String name;

  private String occupation;

  private int ageCategory;

  FormEvent(Object source) {
    super(source);
  }

  FormEvent(Object source, String name, String occupation, int ageCat) {
    super(source);

    this.name = name;
    this.occupation = occupation;
    this.ageCategory = ageCat;

  }

  String getName() {
    return name;
  }

  void setName(String name) {
    this.name = name;
  }

  String getOccupation() {
    return occupation;
  }

  void setOccupation(String occupation) {
    this.occupation = occupation;
  }

  int getAgeCategory() {
    return ageCategory;
  }

}
