package musicStore.studio.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import musicStore.studio.model.Artist;

public class ArtistImpl implements ArtistRepo {
	@Autowired
	private MongoTemplate mongo;

	@Override
	public Artist create(Artist artist) {
		// TODO Auto-generated method stub
		return mongo.save(artist);
	}

	@Override
	public Boolean delete(Artist artist) {
		// TODO Auto-generated method stub
		return mongo.remove(artist).wasAcknowledged();
	}

	@Override
	public List<Artist> findAll() {
		// TODO Auto-generated method stub
		return mongo.findAll(Artist.class);
	}

	@Override
	public Artist findById(String id) {
		// TODO Auto-generated method stub
		return mongo.findAndRemove(new Query(Criteria.where("id").is(id)), Artist.class);
	}
	
	


}
