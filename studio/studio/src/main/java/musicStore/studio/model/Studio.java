package musicStore.studio.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Studio {
	
	@Id
	private String id;
	
	@DBRef
	private List<Artist> artists;
	
	@DBRef
	private List<Album> album;
	
	public Studio() {
	}

	public Studio(List<Artist> artists, List<Album> album) {
		this.artists = artists;
		this.album = album;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Artist> getArtists() {
		return artists;
	}

	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}

	public List<Album> getAlbum() {
		return album;
	}

	public void setAlbums(List<Album> album) {
		this.album = album;
	}
	
	

	
}
