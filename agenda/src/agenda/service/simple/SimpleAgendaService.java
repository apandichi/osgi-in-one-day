package agenda.service.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import agenda.api.Agenda;
import agenda.api.Conference;

public class SimpleAgendaService implements Agenda {
	
	private List<Conference> conferences = new CopyOnWriteArrayList<>();

	@Override
	public List<Conference> listConferences() {
		return new ArrayList<Conference>(conferences);
	}

	@Override
	public void addConference(Conference conference) {
		conferences.add(conference);
	}

}
