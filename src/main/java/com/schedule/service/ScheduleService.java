package com.schedule.service;

import com.schedule.dtos.CreateScheduleRequest;
import com.schedule.dtos.CreateScheduleResponse;
import com.schedule.dtos.GetScheduleResponse;
import com.schedule.entity.Schedule;
import com.schedule.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

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
                savedSchedule.getId(),
                savedSchedule.getTitle(),
                savedSchedule.getDetail(),
                savedSchedule.getName()
        );
    }

    @Transactional(readOnly = true)
    public GetScheduleResponse findOne(Long id) {
        Schedule schedule = scheduleRepository.findById(id).orElseThrow(
                () ->new IllegalStateException("없는 일정입니다.")
        );
        return new GetScheduleResponse(
                schedule.getId(),
                schedule.getTitle(),
                schedule.getDetail(),
                schedule.getName()
        );
    }

    @Transactional(readOnly = true)
    public List<GetScheduleResponse> findAll() {
        List<Schedule> schedules = scheduleRepository.findAll();

        List<GetScheduleResponse> dtos = new ArrayList<>();

        for (Schedule schedule : schedules) {
            dtos.add(new GetScheduleResponse(
                    schedule.getId(),
                    schedule.getTitle(),
                    schedule.getDetail(),
                    schedule.getName()
                    )
            );
        }
        return dtos;
    }

}
