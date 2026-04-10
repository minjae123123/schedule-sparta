package com.schedule.service;

import com.schedule.dtos.CreateScheduleRequest;
import com.schedule.dtos.CreateScheduleResponse;
import com.schedule.entity.Schedule;
import com.schedule.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    @Transactional
    public CreateScheduleResponse createSchedule(CreateScheduleRequest request) {
        Schedule schedule = new Schedule(
                request.getTitle(),
                request.getDetail(),
                request.getName(),
                request.getPassword()
        );

        Schedule savedSchedule = scheduleRepository.save(schedule);

        return new CreateScheduleResponse(
                savedSchedule.getTitle(),
                savedSchedule.getDetail(),
                savedSchedule.getName()
        );
    }

}
