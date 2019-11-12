package musicStore.studio.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Artist {
	
	@Id
	private String id;
	
	private String artname;
	
	@DBRef
	private List<Album> albums;

	public Artist() {
	}

	public Artist(String id, String artname, List<Album> albums) {
		this.id = id;
		this.artname = artname;
		this.albums = albums;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getArtname() {
		return artname;
	}

	public void setArtname(String artname) {
		this.artname = artname;
	}

	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}
	

}
