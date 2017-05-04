package linkedListExercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MusicPlayer {
	private static ArrayList<Album> albums = new ArrayList<Album>();
	
	public static void main(String[] args) {
		Album album = new Album("Sand Vol. 1", "SilverComet");
		album.addSongToAlbum("Track one", 3.25);
		album.addSongToAlbum("Track two", 5.25);
		album.addSongToAlbum("Track three", 4.25);
		album.addSongToAlbum("Track four", 3.45);
		album.addSongToAlbum("Track five", 2.25);
		albums.add(album);
		System.out.println(album.toString());
		
		album = new Album("Sand Vol. 2", "Selenium");
		album.addSongToAlbum("Track oneone", 1.11);
		album.addSongToAlbum("Track twotwo", 2.22);
		album.addSongToAlbum("Track threethree", 3.33);
		album.addSongToAlbum("Track fourfour", 4.44);
		album.addSongToAlbum("Track fivefive", 5.55);
		albums.add(album);
		System.out.println();
		System.out.println(album.toString());
		
		LinkedList<Song> sandPlayList = new LinkedList<Song>();
		albums.get(0).addSongtoPlayList(2, sandPlayList);
		albums.get(0).addSongtoPlayList(3, sandPlayList);
		albums.get(0).addSongtoPlayList(4, sandPlayList);
		albums.get(1).addSongtoPlayList("Track oneone", sandPlayList);
		albums.get(1).addSongtoPlayList("Track twotwo", sandPlayList);
		albums.get(1).addSongtoPlayList(3, sandPlayList);
		
		play(sandPlayList);
		
	}
	
	private static void play(LinkedList<Song> playListName){
		ListIterator<Song> listIterator = playListName.listIterator();
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		int songIndex = 0;
		if(playListName.size() > 0){
			while (!quit) {
				int selectedMode = scanner.nextInt();
				switch (selectedMode) {
				case 0:
					System.out.println("Media player is turning off.");
					quit = true;
					break;
				case 1:
					System.out.println("Forward to next song");
					if (listIterator.hasNext()) {
						if (!forward) { listIterator.next(); forward = true;}
						if (listIterator.hasPrevious()) { songIndex++; }
						System.out.println(listIterator.next().toString());
						System.out.println("songIndex value is: " + songIndex);
					} else {
						System.out.println("This is the last song in the playlist.");
					}
					break;
				case 2:
					System.out.println("Backward to previous song");
					if (listIterator.hasPrevious()) {
						if (forward) { listIterator.previous(); forward = false;}
						if (listIterator.hasNext()) { songIndex--; }
						System.out.println(listIterator.previous().toString());
						System.out.println("songIndex value is: " + songIndex);
					} else {
						System.out.println("This is the first song in the playlist.");
					}
					break;
				case 3:
					System.out.println("Replay current song");
					System.out.println("songIndex value is: " + songIndex);
					System.out.println(playListName.get(songIndex).toString());
					break;
				case 4:
					System.out.println("All songs in the playlist");
					listAllSongsInPlaylist(playListName);
					break;
				case 5:
					System.out.println("All menus");
					showAllMenus();
					break;
					
				default:
					break;
				}
			}
		} else {
			System.out.println("There is no song in the play list.");
		}
	}

	private static void showAllMenus() {
		System.out.println("Press 1 - Forward to next song");
		System.out.println("Press 2 - Backward to previous song");
		System.out.println("Press 3 - Show all songs in playlist");
		System.out.println("Press 4 - Replay current song");
		System.out.println("Press 5 - Show all menus");
		System.out.println("Press 0 - Turn off media player");
	}

	private static void listAllSongsInPlaylist(LinkedList<Song> playListName) {
		System.out.println(playListName.toString());
	}
}
