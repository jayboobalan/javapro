package com.sample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class list_types {

	public static void main(String[] args) {
	
	List <Object> a = new ArrayList <Object>();
    List <Object> l = new LinkedList<Object>();
    List <Object> v = new Vector<Object>();
    
    
    a.add("jay");
    a.add(987654400);
    a.add(654786);
    System.out.println("Add:"+a);
    l.add("raj");
    l.add(980876790);
    l.add(678907);
    System.out.println("Add;"+l);
    v.add("ram");
    v.add(897644309);
    v.add(678956);
    
    a.addAll(l);
    System.out.println("ADDALL:"+a);
    a.addAll(v);
    System.out.println("ADDALL:"+a);
    
   
    a.indexOf(l);
    System.out.println("index of:"+ l);
      
     boolean b = a.contains(l);
    System.out.println("contains:"+b);
    
    a.remove(3);
    System.out.println("remove:"+a);
    
    a.removeAll(a);
    System.out.println("removeAll:"+a);
     
    
 
      
   
    
    
    
    
			
			
			
	}
}
