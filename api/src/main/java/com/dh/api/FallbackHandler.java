package com.dh.api;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
public class FallbackHandler{

    @GetMapping("/pmaFallback")
    public String pmaFallback(){
        log.info("invoking pma fallback handler.");
        return "hi from fallback pma";
    }
}
