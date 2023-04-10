public class Track {
    private String name ;
    private double duration;

    /**
     * constructor of Track
     * @param name
     * @param duration
     */
    public Track(String name, double duration){
        setName(name);
        setDuration(duration);
    }

    /**
     * get the value of name of the track
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * change the value of name of the track
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get the value of duration of the track
     * @return duration
     */
    public double getDuration() {
        return duration;
    }

    /**
     * change the value of duration of the track
     * @param duration
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }

    
    
}
