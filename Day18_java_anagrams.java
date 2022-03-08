import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean result = true;
        if(a==null||b==null||a.equals("")){
            throw new IllegalArgumentException();
        }
        if(a.length()!=b.length()){
            result = false;
        }else{
            a = a.toLowerCase();
            b = b.toLowerCase();
            
            java.util.Map<Character, Integer> mapA = new java.util.HashMap<>();
            java.util.Map<Character, Integer> mapB = new java.util.HashMap<>();
            
            for(int i =0;i<a.length();i++){
                char charA = a.charAt(i);
                char charB = b.charAt(i);
                
                //untuk karakter A
                if(!mapA.containsKey(charA)){
                    mapA.put(charA, 1);
                }else{
                    Integer frekuensi = mapA.get(charA);
                     mapA.put(charA, ++frekuensi);
                     
                }
                
             //untuk karakter B
                if(!mapB.containsKey(charB)){
                    mapB.put(charB, 1);
                }else{
                    Integer frekuensi = mapB.get(charB);
                     mapB.put(charB, ++frekuensi);
                }
            }  
            
            //Bandingkan karakter dan frekuensi di mapA dan Map B
            for(java.util.Map.Entry<Character, Integer> elemenA : mapA.entrySet()){
                char keyA = elemenA.getKey();
                int valueA = elemenA.getValue();
                if(!mapB.containsKey(keyA)){
                    result = false;
                    break;
                }else{
                    int valueB = mapB.get(keyA);
                    if(valueA != valueB){
                        result = false;
                        break;
                    }   
                }
            }
            
        }
        return result;
    }



    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}