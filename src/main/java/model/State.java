// [FILENAME]: State.java
package model;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class State {
	public String name;
	public Map<String, List<State>> transitions;
	
	public State(String name) {
		this.name = name;
		this.transitions = new HashMap<>();
	}
	
	
	/**
	 * add transition from this state to a target state given an input symbol
	 */
	public void addTransition(String symbol, State targetState) {
		this.transitions.computeIfAbsent(symbol, k -> new ArrayList<>());
	}
}
