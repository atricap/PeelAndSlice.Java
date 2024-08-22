package spun.llewellyn.talks.legacycode.examples;

import com.spun.llewellyn.talks.legacycode.examples.NullConnection;
import com.spun.llewellyn.talks.legacycode.examples.SimpleBadFruit;
import com.spun.llewellyn.talks.legacycode.required.Person;

import java.sql.Connection;

public class TestableSimpleBadFruit extends SimpleBadFruit {

    public TestableSimpleBadFruit(Person user) {
        super(user);
    }

    @Override
    protected void typesOfInitialLoan() {
    }

    @Override
    protected Connection getDatabaseConnectionFor(Person user) {
        return new NullConnection();
    }
}
