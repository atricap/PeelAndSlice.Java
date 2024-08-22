package com.spun.llewellyn.talks.legacycode.examples;

import com.spun.llewellyn.talks.legacycode.required.Loan;
import com.spun.llewellyn.talks.legacycode.required.Person;

import java.sql.Connection;

public class SimpleFruit {

    public void save(Person person, Connection conn) {
        // TODO: not implemented for now
        if (conn instanceof NullConnection) {
            return;
        }
    }

    public Loan[] receiveEverythingOnLoanForTheCurrent() {
        // TODO: not implemented for now
        return new Loan[0];
    }

    public void increaseGraphLoad(Person person) {
        // TODO: not implemented for now
    }
}
