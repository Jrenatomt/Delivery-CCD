package com.delivery.clientRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping(value = "/clients")
public class ClientRegistrationController {

    @Autowired
    private ClientRepository clientRepository;

    @PostMapping
    public ResponseEntity<?> clientInsert(@RequestBody @Valid  ClientRequest request){
        Client newClient = request.toModel();
        clientRepository.save(newClient);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(newClient.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClientResponse> getClient(@PathVariable Long id) {
        Optional<Client> client = clientRepository.findById(id);
        if (!client.isPresent()){
            return ResponseEntity.badRequest().build();
        }
       return ResponseEntity.ok().body(new ClientResponse(client.get()));
        //return client.map(value -> ResponseEntity.ok().body(new ClientResponse(value))).orElseGet(() -> ResponseEntity.badRequest().build());
    }
}
