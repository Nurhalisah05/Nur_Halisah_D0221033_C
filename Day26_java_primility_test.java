import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution { 
    //Nur halisah Day26 java primality test

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
      System.out.println( n.isProbablePrime(1000) ? "prime" : "not prime" );
   }
}
