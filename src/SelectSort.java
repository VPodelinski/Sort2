/**
 * Created by viivpo2010 on 14.6.17.
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] massive = {8, 15, 56, 7, 2, 3, 99, 45, 12, 6};


        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }


        for (int i = 0; i < massive.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = massive[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i + 1; j < massive.length; j++) {
                //Если находим, запоминаем его индекс
                if (massive[j] < min) {
                    min = massive[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                int tmp = massive[i];
                massive[i] = massive[min_i];
                massive[min_i] = tmp;
            }
        }

        System.out.println();
        for (int i = 0; i < massive.length; i++) {

            System.out.print(massive[i] + " ");
        }


    }
}