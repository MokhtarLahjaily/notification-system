package ma.lahjaily.controller;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {

    //server applocation

    /// app/sendMessage
    @MessageMapping("/sendMessage")
    @SendTo("/topic/notifications")
    public String sendMessage(String message) {
        // Logic to send a message to the WebSocket client
        // This is a placeholder for now and can be expanded as needed.
        System.out.println("message: " + message);
        return message;
    }
}
