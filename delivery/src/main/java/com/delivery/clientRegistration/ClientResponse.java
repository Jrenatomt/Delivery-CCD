package com.delivery.clientRegistration;

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

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
