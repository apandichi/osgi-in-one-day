package agenda.service.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.felix.dm.annotation.api.Component;
import org.apache.felix.dm.annotation.api.Start;

import agenda.api.Agenda;
import agenda.api.Conference;

@Component
public class SimpleAgendaService implements Agenda {

	private List<Conference> conferences = new CopyOnWriteArrayList<>();

	@Start
	public void start() {
		conferences.add(new Conference("Devoxx", "Antwerp"));
		conferences.add(new Conference("JFokus", "Stockholm"));

		System.out.println("Added " + conferences.size() + " conferences");
	}

	@Override
	public List<Conference> listConferences() {
		return new ArrayList<Conference>(conferences);
	}

	@Override
	public void addConference(Conference conference) {
		conferences.add(conference);
	}

}
