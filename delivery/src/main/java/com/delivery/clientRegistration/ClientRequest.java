package com.delivery.clientRegistration;

import javax.validation.constraints.NotBlank;

public class ClientRequest {

    @NotBlank(message = "o campo nome é obrigatorio")
    private String name;
    @NotBlank(message = "o campo e-mail é obrigatorio")
    private String email;
    @NotBlank(message = "o campo telefone é obrigatorio")
    private String phone;

    @Deprecated
    public ClientRequest() {
    }

    public ClientRequest(@NotBlank String name, @NotBlank String email, @NotBlank String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
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

    public Client toModel() {
        return new Client(name,email,phone);
    }
}
