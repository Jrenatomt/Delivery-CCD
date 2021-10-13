package com.delivery.deliveryRegistration;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/deliveries")
public class DeliveryRegistrationController {

    @PostMapping
    public ResponseEntity<?> deliveryRegistration(@RequestBody DeliveryRequest request){



        return null;
    }
}
