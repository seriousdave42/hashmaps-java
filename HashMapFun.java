import java.util.HashMap;
import java.util.Set;

public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Track 1", "Tra la la, tra la la la");
        trackList.put("Track 2", "Do re mi fa so la ti do");
        trackList.put("Track 3", "Doo doo doo doo doo doo doo doo doo doo doo doo doo doo doo doo Batman!");
        trackList.put("Track 4", "Insipid bullshit");

        System.out.println(trackList.get("Track 3"));
        System.out.println();

        Set<String> allTracks = trackList.keySet();
        for (String track : allTracks) {
            System.out.println(track + ": " + trackList.get(track));
        }

    }
}
