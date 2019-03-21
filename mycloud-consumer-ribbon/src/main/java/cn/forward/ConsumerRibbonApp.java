package cn.forward;

import cn.noscan.conf.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
//@EnableEurekaClient
@RibbonClient(name = "MYCLOUD-PROVIDER-PRODUCT",configuration = RibbonConfig.class)
public class ConsumerRibbonApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerRibbonApp.class, args);
    }
}
