package com.accolite.miniau;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Modal {

	List<PropertyChangeListener> listeners = new ArrayList<>();
	Score score;
	
	Modal()
	{
		score = new Score();
	}
	class Score
	{
		int runs;
		int wickets;
		Score()
		{
			runs = 0;
			wickets = 0;
		}
		public int getRuns() {
			return runs;
		}
		public void setRuns(int runs) {
			notifyListeners(this, "runs", this.runs+"", (runs)+"");
			this.runs = runs;
		}
		public int getWickets() {
			return wickets;
		}
		public void setWickets(int wickets) {
			
			notifyListeners(this, "wickets", this.wickets+"", (wickets)+"");
			this.wickets = wickets;
		}
	}
	
	private void notifyListeners(Object object,String property,String oldValue,String newValue)
	{
		for(PropertyChangeListener listener:listeners)
			listener.propertyChange(new PropertyChangeEvent(this, property, oldValue, newValue));
	}
	public void addChangeListener(PropertyChangeListener listener)
	{
		listeners.add(listener);
	}
}
