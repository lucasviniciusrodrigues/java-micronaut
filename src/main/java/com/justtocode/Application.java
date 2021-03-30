package com.justtocode;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "micronaut-crud",
                version = "0.0",
                description = "Just to code",
                contact = @Contact(name = "Lucas", email = "lucas.vinicius.rodrigues@hotmail.com")
        )
)
public class Application {
    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
