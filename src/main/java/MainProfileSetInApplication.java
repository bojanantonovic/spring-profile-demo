import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProfileSetInApplication {

    public static void main(String[] args) {
        try (final var context = new AnnotationConfigApplicationContext()) {
            context.register(ConfigurationForNumbers.class);
            context.getEnvironment().setActiveProfiles("five");
            context.refresh();

            System.out.println(context.getBean(Integer.class));
        }
    }
}
