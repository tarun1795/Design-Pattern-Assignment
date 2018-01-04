package com.accolite.miniau;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Android android = new Android();
		Iphone iPhone = new Iphone();
		Windows windows = new Windows();
		
		Modal modal = new Modal();
		modal.addChangeListener(android);
		modal.addChangeListener(iPhone);
		modal.addChangeListener(windows);
		
		boolean isWicket = false;
		while(modal.score.getWickets()<=10)
		{
			isWicket = (Math.round(Math.random())==1L)?true:false;
			if(isWicket)
				modal.score.setWickets(modal.score.getWickets()+1);
			else
			{
				modal.score.setRuns(modal.score.getRuns()+((int)Math.floor(Math.random()*6)));
			}
			isWicket = false;
			Thread.sleep(10000);
		}
	}
}
