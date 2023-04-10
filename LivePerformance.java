import java.util.List;

public class LivePerformance extends Performance {
    
    /**
     * constructor of LivePerformance
     * @param mainArtist
     * @param performanceName
     * @param year
     * @param venue
     * @param trackList
     * @param backupSingersList
     * @param backupDancersList
     */
    public LivePerformance(MainArtist mainArtist, String performanceName, int year, String venue, List<Track> trackList,List<BackupSinger> backupSingersList, List<BackupDancer> backupDancersList) {
        super(mainArtist, performanceName, year, venue, trackList, backupSingersList, backupDancersList);
        
    }

    
    @Override
    public void record() {
        System.out.println("This is the method record in the class LivePerformance.");
    }

    
    public void intractWithAudience(){
        System.out.println("This is the method intractWithAudience in the class LivePerformance.");

    }

    
    
}
