package com.f_lin.example.ons;

import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.SendResult;
import com.aliyun.openservices.ons.api.bean.ConsumerBean;
import com.aliyun.openservices.ons.api.bean.ProducerBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * @author F_lin
 * @since 2019/4/15
 **/
@Component
public class OnsTests {
    @Autowired
    private ProducerBean producerBean;
    @Autowired
    private ConsumerBean consumerBean;


    public void produceStart() {
        producerBean.setProperties(new Properties());
        producerBean.start();
    }

    public void publish() {
        SendResult send = producerBean.send(new Message());

    }

    public void listener(){
    }


}
