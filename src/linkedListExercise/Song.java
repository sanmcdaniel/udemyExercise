package linkedListExercise;

public class Song {
	private String songTitle;
	private double songDuration;
	
	public Song(String songTitle, double songDuration) {
		this.songTitle = songTitle;
		this.songDuration = songDuration;
	}

	public String getSongTitle() {
		return songTitle;
	}

	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}

	public double getSongDurationInSecond() {
		return songDuration;
	}

	public void setSongDurationInSecond(int songDurationInSecond) {
		this.songDuration = songDurationInSecond;
	}

	@Override
	public String toString() {
		return "Title: " + songTitle + ", Duration: " + songDuration + "\n";
	}
}
