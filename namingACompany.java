import java.util.*;
public class namingACompany {

    public static int distinctNames(String [] ideas){


        Set<String> [] suffix = new HashSet[26];

        for(int i  = 0; i<ideas.length; i++){
            suffix[i] = new HashSet<>();
        }




        // coffee --> c , offee.
        // time --> t    ,  ime.
        // donuts --> d , onuts.

        for(String word : ideas){
           suffix[word.charAt(0)-'a'].add(word.substring(1));
     
        }

    //    int count   = 0;
      
     long  ans  = 0 ;
    for(int i =0; i<25; i++){
            for(int j = i+1; j<26; j++){
                int count  =0 ;
               for(String idea : suffix[j])
                    if(suffix[j].contains(idea))
                        count++;
                    
               ans+=(suffix[i].size()-count)-(suffix[j].size()-count);
            }
        }
        return (int) (2*ans);
        















    }


    
}
