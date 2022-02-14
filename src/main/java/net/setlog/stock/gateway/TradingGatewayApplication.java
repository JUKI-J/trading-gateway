package net.setlog.stock.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TradingGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TradingGatewayApplication.class, args);
    }

}
