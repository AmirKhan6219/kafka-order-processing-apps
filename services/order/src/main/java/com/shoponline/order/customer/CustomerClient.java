package com.shoponline.order.customer;


import com.shoponline.order.dto.CustomerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(
        name = "customer-service",
        url = "${application.config.customer-url}"
)
public interface CustomerClient {
    @GetMapping("/{customer-id}")
    Optional<CustomerDto> findCustomerById(@PathVariable("customer-id") Long customerId);
}
