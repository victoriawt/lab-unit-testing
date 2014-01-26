package taojava.labs.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest
    extends
      SampleMethods
{

  @Test
  public void
    testSum ()
  {
    int[] vals = {0, 1, 1};
    int[] vals2 = {-1, 1, 100};
    int[] vals3 = {10, 19, 64564564};
    int[] vals4 = {9, 1, 1};
    
    assertEquals ("Sum is", 2, sum(vals));    
    assertEquals ("Sum is", 100, sum(vals2));
    assertEquals ("Sum is", 64564593, sum(vals3));
    assertEquals ("Sum is", 11, sum(vals4));
  }
  
  @Test
  public void 
  testExtremes() 
  {
     int tmp = Integer.MAX_VALUE - 10;
     int[] values = { tmp, tmp, -tmp, -tmp };
     assertEquals("extreme test", 0, sum(values));
  } // testExtremes
  
}
