package com.junaid.training.spring;

import javax.jms.JMSException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bov.dto.Stock;


public class SpringJmsConsumerExplained {

	public static void main(String[] args) throws JMSException {
		
		ApplicationContext ctx =
		new ClassPathXmlApplicationContext("applicationContext-jms-consumer.xml");
		
		com.junaid.training.spring.consumer.StockReader stockreciever = (com.junaid.training.spring.consumer.StockReader) ctx.getBean("stockreciever");
		
		//StockSender stockSender = (StockSender) ctx.getBean("stockSender");
		Stock stock = (Stock)stockreciever.Receive();
		
		System.out.println("Recived Stock name" + stock.getStockName());
		System.out.println("Recieved Stock description " + stock.getStockDescription());
		System.out.println("Recieved Stock price " + stock.getEndingPrice());
		
		
		
		//orderService.sendStockInfo(1, "AAPL", "Apple Inc", 19198700, 459.11, 453.62);
		
		
		
		}
	
}
