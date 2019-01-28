package edu.cnm.deepdive;

public class Euclid {

  public static long gcd(long a, long b) {
    if (a == 0) {
      if (b == 0) {
        throw new ArithmeticException("GCD(0, 0)is un defined,");
      }
      return b;
    }
    if (b == 0) {
      return a;
    }
    while (a != b) {
      if (a > b) {
        long temp = b;
        a %= b;
      } else {
        b %= a;
      }
    }
    if (a != 0) {
      return a;
    }else{
      return b;
    }
  }
}