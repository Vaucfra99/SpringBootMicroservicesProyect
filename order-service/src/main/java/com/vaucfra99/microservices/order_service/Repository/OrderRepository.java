package com.vaucfra99.microservices.order_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaucfra99.microservices.order_service.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
