import java.util.List;

public class StudioPerformance extends Performance {
    /**
     * constructor of StudioPerformance
     * @param mainArtist
     * @param performanceName
     * @param year
     * @param venue
     * @param trackList
     * @param backupSingersList
     * @param backupDancersList
     */
    public StudioPerformance(MainArtist mainArtist, String performanceName, int year, String venue, List<Track> trackList,List<BackupSinger> backupSingersList, List<BackupDancer> backupDancersList) {
        super(mainArtist, performanceName, year, venue, trackList, backupSingersList, backupDancersList);
        
    }

    @Override
    public void record() {
        System.out.println("This is the method record in the class StudioPerformance.");
    }

    public void audioProcessing(){
        System.out.println("This is the method audioProcessing in the class StudioPerformance.");
    }
    
}
