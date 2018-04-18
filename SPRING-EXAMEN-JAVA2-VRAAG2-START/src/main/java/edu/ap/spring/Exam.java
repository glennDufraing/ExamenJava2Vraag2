package edu.ap.spring;

import java.awt.Point;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class Exam {
	
	// Maak gebruik van lambdas en streams om een array met alle
	// priemgetallen terug te geven
	// 2 punten
	
	public int[] getPrimes(int[] numbers) {
		int count = 0;
	List<Integer>lijst=new ArrayList<>();
		for(int n:numbers) {
			lijst.add(n);
		}
		lijst = lijst.stream().filter(l->isPrime(l)).collect(Collectors.toList());
		
		int[]returnVal = new int[lijst.size()];
		for(int n:lijst) {
			returnVal[count] = n;
			count++;
		}
		return returnVal;
		
		
	}
	private boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	// Maak gebruik van lambdas en streams alle lowercase characters
	// te tellen in de gegeven string
	// 1 punt
	public int countLowercaseCharacters(String string) {
		int aantal = (int) string.chars().filter(l-> Character.toUpperCase(l) != l).count();
		

        return aantal;
	}
	
	// Maak gebruik van lambdas en streams om de som van alle
	// x-coordinaten uit de lijst van points te berekenen
	// 1 punt
	
	public int sumOfX(List<Point> points) {
		List<Double> lijst=  points.stream().map(l ->l.getX()).collect(Collectors.toList());
		
		int sum =(int) lijst.stream().mapToDouble(Double::intValue).sum();
		return sum;
	}
	
	// Maak gebruik van lambdas en streams om een comma-separated
	// string te maken die alle x-coordinaten bevat die groter of gelijk 
	// zijn aan twee
	// 2 punten
	public String getXOverTwo(List<Point> points) {
		
		String lijst= points.stream().filter(l ->l.getX() >=2).map(l->String.valueOf(l.getX())).collect(Collectors.joining(","));
		
		lijst = lijst.replaceAll(".0", "");
		 return lijst;
	}
	
}
