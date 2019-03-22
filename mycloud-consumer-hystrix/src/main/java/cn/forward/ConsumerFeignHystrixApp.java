package cn.forward;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("cn.forward.service")
//@RibbonClient(name = "MYCLOUD-PROVIDER-PRODUCT",configuration = RibbonClient.class)
public class ConsumerFeignHystrixApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignHystrixApp.class, args);
    }
}
