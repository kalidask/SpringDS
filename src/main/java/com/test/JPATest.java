package com.test;

import org.apache.camel.Exchange;

public class JPATest {

public void readContent(Exchange test) {
               
                Object obj = test.getIn().getBody();
                DarpanTest d = (DarpanTest)obj;
                System.out.println("########"+d.getTestid()+"#######");
                System.out.println("########"+d.getTestname()+"#########");
        }
} 