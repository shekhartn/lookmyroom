/**
 * 
 */
package com.lookmyroom.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lookmyroom.model.Consumer;

/**
 * @author shekhar_t
 *
 */
public interface ConsumerRepository extends JpaRepository<Consumer,BigInteger> {

	Consumer findByConsumerId(BigInteger consumerID);
}
