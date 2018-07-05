package application;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动.
 *
 * @author skywalker
 */
@SpringBootApplication
@EnableEurekaServer
public class Bootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Bootstrap.class).web(WebApplicationType.SERVLET).run(args);
    }

}
