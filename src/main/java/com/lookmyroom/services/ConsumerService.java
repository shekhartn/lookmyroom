/**
 * 
 */
package com.lookmyroom.services;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lookmyroom.model.Consumer;
import com.lookmyroom.repository.ConsumerRepository;

/**
 * @author shekhar_t
 *
 */
@Service
public class ConsumerService {
	@Autowired
	private ConsumerRepository consumerRepository;
	
	public Consumer createConsumer(Consumer consumer) {
		consumer=consumerRepository.save(consumer);
		return consumer;
	}
	
	public Consumer getConsumerDetails(BigInteger consumerId) {
		return consumerRepository.findByConsumerId(consumerId);
	}

	public List<Consumer> getAllConsumers() {
		return consumerRepository.findAll();
	}

	public String deleteConsumer(BigInteger consumerId) {
		Consumer consumer=consumerRepository.findByConsumerId(consumerId);
		consumerRepository.deleteById(consumerId);
		return consumer.getEmail();
	}

}
