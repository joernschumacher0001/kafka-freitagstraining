package com.cgi.training.sensors;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
@RequiredArgsConstructor
public class SensorController {
    private final SensorDataService service;

    @PutMapping(path="values", params = {"id", "value"})
    void valueMeasured(@RequestParam("id") String id, @RequestParam("value") double value) {
        service.dataReceived(id, value);
    }
}
