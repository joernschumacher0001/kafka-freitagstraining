package com.cgi.training.rooms;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
@RequiredArgsConstructor
public class RoomController {
    private final RoomTemperatureService service;

    @GetMapping(value = "/temperature", params = "roomId")
    double getRoomTemperature(@RequestParam("roomId") String roomId) {
        return service.getRoomTemperature(roomId);
    }
}
