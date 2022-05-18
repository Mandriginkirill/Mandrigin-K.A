import java.util.Vector;

public class Class3 {
    public static void main(String[] args) {
        int n = 0, pr = 1;
        double x;
        Vector B = new Vector();
        int [][] arr = new int [3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = ((int)(Math.random() * 21) - 10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] >= 1 ) {
                    n = n + 1;
                    pr = pr * arr[i][j];
                }
            }
            x = Math.pow(pr, 1.0/n);
            B.add(x);
            n = 0;
            pr = 1;
        }
        System.out.println();
        System.out.print(B + " ");
    }
}

//Определить матрицу(двумерный массив) и ее заполнить случайными значениями.
//Построить вектор В, который возвращает среднее геометрическое положительных элементов в каждом столбце матрицы.