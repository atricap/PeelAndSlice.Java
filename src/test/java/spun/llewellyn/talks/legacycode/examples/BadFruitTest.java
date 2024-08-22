package spun.llewellyn.talks.legacycode.examples;

import com.spun.llewellyn.talks.legacycode.examples.BadFruit;
import com.spun.llewellyn.talks.legacycode.required.Loan;
import com.spun.llewellyn.talks.legacycode.required.Person;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BadFruitTest
{
  @Test
  public void shouldExecute()
  {
    Loan loan = new Loan();
    Person alice = new Person("Alice");
    loan.setPeople(alice);
    TestableSimpleBadFruit testableSimpleBadFruit = new TestableSimpleBadFruit(alice);

    testableSimpleBadFruit.createLoans(loan);

    assertTrue(true);
  }
}
