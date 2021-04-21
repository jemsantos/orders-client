/**
 * 
 */
package com.devsuperior.ordersclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.ordersclient.entities.Product;

/**
 * @author Jose Eustaquio Muniz
 *
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
