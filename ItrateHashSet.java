/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Sayali
 */
import java.util.*;
public class ItrateHashSet {
     public static void main(String[] args) {
     HashSet<String> h_set = new HashSet<String>();
          h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Pink");
          h_set.add("Yellow");

    Iterator<String> p = h_set.iterator();
   while (p.hasNext()) {
   System.out.println(p.next());
   }
     }
}
   


