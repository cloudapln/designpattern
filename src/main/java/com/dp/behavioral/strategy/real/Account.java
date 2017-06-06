package com.dp.behavioral.strategy.real;
public class Account {
   private AccountType _act;
   public Account(String act) {
      try {
         Class c = Class.forName(act);
         this._act = (AccountType) c.newInstance();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   public void deposit(int amt) {
      this._act.deposit(amt);
   }
}