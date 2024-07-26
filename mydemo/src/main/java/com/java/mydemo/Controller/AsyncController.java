package com.java.mydemo.Controller;

import com.java.mydemo.AsyncService.OrderService;
import com.java.mydemo.DTO.AsyncOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("oder-product_AsyncConcept")
public class AsyncController {
    @Autowired
    OrderService orderService;

    @PostMapping("/oder")
    public AsyncOrder oderProduct(AsyncOrder asyncOrder) throws InterruptedException {
        orderService.oderProduct(asyncOrder);
        orderService.notifyOrder();
        orderService.dispatch();
        orderService.delivered();


        return asyncOrder;
    }
}
