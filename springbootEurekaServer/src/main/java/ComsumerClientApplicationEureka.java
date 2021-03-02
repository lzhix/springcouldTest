import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(scanBasePackages="controller")
@EnableEurekaServer
@RefreshScope
public class ComsumerClientApplicationEureka {
    public static void main(String[] args) {

        SpringApplication.run(ComsumerClientApplicationEureka.class, args);
    }

}
