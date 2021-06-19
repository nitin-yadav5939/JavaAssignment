package javaprac;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class Listmanager2 {

   public static void main(String[] args) {
      List<String> listString = Arrays.asList("25", "50", "75", "100", "125", "150");
      System.out.println("List of String = " + listString);
      List<Integer> listInteger = listString.stream().map(Integer::parseInt)
         .collect(Collectors.toList());
      System.out.println("List of Integer (converted from List of String) = " + listInteger);
      Collections.sort(listInteger);
      System.out.println(listInteger);
   }
}