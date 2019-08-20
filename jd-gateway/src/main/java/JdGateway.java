import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author zxw
 * @date 2019/8/20 20:27
 */
@SpringCloudApplication
@EnableZuulProxy
public class JdGateway {
    public static void main(String[] args) {
        SpringApplication.run(JdGateway.class);
    }
}
