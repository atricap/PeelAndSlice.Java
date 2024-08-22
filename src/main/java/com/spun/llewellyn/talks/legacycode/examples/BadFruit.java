package com.spun.llewellyn.talks.legacycode.examples;

import com.spun.llewellyn.talks.legacycode.required.Fruit;
import com.spun.llewellyn.talks.legacycode.required.Loan;
import com.spun.llewellyn.talks.legacycode.required.Person;

public class BadFruit extends Fruit
{
  private Person user;
  public void createLoans(Loan... loans)
  {
    toSimpleBadFruit().createLoans(loans);
  }

  private SimpleBadFruit toSimpleBadFruit() {
    return new SimpleBadFruit(user);
  }
  /*
   * Bug #54
   * If a home , auto and personal loan
   * are taken out by Tom,
   * 3 versions of Tom appear in the database.
   */
}
