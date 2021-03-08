package com.example;

public class Application {

  public static void main(String[] args) {
    final ConsoleGreeter consoleGreeter = new ConsoleGreeter();

    final Greeting frenchGreeting = new FrenchGreeting("GitHub");
    consoleGreeter.greet(frenchGreeting);

    final Greeting englishGreeting = new EnglishGreeting("World");
    consoleGreeter.greet(englishGreeting);
  }
}
