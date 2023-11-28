package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainFive {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "five");

        try (final var context = new AnnotationConfigApplicationContext(ConfigurationForNumbers.class)) {
            // prints 4 and 5
            System.out.println(context.getBeansOfType(Integer.class));
        }
    }
}
