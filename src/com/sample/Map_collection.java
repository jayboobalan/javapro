package com.sample;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import java.util.LinkedHashMap;

public class Map_collection{
public static void main(String[] args) {
	
	Map<Integer,String>g =new LinkedHashMap <Integer,String>();
    g.put(null,"raj");
    g.put(90000,"nirmal");
    g.put(70000,null);
    g.put(70000,"rabhi");
    g.put(80098,"rabhi");
    
    System.out.println("LinkedHashMap:"+g);
	
	Map<Integer,String> c =new ConcurrentHashMap <Integer,String>();
	c.put(90,"tamil");
	c.put(87,"english");
	c.put(76,"maths");
	c.put(67,"graph");
    c.put(56,"history");
      System.out.println("ConcurrentHashMap:"+c);
}



}
