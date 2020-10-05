import java.time.*;
import java.util.Iterator;
import java.util.Set;

public class TimeConverter {
    //Converting current time to all available zone ids
    public static void main(String[] args){
        //Getting available zone ids
        Set<String> zones = ZoneId.getAvailableZoneIds();
        System.out.println(zones.size());
        Iterator<String> iter = zones.iterator();
        while(iter.hasNext()) {
            String s = iter.next();
            System.out.print(s+" --> ");
            System.out.println(OffsetDateTime.now(ZoneId.of(s)).toString());
        }
    }
}
