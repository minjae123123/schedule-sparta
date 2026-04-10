package com.schedule.controller;

import com.schedule.dtos.CreateScheduleRequest;
import com.schedule.dtos.CreateScheduleResponse;
import com.schedule.dtos.GetScheduleResponse;
import com.schedule.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping("/schedule")
    public ResponseEntity<CreateScheduleResponse> createSchedule(@RequestBody CreateScheduleRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(scheduleService.createSchedule(request));
    }

    @GetMapping("/schedule/{schedule_id}")
    public ResponseEntity<GetScheduleResponse> getOneSchedule(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(scheduleService.findOne(id));
    }

    @GetMapping("/schedule")
    public ResponseEntity<List<GetScheduleResponse>> getAllSchedule() {
        return ResponseEntity.status(HttpStatus.OK).body(scheduleService.findAll());
    }
}
