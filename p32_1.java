import java.util.*;


public class p32_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 1st name");
        String str=sc.next();
        System.out.println("Enter a 2nd name");
        String anagram=sc.next();
        boolean ans = checkAnagram(str, anagram);
        if(ans){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }


    public static boolean checkAnagram(String str,String anagram){
        if(str.length()!=anagram.length()){
            return false;       
        }
        char s1[]=str.toCharArray();
        char s2[]=anagram.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        for(int i=0;i<s1.length;i++){
            if(s1[i]!=s2[i]){
                return false;
            }
        }
        return true;
    }
}
