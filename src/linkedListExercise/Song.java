package linkedListExercise;

public class Song {
	String songTitle;
	int songDurationInSecond;
	
	public Song(String songTitle, int songDurationInSecond) {
		this.songTitle = songTitle;
		this.songDurationInSecond = songDurationInSecond;
	}

	public String getSongTitle() {
		return songTitle;
	}

	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}

	public int getSongDurationInSecond() {
		return songDurationInSecond;
	}

	public void setSongDurationInSecond(int songDurationInSecond) {
		this.songDurationInSecond = songDurationInSecond;
	}

}
