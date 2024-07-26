package com.java.mydemo.AsyncService;

import com.java.mydemo.DTO.AsyncOrder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    public AsyncOrder oderProduct(AsyncOrder asyncOrder) throws InterruptedException {
        asyncOrder.setOrderId(UUID.randomUUID().toString());
        if(checkProductInventry(asyncOrder.getProductId())){

           if(payment(asyncOrder)){
               asyncOrder.setOderName(asyncOrder.getOderName());
               asyncOrder.setProductId(asyncOrder.getProductId());
               asyncOrder.setPrice(asyncOrder.getPrice());
           }
        }else{
            throw new RuntimeException("Product not available");
        }

        return asyncOrder;
    }

    public Boolean checkProductInventry(String productId) throws InterruptedException {
        Thread.sleep(2000);
        return true;
    }
    public Boolean payment(AsyncOrder asyncOrder) throws InterruptedException {
        Thread.sleep(3000);
        return true;
    }

    @Async
    public String notifyOrder() throws InterruptedException {
        Thread.sleep(2000);
        return "order is confirmed";
    }
    @Async
    public String dispatch() throws InterruptedException {
        Thread.sleep(2000);
        return "product is dispatched";
    }
    @Async
    public String delivered() throws InterruptedException {
        Thread.sleep(2000);
        return "product is delivered";
    }
}
