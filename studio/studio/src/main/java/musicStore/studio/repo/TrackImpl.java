package musicStore.studio.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import musicStore.studio.model.Track;





@Repository
public class TrackImpl implements TrackRepo{

	@Autowired
	private MongoTemplate mongo;

	@Override
	public Track create(Track track) {
		// TODO Auto-generated method stub
		return mongo.save(track);
	}

	@Override
	public Boolean delete(Track track) {
		// TODO Auto-generated method stub
		return mongo.remove(track).wasAcknowledged();
	}

	@Override
	public List<Track> findAll() {
		// TODO Auto-generated method stub
		return mongo.findAll(Track.class);
	}

	@Override
	public Track findById(String id) {
		// TODO Auto-generated method stub
		return mongo.findAndRemove(new Query(Criteria.where("id").is(id)), Track.class);
	}
	
}

