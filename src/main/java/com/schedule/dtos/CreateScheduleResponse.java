package com.schedule.dtos;

import lombok.Getter;

@Getter
public class CreateScheduleResponse {

    private final Long id;
    private final String title;
    private final String detail;
    private final String name;

    public CreateScheduleResponse(Long id,String title, String detail, String name) {
        this.id = id;
        this.title = title;
        this.detail = detail;
        this.name = name;
    }
}
