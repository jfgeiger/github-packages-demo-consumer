package com.example;

import java.text.MessageFormat;

public class EnglishGreeting extends NameGreeting {

  protected EnglishGreeting(final String name) {
    super(name);
  }

  @Override
  public String get() {
    return MessageFormat.format("Hello {0}!", this.getName());
  }
}
