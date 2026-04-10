package com.schedule.controller;

import com.schedule.dtos.CreateScheduleRequest;
import com.schedule.dtos.CreateScheduleResponse;
import com.schedule.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping("schedule")
    public ResponseEntity<CreateScheduleResponse> createSchedule(@RequestParam CreateScheduleRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(scheduleService.createSchedule(request));
    }



}
