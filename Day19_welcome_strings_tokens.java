import java.io.*;
import java.util.*;
public class day19_Java_Strings_Tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.replaceAll("[!,?._'@\\s]+", " ");
        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens();
        System.out.println(n);
        // print bisa pakai while atau for 
        
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        // for(int i=0;i<n;i++){
        //     System.out.println(st.nextToken());
        // }
        
        scan.close();
    }
}

