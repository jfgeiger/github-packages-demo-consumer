package com.example;

import java.text.MessageFormat;

public class FrenchGreeting extends NameGreeting {

  protected FrenchGreeting(final String name) {
    super(name);
  }

  @Override
  public String get() {
    return MessageFormat.format("Bonjour {0} !", this.getName());
  }
}
