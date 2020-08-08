/**
 * Author : DKSilverX
 * Date : 12/04/2020
 */
package io.methea.metheawebservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class WebApiController {
    @GetMapping(value = {"/api/v1/check"})
    public ResponseEntity<Object> home() {
        Map<String, Object> map = new HashMap<>();
        map.put("status", 200);
        map.put("message", "your application up!!");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
