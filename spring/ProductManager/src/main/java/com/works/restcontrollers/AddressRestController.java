package com.works.restcontrollers;

import com.works.entities.Address;
import com.works.services.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("address")
public class AddressRestController {

    private final AddressService addressService;

    @PostMapping("save")
    public Address save(@RequestBody Address address) {
        return addressService.save(address);
    }

    @GetMapping("list")
    public List<Address> list() {
        return addressService.findAll();
    }


}
