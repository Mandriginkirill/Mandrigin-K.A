public class Lesson2 {
    public static void main(String[] args) {
        int c = 0;
        for (int i = 0; i < args.length; i++) {
            c++;
        }
        if (c > 0) {
            System.out.println("Вы ввели " + c + " параметров");
        }
        else {
            System.out.println("Вы не передавали параметров");
        }
    }
}

/*Написать программу, получающую на вход в качестве аргумента несколько параметров. В программе
вывести “Вы ввели” + N (количество параметров) + “па- раметров”. Если параметры не передавались,
вывести “Вы не передавали парамет- ров”*/