package vc.issue.dubbo4842;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ImportResource;

/**
 * @author xiaolei.fu
 * @version 2019/9/12 15:11
 * @since 2019/9/12 15:11
 */
@EnableDubbo
@SpringBootApplication
@EnableDiscoveryClient
@ImportResource("classpath:dubbo.xml")
public class Dubbo4842ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(Dubbo4842ProviderApplication.class, args);
    }
}
