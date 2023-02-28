import java.util.*;
public class AliensDictionary{
 public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i = 0; i<order.length(); i++)
          {
            map.put(order.charAt(i),i);
          }
          
          for(int i =0; i<words.length; i++){
            if(verifyLexOrder(words[i],words[i+1],map)){
            return true;
            }
            
          }
          return false;
    
    
    
    
    
    }

private boolean verifyLexOrder(String string1, String string2, HashMap<Character, Integer> map) {
    int maxLength  = Math.max(string1.length(),string2.length());
      
    for(int i =0; i<maxLength; i++){
           int c1 = i<string1.length() ? map.get(string1.charAt(i)): -1;
           int c2 = i<string2.length() ? map.get(string2.charAt(i)): -1;
           if(c1==c2) continue;
           if(c1>c2){
            return true;
           }
           else{
            return false;
           }

    }
    return true;
}
}