package com.accolite.miniau;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Android implements PropertyChangeListener {

	String scores="0";
	String wickets="0";
	@Override
	public void propertyChange(PropertyChangeEvent evt) {

		if(evt.getPropertyName().equals("runs"))
			scores =(String) evt.getNewValue();
		else
			wickets =(String) evt.getNewValue();
		printScore();
	}

	private void printScore()
	{
		System.out.println("In Android Phone \nScore = "+scores+"\nWickets = "+wickets+"\n\n");
	}
}
