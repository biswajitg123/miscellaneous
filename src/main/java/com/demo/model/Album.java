package com.demo.model;

public class Album {

	private String artist;
	private String album;	
	
	public Album() {
		super();
	}

	public Album(String artist, String album) {
		super();
		this.artist = artist;
		this.album = album;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public String toString() {
		return "Album [artist=" + artist + ", album=" + album + "]";
	}
	
}
