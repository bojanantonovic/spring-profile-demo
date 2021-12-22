import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainFive {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "five");

        try (final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationForNumbers.class)) {
            // prints 5
            System.out.println(context.getBean(Integer.class));
        }
    }
}
