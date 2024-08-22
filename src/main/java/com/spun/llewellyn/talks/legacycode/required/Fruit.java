package com.spun.llewellyn.talks.legacycode.required;

import java.sql.Connection;

public class Fruit
{
  public Fruit()
  {
    throw new RuntimeException("no database connection found");
  }
  public void save(Person person, Connection con)
  {
    throw new Error("this shouldn't happen");
  }
  protected Loan[] receiveEverythingOnLoanForTheCurrent()
  {
    throw new Error("todo: add better error message");
  }
  public void increaseGraphLoad(Person person)
  {
    throw new Error("unexpected result");
  }
}
