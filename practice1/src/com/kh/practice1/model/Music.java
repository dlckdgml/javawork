package com.kh.practice1.model;

public class Music {

	String title;
	String artist;
	
	public Music() {}

	public Music(String title, String singer) {
		this.title = title;
		this.artist = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return artist;
	}

	public void setSinger(String singer) {
		this.artist = singer;
	}

	@Override
	public String toString() {
		return artist + " - " + title;
	}

	public void setArtist(String nextLine) {
	}
	
	
}
