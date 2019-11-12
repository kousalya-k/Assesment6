package musicStore.studio.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import musicStore.studio.model.Album;

public class AlbumImpl implements AlbumRepo  {
	
	@Autowired
	private MongoTemplate mongo;

	@Override
	public Album create(Album album) {
		// TODO Auto-generated method stub
		return mongo.save(album);
	}

	@Override
	public Boolean delete(Album album) {
		// TODO Auto-generated method stub
		return mongo.remove(album).wasAcknowledged();
	}

	@Override
	public List<Album> findAll() {
		// TODO Auto-generated method stub
		return mongo.findAll(Album.class);
	}

	@Override
	public Album findById(String id) {
		// TODO Auto-generated method stub
		return mongo.findAndRemove(new Query(Criteria.where("id").is(id)), Album.class);
	}

}
