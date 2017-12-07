package de.unistuttgart.iaas.icetea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayerEvent;
import javazoom.jlgui.basicplayer.BasicPlayerListener;

public class Player implements BasicPlayerListener{
	
	private PlayerCore player;
	
	public Player() {
		this.player = new PlayerCore(this);
	}
	
	/**
	 * Adds a playlist to playlists and ensures 
	 * all songs of the playlist are known
	 * 
	 * @param list is a playlist that should be added to playlists
	 */
	public void addPlaylist(Playlist list) {
		//TODO
	}
	
	/**
	 * Adds a song to songs
	 * 
	 * @param song is a song that should be added to songs
	 */
	public void addSong(Song song) {
		//TODO
	}
		
	/**
	 * getter for all the stored songs
	 *
	 * @return returns all the songs as a ArrayList
	 */
	public ArrayList<Song> getSongs() {
		//TODO
		return null;
	}
	
	/**
	 * getter for all the stored playlists
	 *
	 * @return returns all the playlists as a ArrayList
	 */
	public ArrayList<Playlist> getPlaylists() {
		//TODO
		return null;
	}
	
	/**
	 * If a song was played before and the player stopped playback
	 * this method starts playback with the last played song.
	 *
	 * If a playlist was played before this method will continue
	 * the playlist at the position at which playback was stopped
	 */
	public void play() {
		//TODO
	}
	
	/**
	 * plays a song
	 * 
	 * @param song is a song that should be played
	 */
	public void play(Song song) {
		//TODO
	}
	
	/**
	 * Starts playback of a whole playlist
	 * 
	 * @param list is a playlist that should be played
	 */
	public void play(Playlist playlist) {
		//TODO
	}
	
	/**
	 * This skips right to the next song in a playlist if a playlist is 
	 * beeing played and has a next song.
	 * If the playlist has no next song playback is stopped.
	 */
	public void skip() {
		//TODO
	}

	/**
	 * pauses playback
	 */
	public void pause() {
		//TODO
	}
	
	/**
	 * resumes playback
	 */
	public void resume() {
		//TODO
	}
	
	/**
	 * stops playback
	 */
	public void stop() {
		//TODO
	}
	
	@Override
	public void opened(Object arg0, Map arg1) {
		// Nothing todo here
	}

	@Override
	public void progress(int arg0, long arg1, byte[] arg2, Map arg3) {
		// Nothing todo here
	}

	@Override
	public void setController(BasicController arg0) {
		// Nothing todo here
	}

	@Override
	public void stateUpdated(BasicPlayerEvent event) {
		//if Song finished playing
		if(event.getCode() == BasicPlayerEvent.EOM){
		}
	}
	
	/**
	 * You can use this method to test your implementation
	 */
	public static void main(String[] args){
		// TODO do testing here
	}
}
