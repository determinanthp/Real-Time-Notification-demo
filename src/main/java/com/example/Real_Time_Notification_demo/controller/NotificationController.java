package com.example.Real_Time_Notification_demo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {
    //api/sendMessage->prefix before ur endpoint url
    @MessageMapping("sendMessage")
    @SendTo("/topic/notifications")
    public String sendMessage(String message){
        System.out.println("message" + message);
        return message;
    }
}
