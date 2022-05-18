public class Class4 {
    public static void main(String[] args) {
        int n = 5,  x = 0;
        double sr;
        double sum = 0;
        int [][] arr = new int [n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = ((int)(Math.random() * 21) - 10);
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] > 0 && i < j) {
                    x = x + 1;
                    sum = sum + arr[i][j];
                }
            }
            System.out.println();
        }
        sr = sum/x;
        System.out.print(sr);
    }
}


//Дан двумерный массив А, размером (n*n)(или квадратная матрица А).
//Найти среднее арифметическое положительных элементов параллели главной диагонали, расположенной выше над диагональю.