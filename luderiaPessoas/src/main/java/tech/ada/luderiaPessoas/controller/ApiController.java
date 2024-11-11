package tech.ada.luderiaPessoas.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FeignClient()
public interface ApiController {
}
