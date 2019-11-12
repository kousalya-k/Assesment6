package musicStore.studio.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Album {

	@Id
	private String id;
	
	private String alname;
	
	@DBRef
	private List<Track> tracks;
	
	

	public Album() {
	}



	public Album(String id, String alname, List<Track> tracks) {
		this.id = id;
		this.alname = alname;
		this.tracks = tracks;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getAlname() {
		return alname;
	}



	public void setAlname(String alname) {
		this.alname = alname;
	}



	public List<Track> getTracks() {
		return tracks;
	}



	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}
	
	
	
}
