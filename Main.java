import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //****************get inputs**************************
        String mainArtistName = "Taylor Swift";
        String performanceName = "Eras Tour";
        int year = 2023;
        String venue = "Glendale";
        String trackList[]= {"Lavender Haze" , "All Too Well, the lakes" , "The Man" ,  "Love Story"};
        String backupSingers[] = {"Jeslyn" , "Melanie"};
        String backupDancers[] = {"Stephanie" , "Jake"};

        // **********create arrayList for add objects*********************
        List<Track> musicTrackList = new ArrayList<>();
        List<BackupSinger> backupSingersList = new ArrayList<>();
        List<BackupDancer> backupDancersList = new ArrayList<>();

        //***************  creat objects for given inputs*************************
        MainArtist mainArtist = new MainArtist(mainArtistName);

        for (String trackName : trackList){//If there is the duration, we can use hashmap rather than array list.
            Track musicTrack = new Track(trackName , 10); // I used same duration for all track.
            musicTrackList.add(musicTrack);
        }

        for( String backupSingerName  : backupSingers){
            BackupSinger backupSinger = new BackupSinger(backupSingerName);
            backupSingersList.add(backupSinger);
        }
        for( String backupDancerName  : backupDancers){
            BackupDancer backupDancer = new BackupDancer(backupDancerName);
            backupDancersList.add(backupDancer);
        }

        // ************create the live performance object***********************
        LivePerformance livePerformance = new LivePerformance(mainArtist, performanceName, year, venue, musicTrackList, backupSingersList, backupDancersList);
        // **************call methods*******************************
        livePerformance.intractWithAudience();

        




        
    }
    
}
