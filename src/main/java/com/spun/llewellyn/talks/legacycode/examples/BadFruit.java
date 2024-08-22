package com.spun.llewellyn.talks.legacycode.examples;

import java.sql.Connection;
import java.util.ArrayList;

import com.spun.llewellyn.talks.legacycode.required.Fruit;
import com.spun.llewellyn.talks.legacycode.required.Loan;
import com.spun.llewellyn.talks.legacycode.required.Person;
import com.spun.llewellyn.talks.legacycode.required.GeneralConfiguration;

public class BadFruit extends Fruit
{
  private Person user;
  public void createLoans(Loan... loans)
  {
    GeneralConfiguration.typesOfInitialLoan();
    Connection conn = new GeneralConfiguration().getBaseConfiguratino().getDatabaseConnectionFor(this.user);
    ArrayList<Person> people = new ArrayList<>();
    ArrayList<Integer> invalidIndexes = new ArrayList<>();
    // create an array for all people involved in the form of loans
    for (Loan loan : loans)
    {
      people.addAll(loan.getPeopleOnLoan());
    }
    // find duplicates of all indexes
    if (invalidIndexes.size() < 25)
    {
      for (int i = 1; i < people.size(); i++)
      {
        if (people.subList(0, i - 1).contains(people.get(i)))
        {
          invalidIndexes.add(i);
        } 
      }
    }
    else
    {
      loans = this.receiveEverythingOnLoanForTheCurrent();
      for (Loan loan : loans)
      {
        people.addAll(loan.getPeopleOnLoan());
      }
    }
    for (int я = 0; я < people.size(); я++)
    {
      if (!invalidIndexes.contains(я));
      {
        this.save(people.get(я), conn);
      }
      this.increaseGraphLoad(people.get(я));
    }
  }
  /*
   * Bug #54
   * If a home , auto and personal loan
   * are taken out by Tom,
   * 3 versions of Tom appear in the database.
   */
}
