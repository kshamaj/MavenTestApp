package org.kj.learn;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalciTest {

  @Test
  public void addWhenNumberArePositive() {
    assertEquals(5, Calci.add(2, 3));
  }

  @Test
  public void addWhenNumbersAreNegative() {
    assertEquals(-5, Calci.add(-2, -3));
  }

  @Test
  public void addWhenNumbersAreZero() {
    assertEquals(0, Calci.add(0, 0));
  }

  @Test
  public void subtract() {
    assertEquals(3, Calci.subtract(5, 2));
  }

  @Test
  public void subWhenNumbersAreZero() {
    assertEquals(0, Calci.subtract(0, 0));
  }

}