package taojava.labs.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleMethodsTest
{

  @Test
  public void
    testExptIntInt ()
  {
    int expected;
    for (int base = -100; base < 100; base++)
      {
        expected = 1;
        for (int power = 0; power < 10; power++)
          {
            assertEquals ("Testing", expected, SampleMethods.expt (base, power));
            expected *= base;
          }
      }
  }
}
