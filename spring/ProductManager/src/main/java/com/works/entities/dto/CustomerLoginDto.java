package com.works.entities.dto;

import com.works.entities.Customer;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Customer}
 */
@Value
public class CustomerLoginDto implements Serializable {
    @Schema(
    description = "Login Email",
    name = "email",
    type = "string",
    example = "ali@mail.com")
    @NotNull
    @Email
    @NotEmpty
    String email;

    @Schema(
    description = "Login Password",
    name = "password",
    type = "string",
    example = "12345")
    @NotNull
    @Size(min = 5, max = 10)
    @NotEmpty
    String password;
}