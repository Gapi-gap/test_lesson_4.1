package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BonusService test  = new BonusService();
      long   BONUS = test.calculate(10000,true);
      System.out.println(BONUS);
    }
}