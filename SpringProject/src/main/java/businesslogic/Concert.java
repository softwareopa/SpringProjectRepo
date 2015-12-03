package businesslogic;

import java.util.Hashtable;

import model.Chorus;
import model.Director;
import model.Section;
import model.Singer;
import model.Song;

public class Concert {
	private String concert_name;
	private Chorus chorus;
	
	// create a chorus
	// let them perform a song
	// create an object hierarchy representing
	// perform is writing some lyrics in the output
	// println(Ramon : "Well you rock my soul in the bossom of abrahma."
	// println(THorsten: "Well you rock my soul in the bossom of abrahma."
	public Concert(String concert_name, Chorus chorus) {		
		this.concert_name = concert_name;
		this.chorus = chorus;		
	}

	public void perform() {
		// TODO Auto-generated method stub
		// Welcome to the Concert : concertname of the chorus chorusname.
		
		System.out.println(String.format("Welcome to %s's %s!",chorus.getName(), concert_name));
		
		// Directed by musicaldirector. Performed by singer_name singers.
		System.out.println(String.format("Directed by %s.",chorus.getDirector().getName()));		
			
		// print all songs where the director and at least 1 singer of each section has the song in the reprtoire along with the name of the performers
		
		// Loop through all Songs of the director
		for(Song song : chorus.getDirector().getRepertoire()) {
			perform(song);	
		}
	}
	
	public void perform(Song song){		
		
		// "Rock my Soul" : BASS : Richard Rudi LEAD: Terry Heiner BARITONE: ... use perform(Song)		
		
		Singer[] performers = new Singer[10];
		int i = 0;
		// Hash to store the Section of the singers that have the song in their repertoire
		Hashtable<Enum, Integer> sections = new Hashtable<Enum, Integer>();
		//Loop through all singers
		for(Singer current_singer : chorus.getChorus()){
			//loop through repertoire of singer
			for(Song song_from_current_singer : current_singer.getRepertoire()){
				// Check if the singer can sing the song
				if(song_from_current_singer.getTitle() == song.getTitle()){
					// TODO: Make sure the Song Titles are unique
					// put singer into a hash of performers
					performers[i] = current_singer;
					i++;
					// Add the section to the hash of sections
					sections.put(current_singer.getSection(), 1); 
				}
			}			
		}
		// TODO: The two programm parts could be put into seperate methods
		// song_check()
		// publish_performance();
		
		// Check if there is at least one singer of each section who has the song in the repertoire	
		if(sections.size() >= Section.values().length){ 			
			// print out song title
			System.out.print(String.format("\"%s\"",song.getTitle()));
			// Loop through Singer who know the song
			for(int j = 0;j<i;j++){
				// print Section, Name of singer who has the song in the repertoire				
					System.out.print(String.format(" : %s : %s",performers[j].getSection(),performers[j].getName()));
			}	
			System.out.println();
		}
		else{
			System.out.println(String.format("\"%s\" : It cannot be performed",song.getTitle()));
		}
		// "Rock my Soul" : BASS : Richard Rudi LEAD: Terry Heiner BARITONE: ...
		// or if the song cannot be performed
		// print "It cannot be perfomred"
	}
}


