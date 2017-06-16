import java.util.Map;

/**
 * Created by viivpo2010 on 11.6.17.
 */
public class HW3 {
    public static void main(String[] args) {
        int userDate = Integer.valueOf(args[0]);
        int min = 2017;
        int raznica=0;

        String nameMin = "";

        MapName mapName = new MapName();

        for (Map.Entry<Integer, String> pair : mapName.getMap().entrySet()) {

            int date = pair.getKey();
            if (date == userDate) {
                System.out.println(pair.getValue());
                return;

            } else  {
                raznica = Math.abs(userDate - date);
               // System.out.println(raznica + " qwerty " + pair.getValue());
                if (raznica < min){
                    min = raznica;
                    nameMin = pair.getValue();
                    //System.out.println(min + " "+ pair.getValue());
                }
            }
           // System.out.println(min + "!!!!" + pair.getValue());
        }System.out.println(min + " years minimum " + nameMin);





    }
}
