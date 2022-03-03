import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat fUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat fIndia = NumberFormat.getCurrencyInstance(new Locale ("en","in"));
        NumberFormat fChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        String us = fUS.format(payment);
        String india = fIndia.format(payment);
        String china = fChina.format(payment);
        String france = fFrance.format(payment);
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}