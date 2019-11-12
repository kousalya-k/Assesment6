package musicStore.studio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import musicStore.studio.model.Album;
import musicStore.studio.model.Artist;
import musicStore.studio.model.Studio;
import musicStore.studio.model.Track;
import musicStore.studio.repo.AlbumRepo;
import musicStore.studio.repo.ArtistRepo;
import musicStore.studio.repo.StudioRepo;
import musicStore.studio.repo.TrackRepo;

@RestController
public class IndexController {
	
	@Autowired
	private TrackRepo trackDal;
	
	@Autowired
	private AlbumRepo albumDal;

	@Autowired
	private ArtistRepo artistDal;
	
	@Autowired
	private StudioRepo studioDal;

	
	@RequestMapping(value = "/tracks", method = RequestMethod.GET, produces = "application/json")
	public List<Track> firstPage() {
		return trackDal.findAll();
	}

	@DeleteMapping(path = { "/tracks/{id}" })
	public Track delete(@PathVariable("id") String id) {
		System.out.println("id " + id);
		Track deletedtrack = trackDal.findById(id);
		System.out.println(deletedtrack);
		if(trackDal.delete(deletedtrack))
			return deletedtrack;
		else
			return null;
	}

	@PostMapping("/tracks")
	public Track create(@RequestBody Track user) {
		trackDal.create(user);
		System.out.println(user + " insert");
		return user;
	}
	
	@RequestMapping(value = "/albums", method = RequestMethod.GET, produces = "application/json")
	public List<Album> firstAlbumPage() {
		return albumDal.findAll();
	}

	@DeleteMapping(path = { "/albums/{id}" })
	public Album deleteAlbum(@PathVariable("id") String id) {
		System.out.println("id " + id);
		Album deletedalbum = albumDal.findById(id);
		System.out.println(deletedalbum);
		if(albumDal.delete(deletedalbum))
			return deletedalbum;
		else
			return null;
	}

	@PostMapping("/albums")
	public Album create(@RequestBody Album user) {
		albumDal.create(user);
		System.out.println(user + " insert");
		return user;
	}
	
	@RequestMapping(value = "/artist", method = RequestMethod.GET, produces = "application/json")
	public List<Artist> firstArtistPage() {
		return artistDal.findAll();
	}

	@DeleteMapping(path = { "/artist/{id}" })
	public Artist deleteArtist(@PathVariable("id") String id) {
		System.out.println("id " + id);
		Artist deletedartist = artistDal.findById(id);
		System.out.println(deletedartist);
		if(artistDal.delete(deletedartist))
			return deletedartist;
		else
			return null;
	}

	@PostMapping("/artist")
	public Artist createArtist(@RequestBody Artist user) {
		artistDal.create(user);
		System.out.println(user + " insert");
		return user;
	}
	
	@RequestMapping(value = "/studio", method = RequestMethod.GET, produces = "application/json")
	public List<Studio> firstPage1() {
		return studioDal.findAll();
	}

	@DeleteMapping(path = { "/studio/{id}" })
	public Studio deleteStudio(@PathVariable("id") String id) {
		
	    Studio deletedStudio = studioDal.findById(id);
		
		if(studioDal.delete(deletedStudio))
			return deletedStudio;
		else
			return null;
	}

	@PostMapping("/studio")
	public Studio create(@RequestBody Studio user) {
		studioDal.create(user);
		System.out.println(user + " insert");
		return user;
	}
	


}
