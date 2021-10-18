package com.delivery.clientRegistration;

import java.util.Optional;

public class ClientResponse {

    private String name;
    private String email;
    private String phone;

    @Deprecated
    public ClientResponse(){
    }

    public ClientResponse(Client client){
        this.name = client.getName();
        this.email = client.getEmail();
        this.phone = client.getPhone();
    }

}
