package com.uco.mundoorigami.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

    @Configuration
    @ConfigurationProperties(prefix = "loan.procesar")
    public class LoanQueueConfig {

        private String exchangeName;
        private String routingKeyName;
        private String queueName;

        public String getExchangeName ( ) {
            return exchangeName;
        }

        public String getRoutingKeyName ( ) {
            return routingKeyName;
        }

        public void setRoutingKeyName ( String routingKeyName ) {
            this.routingKeyName = routingKeyName;
        }

        public String getQueueName ( ) {
            return queueName;
        }

        public void setExchangeName ( String exchangeName ) {
            this.exchangeName = exchangeName;
        }


        public void setQueueName ( String queueName ) {
            this.queueName = queueName;
        }
    }

