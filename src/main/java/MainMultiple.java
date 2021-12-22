import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainMultiple {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "five,six");

        try (final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationForNumbers.class)) {
            // prints {returnFive=5, returnSix=6}
            System.out.println(context.getBeansOfType(Integer.class));
        }
    }
}
