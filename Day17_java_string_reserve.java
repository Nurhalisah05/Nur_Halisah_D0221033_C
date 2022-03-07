import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        /* Enter your code here. Print output to STDOUT. */
         boolean isPalindrome = false;
        StringBuilder sb = new StringBuilder(s);
        String balikan = sb.reverse().toString();
        System.out.println(s.equals(balikan)?"Yes":"No");
        
    }
}



