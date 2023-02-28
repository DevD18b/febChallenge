import java.util.*;
public class permutations {
    public boolean checkInclusion(String s1, String s2) {
        int [] map1 = new int[26];
        int [] map2 = new int[26];
        int n1 = s1.length();
        int n2  = s2.length();
        for(int i = 0; i<n1;  i++){
            map1[s1.charAt(i)-'a']++;
            map2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(map1,map2)) return true;
        for(int i = n1; i<n2; i++)
        {
           char left = s2.charAt(i-n1);
           char right =  s2.charAt(i);
           map2[right-'a']++;
           map2[left-'a']--;
          if(Arrays.equals(map1, map2)) return true;
        }
        return false;    
    }
    
}
