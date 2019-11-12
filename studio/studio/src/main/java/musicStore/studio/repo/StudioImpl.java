package musicStore.studio.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;


import musicStore.studio.model.Studio;

public class StudioImpl implements StudioRepo {
	
	@Autowired
	private MongoTemplate mongo;

	@Override
	public Studio create(Studio studio) {
		// TODO Auto-generated method stub
		return mongo.save(studio);
	}

	@Override
	public Boolean delete(Studio studio) {
		// TODO Auto-generated method stub
		return mongo.remove(studio).wasAcknowledged();
	}

	@Override
	public List<Studio> findAll() {
		// TODO Auto-generated method stub
		return mongo.findAll(Studio.class);
	}

	@Override
	public Studio findById(String id) {
		// TODO Auto-generated method stub
		return mongo.findAndRemove(new Query(Criteria.where("id").is(id)), Studio.class);
	}

}
