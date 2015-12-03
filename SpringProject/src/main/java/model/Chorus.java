package model;

import java.util.ArrayList;

/**
 * Represents a Chorus *Alt Shift 
 * Documentation about classes and interfaces
 */

public class Chorus {
	
	private String name;
	private ArrayList<Singer> chorus = new ArrayList<Singer>();
	private Director musical_director;
	public Chorus(String name, Director musical_director, ArrayList<Singer> chorus) {
		super();
		this.name = name;
		this.chorus = chorus;
		this.musical_director = musical_director;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Singer> getChorus() {
		return chorus;
	}

	public void setChorus(ArrayList<Singer> chorus) {
		this.chorus = chorus;
	}
	public Director getDirector() {
		return musical_director;
	}

}
