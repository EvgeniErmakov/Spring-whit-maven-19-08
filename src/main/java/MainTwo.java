
import cp.ConnectionPool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTwo {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = null;
        ConnectionPool cp = null;

        try {
            context = new ClassPathXmlApplicationContext("applicationContextTwo.xml");

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
