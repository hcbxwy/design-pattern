package com.hcbxwy.pattern.template;

public class ShutdownHookDemo {

  private static class ShutdownHook extends Thread {
    @Override
    public void run() {
      System.out.println("I am called during shutting down.");
    }
  }

  public static void main(String[] args) {
    Runtime.getRuntime().addShutdownHook(new ShutdownHook());
  }

}