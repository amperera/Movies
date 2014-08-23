/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MovieDL;

/**
 *
 * @author Uthtara
 */
public class Movie {
    
    private String title;
    private String cast;
    private String crew;
    private String genre;
    private String Studio;
    private String Story;
    private String Released;
    private String MainActor;
    private int Stock;
    private String price;

    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getCast() {
        return cast;
    }

    
    public void setCast(String cast) {
        this.cast = cast;
    }

    
    public String getCrew() {
        return crew;
    }

    
    public void setCrew(String crew) {
        this.crew = crew;
    }

    
    public String getStudio() {
        return Studio;
    }

    
    public void setStudio(String Studio) {
        this.Studio = Studio;
    }

    
    public String getStory() {
        return Story;
    }

    
    public void setStory(String Story) {
        this.Story = Story;
    }

    
    public String getReleased() {
        return Released;
    }

    
    public void setReleased(String Released) {
        this.Released = Released;
    }

   
    public String getMainActor() {
        return MainActor;
    }

    
    public void setMainActor(String MainActor) {
        this.MainActor = MainActor;
    }

    
    public int getStock() {
        return Stock;
    }

    
    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }
    
    
}