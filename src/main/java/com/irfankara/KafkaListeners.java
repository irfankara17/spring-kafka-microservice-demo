package com.irfankara;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "irfan",groupId = "groupId")
     void listeners(String data){

        System.out.println("Listener Received" + data +"🎉");


    }


}

