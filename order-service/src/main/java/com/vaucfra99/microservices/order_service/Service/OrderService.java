package com.vaucfra99.microservices.order_service.Service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.vaucfra99.microservices.order_service.Repository.OrderRepository;
import com.vaucfra99.microservices.order_service.dto.OrderRequest;
import com.vaucfra99.microservices.order_service.model.Order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest){

        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkuCode(orderRequest.skuCode());
        log.info("asdaksmndlkamndskjadkjansd");
        log.info(orderRequest.skuCode());
        order.setQuantity(orderRequest.quantity());
        orderRepository.save(order);

    }

}
