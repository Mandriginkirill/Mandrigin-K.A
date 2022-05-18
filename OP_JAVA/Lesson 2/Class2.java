public class Class2 {
    public static void main(String[] args) {
        int notNULL = 0;
        int n = 10;
        int[] x = new int[n];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int)(Math.random() * 10);
            System.out.print(x[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            int max = x[i];
            int max_i = i;
            for (int j = i+1; j < x.length; j++) {
                if (x[j] > max) {
                    max = x[j];
                    max_i = j;
                }
            }
            if (i != max_i) {
                int tmp = x[i];
                x[i] = x[max_i];
                x[max_i] = tmp;
            }
        }
        int[] y = new int[n];
        for (int i = 0; i < y.length; i++) {
            if (x[i]>3)
                y[i]=x[i];
            if (y[i] != 0)
                notNULL = notNULL + 1;
        }

        int[] arr = new int[notNULL];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = y[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
            System.out.print(arr[i]+" ");

        }
    }
}

//Дан массив x(n). Переписать в массив y(n) элементы массива x, большие 3.(со сжатием, без пустых элементов внутри).
//Затем упорядочть методом "выбора и перестановки" по возрастанию новый массив.