package com.demo.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.demo.model.Album;

public class AlbumUtil {
	
	private static List<Album> list = new ArrayList<>();
	static {
		
		list.add(new Album("Artist1","Album1"));
		list.add(new Album("Artist2","Album1"));
		list.add(new Album("Artist3","Album1"));
		list.add(new Album("Artist2","Album2"));
		list.add(new Album("Artist3","Album2"));
		list.add(new Album("Artist3","Album3"));
		list.add(new Album("Artist1","Album2"));
		list.add(new Album("Artist3","Album4"));
		list.add(new Album("Artist1","Album3"));
	}
	
	public static Map<String, List<String>> getAlbumsPerArtist()  {
		
		Map<String, List<String>> albumMap = new HashMap<>();
		
		for(Album album : list) {
			
			String key = album.getArtist();		
			
			if(albumMap.containsKey(key)) {
				
				List<String> albums = albumMap.get(key);
				albums.add(album.getAlbum());
				albumMap.put(key, albums);
			}
			
			else {	
				List<String> albums = new ArrayList<>();
				albums.add(album.getAlbum());
				albumMap.put(key, albums);
			}
		
		}
		
		return albumMap;
	}
	
	public static Map<String, List<Album>> getAblumListByArtist() {
		
		return list.stream().collect(Collectors.groupingBy(Album::getArtist));
	}
	
	public static void main(String[] args) {
		
		Map<String, List<String>> albumMap = getAlbumsPerArtist();
		for (Map.Entry<String, List<String>> entry : albumMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue().size());
			System.out.println("Albums : " + entry.getValue());
		}
		
		System.out.println("Using stream: "+getAblumListByArtist() );
	}
}
