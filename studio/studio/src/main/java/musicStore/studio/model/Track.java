package musicStore.studio.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Track {
	
	@Id
	
	private String id;
	private String trackname;
	
	
	private String artists;
	
	

	public Track() {
	}



	public Track(String id, String trackname,String artists) {
		this.id = id;
		this.trackname = trackname;
		this.artists = artists;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getTrackname() {
		return trackname;
	}



	public void setTrackname(String trackname) {
		this.trackname = trackname;
	}



	public String getArtists() {
		return artists;
	}



	public void setArtists(String artists) {
		this.artists = artists;
	}

	
	
}
