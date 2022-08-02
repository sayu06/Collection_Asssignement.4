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
public class InsetElementArrayAtLastPosition {
public static void main(String[] args) {
  List<String> Stringslist = new ArrayList<String>();
  Stringslist.add("Pizza");
  Stringslist.add("Sandwich");    
  Stringslist.add("cofee");
  Stringslist.add("Burger");
  Stringslist.add("Roll");
  Stringslist.add("IceCeram");
 
  System.out.println(Stringslist);
 
  Stringslist.add(0, "Faluda");
  Stringslist.add(7, "Pasta");
 
  System.out.println(Stringslist);
 }
}

