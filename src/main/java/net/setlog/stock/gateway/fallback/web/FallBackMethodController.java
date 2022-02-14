package net.setlog.stock.gateway.fallback.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallBackMethodController {

    @GetMapping("/tradingEurekaServerFallBack")
    public String tradingEurekaServerFallBack() {
        return "TRADING-EUREKA-SERVER is taking longer than Expected. Please try again later";
    }

    @GetMapping("/tradingConfigServerFallBack")
    public String tradingConfigServerFallBack() {
        return "TRADING-CONFIG-SERVER is taking longer than Expected. Please try again later";
    }

    @GetMapping("/commonServiceFallBack")
    public String commonServiceFallBack() {
        return "COMMON SERVER is taking longer than Expected. Please try again later";
    }
}
