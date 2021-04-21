/**
 * 
 */
package com.devsuperior.ordersclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.ordersclient.entities.Client;

/**
 * @author Jose Eustaquio Muniz
 *
 */
public interface ClientRepository extends JpaRepository<Client, Long> {

}
