package musicStore.studio.repo;



import java.util.List;

import musicStore.studio.model.Track;

public interface TrackRepo {
	
	Track create(Track track) ;

	Boolean delete(Track track );

	List<Track > findAll();

	Track  findById(String id);

}
