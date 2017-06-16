import java.util.HashMap;
import java.util.Map;

/**
 * Created by viivpo2010 on 11.6.17.
 */
public class MapName {

    private static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(1989,"Я");
        map.put(1988,"Жена");
        map.put(2015,"Сын");
        map.put(1991,"Брат");
        map.put(1966,"Мама");
        map.put(1964,"Папа");

    }

    public Map<Integer, String> getMap(){
        return map;
    }


}
