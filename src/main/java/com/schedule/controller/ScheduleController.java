package com.schedule.controller;

import com.schedule.dtos.*;
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

    @PostMapping("/schedules")
    public ResponseEntity<CreateScheduleResponse> createSchedule(@RequestBody CreateScheduleRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(scheduleService.createSchedule(request));
    }

    @GetMapping("/schedules/{schedule_id}")
    public ResponseEntity<GetScheduleResponse> getOneSchedule(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(scheduleService.findOne(id));
    }

    @GetMapping("/schedules")
    public ResponseEntity<List<GetScheduleResponse>> getAllSchedule() {
        return ResponseEntity.status(HttpStatus.OK).body(scheduleService.findAll());
    }

    @PutMapping("/schedules/{id}")
    public ResponseEntity<UpdateScheduleResponse> updateSchedule(@PathVariable Long id, @RequestBody UpdateScheduleRequest request) {
        return ResponseEntity.status(HttpStatus.OK).body(scheduleService.updateSchedule(id, request));
    }
}
