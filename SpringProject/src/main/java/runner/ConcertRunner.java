package runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import businesslogic.Concert;
import model.Chorus;
import model.Director;
import model.Section;
import model.Singer;
import model.Song;

public class ConcertRunner {

	public ConcertRunner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {	
		
		// create objects of Songs		
	    // TODO: Create COncertRUnner, create concert with elements call concert.perform 
		Song song01 = new Song("Change the World");
		Song song02 = new Song("If");
		Song song03 = new Song("Lullabye");
		Song song04 = new Song("Rock my Soul");
		Song song05 = new Song("YMCA");
		Song song06 = new Song("Sound of Munich");
		Song song07 = new Song("Laß mich dein Badewasser schlürfen");
		Song song08 = new Song("Old black magic");
		Song song09 = new Song("Oh love");
		Song song10 = new Song("Get happy");	
		
		// create Director object
		// Director Hans Jürgen has the full repertoire 
		Director musical_director = new Director("Hans-Jürgen", new ArrayList<Song>(Arrays.asList(song01, song02, song03, song04, song05, song06, song07, song08, song09, song10)));		

		// create Singer objects
		// Singer 1 is a deep voiced ballad singer
		Singer singer01 = new Singer(Section.BASS, "Richard", new ArrayList<Song>(Arrays.asList(song01,song02,song03,song09)));	
		Singer singer02 = new Singer(Section.BASS, "Sikanda", new ArrayList<Song>(Arrays.asList(song04,song09,song10)));
		Singer singer03 = new Singer(Section.BARITONE, "Holger", new ArrayList<Song>(Arrays.asList(song01,song02,song03)));
		Singer singer04 = new Singer(Section.BARITONE, "Joseph", new ArrayList<Song>(Arrays.asList(song05,song06,song07,song08)));
		Singer singer05 = new Singer(Section.LEAD, "Terry", new ArrayList<Song>(musical_director.getRepertoire()));
		Singer singer06 = new Singer(Section.LEAD, "Heiner", new ArrayList<Song>(Arrays.asList(song05,song07)));
		Singer singer07 = new Singer(Section.TENOR, "Ramon", new ArrayList<Song>(singer03.getRepertoire()));
		Singer singer08 = new Singer(Section.TENOR, "Thorsten", new ArrayList<Song>(singer01.getRepertoire()));
		
		// Create Chorus
		Chorus chorus = new Chorus("Herrenbesuch", musical_director, new ArrayList<Singer>(Arrays.asList(singer01,singer02,singer03,singer04,singer05,singer06,singer07,singer08)));	
		
		List<String> names = new ArrayList<String>();
		List<String> names2 = Lists.newArrayList();
		
		Set<Singer> singers1 = new HashSet<Singer>();
		Set<Singer> singers2 = Sets.newHashSet();
		
		// nowhere ArrayList only instatiating Lists.newArrayList
		//Spring
		
		superPrettyPrintOfSets(singers1);
		
		// TODO Auto-generated method stub
		// perform a concert of a chorus
		// concert.perform(); OR perform(chorus,audience);
		Concert concert = new Concert("Jahreskonzert", chorus);
		concert.perform();
		
		// Another concert "Herrenbesuch und EIVox" is performed
		// Ramon learned the Song "ROck my SOul"
		singer03.learnSong(song04);
		singer07.learnSong(song04);
		
		Concert concert02 = new Concert("Herrenbesuch & EiVox", chorus);
		concert02.perform();
		
	}
	
	private static void superPrettyPrintOfSets(Set<Singer> anySet){
		
	}

}
