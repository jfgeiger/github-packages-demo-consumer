package com.example;

public abstract class NameGreeting implements Greeting {

  private final String name;

  protected NameGreeting(final String name) {
    this.name = name;
  }

  protected String getName() {
    return name;
  }
}
