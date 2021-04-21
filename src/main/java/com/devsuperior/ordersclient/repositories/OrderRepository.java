/**
 * 
 */
package com.devsuperior.ordersclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.ordersclient.entities.Order;

/**
 * @author Jose Eustaquio Muniz
 *
 */
public interface OrderRepository extends JpaRepository<Order, Long> {

}
