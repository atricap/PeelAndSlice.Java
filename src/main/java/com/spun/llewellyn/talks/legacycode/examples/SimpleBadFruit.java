package com.spun.llewellyn.talks.legacycode.examples;

import com.spun.llewellyn.talks.legacycode.required.GeneralConfiguration;
import com.spun.llewellyn.talks.legacycode.required.Loan;
import com.spun.llewellyn.talks.legacycode.required.Person;

import java.sql.Connection;
import java.util.ArrayList;

/**
 * A simpler, better testable version of BadFruit.
 */
public class SimpleBadFruit extends SimpleFruit {

    private Person user;

    public SimpleBadFruit(Person user) {
        this.user = user;
    }

    public Person getUser() {
        return user;
    }

    public void createLoans(Loan... loans) {
        typesOfInitialLoan();
        Connection conn = getDatabaseConnectionFor(getUser());
        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Integer> invalidIndexes = new ArrayList<>();
        // create an array for all people involved in the form of loans
        for (Loan loan : loans) {
            people.addAll(loan.getPeopleOnLoan());
        }
        // find duplicates of all indexes
        if (invalidIndexes.size() < 25) {
            for (int i = 1; i < people.size(); i++) {
                if (people.subList(0, i - 1).contains(people.get(i))) {
                    invalidIndexes.add(i);
                }
            }
        } else {
            for (Loan loan : receiveEverythingOnLoanForTheCurrent()) {
                people.addAll(loan.getPeopleOnLoan());
            }
        }
        for (int i = 0; i < people.size(); i++) {
            if (!invalidIndexes.contains(i)) ;
            {
                save(people.get(i), conn);
            }
            increaseGraphLoad(people.get(i));
        }
    }

    protected void typesOfInitialLoan() {
        GeneralConfiguration.typesOfInitialLoan();
    }

    protected Connection getDatabaseConnectionFor(Person user) {
        return new GeneralConfiguration().getBaseConfiguratino().getDatabaseConnectionFor(getUser());
    }
}
