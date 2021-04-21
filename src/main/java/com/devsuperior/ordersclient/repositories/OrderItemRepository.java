/**
 * 
 */
package com.devsuperior.ordersclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.ordersclient.entities.OrderItem;

/**
 * @author Jose Eustaquio Muniz
 *
 */
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
