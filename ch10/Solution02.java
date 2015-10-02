package ch10;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Solution02 {
    public LinkedList<LinkedList<String>> sortAnagrams(String[] strs) {
        LinkedList<LinkedList<String>> array = new LinkedList<>();
       
      //Create a hash table to map from the sorted string to the original string
       HashMap<String, LinkedList<String>> map = new HashMap<>();
       for (int i = 0; i < strs.length; i++) {
           char[] ch = strs[i].toCharArray();
           Arrays.sort(ch);
  
           //using the sorted string as the key  
           String key = String.valueOf(ch);
           if (map.containsKey(key)) {
               map.get(key).add(strs[i]);
         } else {
        	   LinkedList<String> each = new LinkedList<>();
               each.add(strs[i]);
               map.put(key, each);
   }
}

  
       for(String key: map.keySet()){
    	   array.add(map.get(key)); 
       } 
  
       return array;
}
