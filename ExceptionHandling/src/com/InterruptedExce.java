package com;

public class InterruptedExce {
	public static void main(String[] args) {
		
		int n=10;
		
		try {
			for(int i =1;i<=n;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception r) {
			
			System.out.println(r.getMessage());
		}
	}

}
