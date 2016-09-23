/**
Feb 1, 2013
SpringJmsExplained
Junaid Pasha
Common Services 
American Airlines
**/
package com.junaid.training.spring.consumer;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.bov.dto.Stock;

public class StockReader {

	
	@Autowired
    private JmsTemplate jmsTemplate;
	
	public Stock Receive() throws JMSException {
		  Message message = jmsTemplate.receive();
		  Stock order = (Stock)((ObjectMessage) message).getObject();
		  return order;
		    }
		
		
		
		
		
		
	}
	
	


