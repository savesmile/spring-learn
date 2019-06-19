package com.f_lin.example.ons;

import com.aliyun.openservices.ons.api.bean.ConsumerBean;
import com.aliyun.openservices.ons.api.bean.ProducerBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author F_lin
 * @since 2019/4/15
 **/
@Configuration
public class
OnsConfigs {
    @Bean
    public ProducerBean createProducerBean(){
        return new ProducerBean();
    }

    @Bean
    public ConsumerBean createConsumerBean(){
        return new ConsumerBean();
    }
}
