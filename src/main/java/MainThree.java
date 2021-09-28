
import cp.ConnectionPool;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainThree {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = null;
        ConnectionPool cp = null;

        try {
            context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

            cp = context.getBean("pool", ConnectionPool.class);
            cp.init();
        } catch (Exception e) {

        } finally {
            if (context != null) {
                context.close();
            }
        }
    }
}
