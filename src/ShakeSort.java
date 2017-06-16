/**
 * Created by viivpo2010 on 14.6.17.
 */
public class ShakeSort {
    public static void main(String[] args) {
        int[] massive = {8, 15, 56, 7, 2, 3, 99, 45, 12, 6};


        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }

        int left = 0, right = massive.length - 1, temp;

        do {
            for (int i = right; i > left; i--)
            {
                if (massive[i] < massive[i - 1])
                {
                    temp = massive[i];
                    massive[i] = massive[i - 1];
                    massive[i - 1] = temp;
                }
            }
            left++;
            for (int i = left; i < right; i++)
            {
                if (massive[i] > massive[i + 1])
                {
                    temp = massive[i];
                    massive[i] = massive[i + 1];
                    massive[i + 1] = temp;
                }
            }
            right--;
        }
        while (left <= right);

        System.out.println();
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
    }
}