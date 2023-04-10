import java.util.List;

public abstract class Performance{
    private MainArtist mainArtist;
    private String performanceName;
    private int year;
    private String venue;
    private List<Track> trackList;
    private List<BackupSinger> backupSingersList;
    private List<BackupDancer> backupDancersList;
    /**
     * construactor of Performace
     * @param mainArtist
     * @param performanceName
     * @param year
     * @param venue
     * @param trackList
     * @param backupSingersList
     * @param backupDancersList
     */
    public Performance(MainArtist mainArtist, String performanceName, int year, String venue, List<Track> trackList,List<BackupSinger> backupSingersList, List<BackupDancer> backupDancersList) {
        this.mainArtist = mainArtist;
        setPerformanceName(performanceName);
        this.year = year;
        this.venue = venue;
        setTrackList(trackList);
        this.backupSingersList = backupSingersList;
        this.backupDancersList = backupDancersList;
        System.out.println("Welcome to the Performance "+ performanceName + "by "+mainArtist.getName()+"!");
        this.mainArtist.sing(); // call the method sing of mainArtist
        for(BackupSinger backupSinger: this.backupSingersList){
            backupSinger.backup(); // call the method backup of backupSinger to back main artist up
        }
        for(BackupDancer backupDancer : this.backupDancersList){
            backupDancer.backup();// call the method backup of backupDancer to back main artist up
        }
    }

    // abstact method
    public abstract void record();

    
    /**
     * get the value of performanceName
     * @return performanceName
     */
    public String getPerformanceName() {
        return performanceName;
    }

    /**
     * set the new value to performanceName
     * @param performanceName
     */
    public void setPerformanceName(String performanceName) {
        this.performanceName = performanceName;
    }


    /**
     * get the value of year
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     * get the value of venue
     * @return venue
     */
    public String getVenue() {
        return venue;
    }

    
    /**
     * change the tracklist 
     * @param trackList
     */
    public void setTrackList(List<Track> trackList) {
        this.trackList = trackList;
    }


}