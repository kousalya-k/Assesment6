package musicStore.studio.repo;

import java.util.List;

import musicStore.studio.model.Studio;


public interface StudioRepo {
	
	Studio create(Studio studio);

	Boolean delete(Studio studio);

	List<Studio> findAll();

	Studio findById(String id);

	

}
