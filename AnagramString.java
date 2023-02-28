import java.util.*;

public class AnagramString {
    public static ArrayList<Integer> findAnagramIndexes(String str , String pattern){

int n1= str.length();
int n2 = pattern.length();

int [] strMap = new int[26];
int [] patternMap = new int[26];


   if(n1<n2) return new ArrayList<>();

   for(int i = 0; i<n2; i++){
    strMap[str.charAt(i)-'a']++;
    patternMap[pattern.charAt(i)-'a']++;
   }
   
   ArrayList<Integer> ans = new ArrayList<>();
   if(patternMap.equals(strMap)) ans.add(0);

   for(int i = n2; i<n1; i++){
    char left = str.charAt(i-n2);
    char right = str.charAt(i);
    strMap[left-'a']--;
    strMap[right-'a']++;
    if(strMap.equals(patternMap)) ans.add(i);
   }

   return ans;
    } 
    
}
