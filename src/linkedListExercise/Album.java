package linkedListExercise;

import java.util.ArrayList;

public class Album {
	String albumName;
	ArrayList<Song> songs;
	
	public Album(String albumName) {
		this.albumName = albumName;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	
	public void addSong(String songTitle) {
		songTitles.add(songTitle);
	}
	
	public void createAlbum(String albumName) {
		if (findAlbum(albumName) != -1) {
			System.out.println("This album is already existing.");
		} else {
			albums.add(new Album(albumName));
			System.out.println(albumName + " has been created.");
		}
	}
	
	public int findAlbum(String targetAlbumName) {
		for (int index = 0; index < albums.size(); index++) {
			if (albums.get(index).getAlbumName().equals(targetAlbumName)) {
				return index;
			}
		}
		return -1;
	}
	
	public int findSongInTargetAlbum(String targetAlbumName, String targetSongTitle) {
		int albumIndex = findAlbum(targetAlbumName);
		if (albumIndex != -1) {
			for (int songIndex = 0; songIndex < albums.get(albumIndex).songTitles.size(); songIndex++) {
				if (albums.get(albumIndex).getAlbumName().equals(targetSongTitle)) {
					return songIndex;
				}
			}
		}
		return -1;
	}
	
	public void addSongToAlbum(String songTitle, String albumName) {
		int albumIndex = findAlbum(albumName);
		if (albumIndex != -1) {
			albums.get(albumIndex).addSong(songTitle);
			System.out.println(songTitle + " has been added into " + albumName + ".");
		}
	}
	
	public void showAllSongsInAlbum(String targetAlbumName) {
		int albumIndex = findAlbum(targetAlbumName);
		if (albumIndex != -1) {
			System.out.println(albums.get(albumIndex).songTitles.toString());
		} else {
			System.out.println("Songs cannot be listed because of following reason.");
			System.out.println(targetAlbumName + " album is not found.");
		}
	}
}
