import javax.xml.bind.SchemaOutputResolver;
import java.util.Random;

/**
 * Created by viivpo2010 on 14.6.17.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] massive = {8,15,56,7,2,3,99,45,12,6};
        System.out.println("!!!!!!!!!");



// second change
        System.out.println("ASD");



        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }


        for (int i = 0; i < massive.length; i++) {

            for (int j = massive.length - 1; j > i; j--) {

                if (massive[j] < massive[j - 1]) {
                    int temp = massive[j];
                    massive[j] = massive[j - 1];
                    massive[j - 1] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < massive.length; i++) {

            System.out.print(massive[i] + " ");
        }
    }
}