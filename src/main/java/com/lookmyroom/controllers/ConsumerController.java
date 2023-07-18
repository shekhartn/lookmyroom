/**
 * 
 */
package com.lookmyroom.controllers;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lookmyroom.model.Consumer;
import com.lookmyroom.services.ConsumerService;

/**
 * @author shekhar_t
 *
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
	private static final Logger logger 
	  = LoggerFactory.getLogger(ConsumerController.class);
	
	@Autowired
	private ConsumerService consumerService;
	
	@PostMapping
	public @ResponseBody Consumer createConsumer(@RequestBody Consumer consumer) {
		consumer.setCreatedDate(new Date());
		consumer.setModifiedDate(new Date());
		return consumerService.createConsumer(consumer);
	}
	@GetMapping
	public @ResponseBody List<Consumer> getAllConsumers() {
		logger.debug("GET ALL CONSUMERS");
		logger.info("GET ALL CONSUMERS");
		logger.error("GET ALL CONSUMERS");
		logger.warn("GET ALL CONSUMERS");
		return consumerService.getAllConsumers();
	}
	@GetMapping("/{consumerId}")
	public @ResponseBody Consumer getConsumer(@PathVariable BigInteger consumerId) {
		return consumerService.getConsumerDetails(consumerId);
	}
	@PutMapping("/{consumerId}")
	public String updateConsumer(@PathVariable BigInteger consumerId) {
		return "Email::"+consumerService.deleteConsumer(consumerId)+ "deleted successfully";
	}
	@DeleteMapping("/{consumerId}")
	public String deleteConsumer(@PathVariable BigInteger consumerId) {
		try {
			return "Email::"+consumerService.deleteConsumer(consumerId)+ " deleted successfully";
		} catch (Exception e) {
			return "No user exists with consumer Id::"+consumerId;
		}
	}
	

}
