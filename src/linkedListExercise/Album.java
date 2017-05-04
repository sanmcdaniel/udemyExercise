package linkedListExercise;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String albumName;
	private String artist;
	private ArrayList<Song> songs;
	
	public Album(String albumName, String artist) {
		this.albumName = albumName;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	
	public boolean addSongToAlbum(String songTitle, double songDuration) {
		if (findSong(songTitle) == null) {
			this.songs.add(new Song(songTitle, songDuration));
			return true;
		}
		return false;
	}
	
	private Song findSong(String songTitle) {
		for (Song checkedSong : songs) {
			if(checkedSong.getSongTitle().equals(songTitle)){
				return checkedSong;
			}
		}
		return null;
	}
	
	public boolean addSongtoPlayList(String songTitle, LinkedList<Song> playlist) {
		Song targetSong = findSong(songTitle);
		if (targetSong != null) {
			playlist.add(targetSong);
			return true;
		}
		System.out.println(songTitle + " is not found in this album.");
		return false;
	}
	
	public boolean addSongtoPlayList(int trackNumber, LinkedList<Song> playlist) {
		int songIndexInAlbum = trackNumber - 1;
		if (songIndexInAlbum >= 0 && songIndexInAlbum <= this.songs.size()) {
			playlist.add(this.songs.get(songIndexInAlbum));
			return true;
		}
		System.out.println("Track number " +trackNumber + " is not found in this album.");
		return false;
	}

	@Override
	public String toString() {
		return albumName + "\n" + songs.toString();
	}
	
	

//	public void createAlbum(String albumName) {
//		if (findAlbum(albumName) != -1) {
//			System.out.println("This album is already existing.");
//		} else {
//			albums.add(new Album(albumName));
//			System.out.println(albumName + " has been created.");
//		}
//	}
//	
//	public int findAlbum(String targetAlbumName) {
//		for (int index = 0; index < albums.size(); index++) {
//			if (albums.get(index).getAlbumName().equals(targetAlbumName)) {
//				return index;
//			}
//		}
//		return -1;
//	}
//	
//	public int findSongInTargetAlbum(String targetAlbumName, String targetSongTitle) {
//		int albumIndex = findAlbum(targetAlbumName);
//		if (albumIndex != -1) {
//			for (int songIndex = 0; songIndex < albums.get(albumIndex).songTitles.size(); songIndex++) {
//				if (albums.get(albumIndex).getAlbumName().equals(targetSongTitle)) {
//					return songIndex;
//				}
//			}
//		}
//		return -1;
//	}
//	
//	public void addSongToAlbum(String songTitle, String albumName) {
//		int albumIndex = findAlbum(albumName);
//		if (albumIndex != -1) {
//			albums.get(albumIndex).addSong(songTitle);
//			System.out.println(songTitle + " has been added into " + albumName + ".");
//		}
//	}
//	
//	public void showAllSongsInAlbum(String targetAlbumName) {
//		int albumIndex = findAlbum(targetAlbumName);
//		if (albumIndex != -1) {
//			System.out.println(albums.get(albumIndex).songTitles.toString());
//		} else {
//			System.out.println("Songs cannot be listed because of following reason.");
//			System.out.println(targetAlbumName + " album is not found.");
//		}
//	}
}
