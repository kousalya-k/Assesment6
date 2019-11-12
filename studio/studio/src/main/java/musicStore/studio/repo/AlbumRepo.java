package musicStore.studio.repo;

import java.util.List;

import musicStore.studio.model.Album;

public interface AlbumRepo {

	Album create(Album album);

	Boolean delete(Album album);

	List<Album> findAll();

	Album findById(String id);
}
