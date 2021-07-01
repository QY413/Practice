package com.google;

public class VideoPlayer {

  private final VideoLibrary videoLibrary;

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  public void showAllVideos() {
    System.out.printf("Here's a list of all available videos:%n"+"%s"+" (%s) "+"%s%n"+"%s"+" (%s) "+"%s%n"+"%s"+" (%s) "+"%s%n"+"%s"+" (%s) "+"%s%n"+"%s"+" (%s) "+"%s%n", 
    		videoLibrary.getVideo("amazing_cats_video_id").getTitle(),videoLibrary.getVideo("amazing_cats_video_id").getVideoId(),videoLibrary.getVideo("amazing_cats_video_id").getTags(),
    		videoLibrary.getVideo("another_cat_video_id").getTitle(),videoLibrary.getVideo("another_cat_video_id").getVideoId(),videoLibrary.getVideo("another_cat_video_id").getTags(),
    		videoLibrary.getVideo("funny_dogs_video_id").getTitle(),videoLibrary.getVideo("funny_dogs_video_id").getVideoId(),videoLibrary.getVideo("funny_dogs_video_id").getTags(),
    		videoLibrary.getVideo("life_at_google_video_id").getTitle(),videoLibrary.getVideo("life_at_google_video_id").getVideoId(),videoLibrary.getVideo("life_at_google_video_id").getTags(),
    		videoLibrary.getVideo("nothing_video_id").getTitle(),videoLibrary.getVideo("nothing_video_id").getVideoId(),videoLibrary.getVideo("nothing_video_id").getTags()
    		);
  }

  public boolean play = false;
  public String nowId = null;
  public boolean pause=false;
  public void playVideo(String videoId) {
	  boolean exist = videoId.equals("funny_dogs_video_id")||videoId.equals("amazing_cats_video_id")||videoId.equals("another_cat_video_id")||videoId.equals("life_at_google_video_id")||videoId.equals("nothing_video_id");
	  if(!play && exist) {
		  nowId = videoId;
		  System.out.println("Playing video: "+ videoLibrary.getVideo(videoId).getTitle());
		  play = true;
		  pause = false;
	  }else if(play && exist){
		  System.out.println("Stopping video: "+ videoLibrary.getVideo(nowId).getTitle());
		  System.out.println("Playing video: "+ videoLibrary.getVideo(videoId).getTitle());
		  nowId = videoId;
		  pause = false;
	  }else {
		  System.out.println("Cannot play video: Video does not exist");
	  }
  }

  public void stopVideo() {
	  if(play) {
		  System.out.println("Stopping video: "+videoLibrary.getVideo(nowId).getTitle());
		  nowId = null;
		  play=false;
		  pause=false;
	  }else {
		  System.out.println("Cannot stop video: No video is currently playing");
	  }
    
  }

  public void playRandomVideo() {
	  String ranId = "";
	  String[] doc = {"funny_dogs_video_id", "amazing_cats_video_id", "another_cat_video_id", "life_at_google_video_id","nothing_video_id"};
	  int index = (int) (Math.random() * doc.length);
	  ranId = doc[index];
	  if(!play) {
		  System.out.println("Playing video: " + videoLibrary.getVideo(ranId).getTitle());
		  play = true;
		  nowId = ranId;
		  pause = false;
	  }else {
		  System.out.println("Stopping video: " + videoLibrary.getVideo(nowId).getTitle());
		  System.out.println("Playing video: " + videoLibrary.getVideo(ranId).getTitle());
		  nowId = ranId;
		  pause = false;
	  }
    
  }
//public boolean pause=false;
  public void pauseVideo() {
	  if(play&&!pause) {
		  System.out.println("Pausing video: "+videoLibrary.getVideo(nowId).getTitle());
		  pause = true;
	  }else if(pause){
		  System.out.println("Video already paused: "+ videoLibrary.getVideo(nowId).getTitle());
		  
	  }else if(!play){
		  System.out.println("Cannot pause video: No video is currently playing");
	  }
    
  }

  public void continueVideo() {
	  if(pause) {
		  System.out.println("Continuing video: "+videoLibrary.getVideo(nowId).getTitle());
		  pause = false;
	  }else if(!play) {
		  System.out.println("Cannot continue video: No video is currently playing");
	  }else {
		  System.out.println("Cannot continue video: Video is not paused");
	  }
    
  }

  public void showPlaying() {
	  if(play&&!pause) {
		  System.out.println("Currently playing: "+videoLibrary.getVideo(nowId).getTitle()+" ("+videoLibrary.getVideo(nowId).getVideoId()+") "+videoLibrary.getVideo(nowId).getTags());
	  }else if(play&&pause) {
		  System.out.println("Currently playing: "+videoLibrary.getVideo(nowId).getTitle()+" ("+videoLibrary.getVideo(nowId).getVideoId()+") "+videoLibrary.getVideo(nowId).getTags()+" - PAUSED");
	  }else {
		  System.out.println("No video is currently playing");
	  }
    
  }

  public void createPlaylist(String playlistName) {
    System.out.println("createPlaylist needs implementation");
  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    System.out.println("addVideoToPlaylist needs implementation");
  }

  public void showAllPlaylists() {
    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}