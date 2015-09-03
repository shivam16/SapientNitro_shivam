/**
 * 
 */
package com.sapient.cui.client;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author spra26
 *
 */

class Data{
	private int value;
	
	Data(int value){
		this.value=value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(value);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Data){
			Data dd= (Data) obj;
			if(this.value==dd.value){
				return true;
			}
			
		}
		return false;
	}
	@Override
	public int hashCode() {
		
		
		return value;
		
		
	}
}
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* This is normal generic implementation.
		 * Data<Integer> d=new Data<Integer>();
		d.setValue(34);
		Integer value = d.getValue();
		System.out.println(value);
		
		Data<Float> d1=new Data<Float>();
		d1.setValue(34.4f);
		float value1 = d1.getValue();
		System.out.println(value1);*/
		
		/** This is List Implementation.
		 * List<String> list = new ArrayList<String>();
		list.add("Shivam");
		list.add("Prakash");
		list.add("Arafath");
		list.add("ABC");*/
		
		/** This is Set implementation.
		 * Set<String> set = new HashSet<String>();
		set.add("Shivam");
		set.add("Prakash");
		set.add("Arafath");
		set.add("ABC");*/
		
	/*	Set<Data> set = new HashSet<Data>();
		set.add(new Data(4));
		set.add(new Data(3));
		set.add(new Data(2));
		set.add(new Data(4));
		set.add(new Data(6));
		
		Iterator<Data> iterator = set.iterator();
		Data name;
		
		while(iterator.hasNext()){
			name=iterator.next();
			System.out.println(name);*/
		
		
		HashMap<Integer, Data> result=new HashMap<Integer, Data>();
		
		result.put(3, new Data(12));
		result.put(5, new Data(23));
		result.put(3, new Data(34));
		result.put(8, new Data(56));
		
		Iterator<HashMap> iterator =  .keySet();
		Set name;
		
		while(iterator.hasNext()){
			name=iterator.next();
			System.out.println(name);
		
		Set<Integer> keys = result.keySet();
		Collection<Data> values = result.values();
		System.out.println(keys);
		System.out.println(values);
		
		
		}
		

	}
}

