package com.works.entities.dto;

import com.works.entities.Customer;
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
    @NotNull
    @Email
    @NotEmpty
    String email;

    @NotNull
    @Size(min = 5, max = 10)
    @NotEmpty
    String password;
}