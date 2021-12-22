import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDefault {

    public static void main(String[] args) {
        try (final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationForNumbers.class)) {

            // prints 4
            System.out.println(context.getBean(Integer.class));
        }
    }
}
