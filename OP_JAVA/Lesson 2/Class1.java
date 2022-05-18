public class Class1 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random() * 21) - 10);
            System.out.print(arr[i]+" ");
        }
        int length = arr.length;
        int a = 0;
        for (int i = 1; i < length; i++)
            if ((arr[i] < 0 && arr[i - 1] > 0) || (arr[i] > 0 && arr[i - 1] < 0)) {
                a++;
            }
        System.out.println("\nЗнак меняется: "  + a + " раза/раз.");
    }
}


//Определить одномерный массив и заполнить его случайными числами. Определить сколько раз в этом массиве меняется знак.