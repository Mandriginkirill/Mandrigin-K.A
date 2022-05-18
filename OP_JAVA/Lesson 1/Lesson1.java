public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello " + (args.length > 0 ? args[0] : "world"));
    }
}

/*Реализовать программу, получающую на вход в качестве аргумента имя че- ловека и выводящую “Hello
 + имя, в противном случае, если параметр не переда- вался, “Hello world”.*/