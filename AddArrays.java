import java.util.*;
public class AddArrays {
    public static List<Integer> add(int [] arr , int k){

StringBuilder sb = new StringBuilder();

         for(int i =0; i<arr.length; i++){
              sb.append(arr[1]);
          }

          int temp = Integer.parseInt(sb.toString());
          int sum = temp+k;

          String str = String.valueOf(sum);
           
           List<Integer> list=  new ArrayList<>();
          for(int i = 0; i<str.length(); i++){
              list.add(Integer.parseInt(String.valueOf(str.charAt(i))));
          } 
          return list;





    }
    
}
