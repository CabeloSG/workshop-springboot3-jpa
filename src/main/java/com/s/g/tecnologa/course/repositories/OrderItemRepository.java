package com.s.g.tecnologa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.s.g.tecnologa.course.entities.OrderItem;
import com.s.g.tecnologa.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
	
	
	

}
