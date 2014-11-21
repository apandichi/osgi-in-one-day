package agenda.console;

import java.util.List;

import agenda.api.Agenda;
import agenda.api.Conference;

public class AgendaConsole {
	
	private volatile Agenda agenda;
	
	public void listConferences() {
	    List<Conference> conferences = agenda.listConferences();
	    for (Conference conference : conferences) {
	        System.out.println(conference.getName());
	    }
	}

	public void addConference(String name, String location) {
	    agenda.addConference(new Conference(name, location));
	}

}
