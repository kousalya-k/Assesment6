package musicStore.studio.repo;

import java.util.List;

import musicStore.studio.model.Artist;

public interface ArtistRepo  {
	Artist create(Artist artist);

	Boolean delete(Artist artist);

	List<Artist> findAll();

	Artist findById(String id);


}
