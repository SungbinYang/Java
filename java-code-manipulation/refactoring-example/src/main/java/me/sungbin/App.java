package me.sungbin;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Book> bookClass = Book.class;
        Book book = new Book();

        Arrays.stream(bookClass.getDeclaredFields()).forEach(f -> {
            try {
                f.setAccessible(true);
                System.out.printf("%s %s\n", f, f.get(book));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });

        Arrays.stream(bookClass.getDeclaredMethods()).forEach(System.out::println);

        Arrays.stream(bookClass.getDeclaredConstructors()).forEach(System.out::println);

        Arrays.stream(MyBook.class.getInterfaces()).forEach(System.out::println);

        System.out.println(MyBook.class.getSuperclass());

        Arrays.stream(Book.class.getDeclaredFields()).forEach(f -> {
            int modifiers = f.getModifiers();
            System.out.println(f);
            System.out.println(Modifier.isPrivate(modifiers));
            System.out.println(Modifier.isStatic(modifiers));
        });

        Arrays.stream(Book.class.getMethods()).forEach(m -> {
            int modifiers = m.getModifiers();
        });

        Arrays.stream(Book.class.getAnnotations()).forEach(System.out::println);

        Arrays.stream(MyBook.class.getAnnotations()).forEach(System.out::println);

        Arrays.stream(MyBook.class.getDeclaredAnnotations()).forEach(System.out::println);

        Arrays.stream(Book.class.getDeclaredFields()).forEach(f -> {
            Arrays.stream(f.getAnnotations()).forEach(a -> {
                if (a instanceof AnotherAnnotation anotherAnnotation) {
                    System.out.println(anotherAnnotation.value());
                    System.out.println(anotherAnnotation.number());
                }
            });
        });
    }
}