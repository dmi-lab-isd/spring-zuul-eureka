package org.labisd.rpc.feign;

import org.labisd.rpc.dto.SumResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("sum-server")
public interface SumServerClient {
	@GetMapping("/sum/{a}/{b}")
    SumResult getSumResult(@PathVariable int a, @PathVariable int b);
}
