/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmedia;

/**
 *
 * @author Robert
 */
public class YouTubeAdapter implements SocialMediaEntry{

    private YouTubeVideo video;
    
    public YouTubeAdapter(){
        video = new YouTubeVideo();
    }
    
    public YouTubeAdapter(String author, String title, String description){
        video = new YouTubeVideo(author, title, description);
    }
    
    public YouTubeAdapter(YouTubeVideo video){
        this.video = video;
    }
    
    @Override
    public String getUser() {
        return video.getAuthor();
    }

    @Override
    public String getPostText() {
        return video.getTitle() + video.getDescription();
    }
    
    
}
