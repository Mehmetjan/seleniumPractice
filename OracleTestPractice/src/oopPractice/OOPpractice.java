package oopPractice;

import java.util.Arrays;

import javax.sound.midi.VoiceStatus;


public class OOPpractice {

	public static void main(String[] args) {
		
		int [][][] array = {
				
		   {{1,2,4,5},
				{4,7,2,9}},
		   
		   
				{{6,7,4,7},
				{2,9,4,8}
				}
						
		};
	
		
		for(int[][] intA:array) {
			for(int[] intB: intA) {
				for(int a: intB) {
					System.out.print(a+" ");
				}System.out.println();
			}
			
		}
	
	}
}
