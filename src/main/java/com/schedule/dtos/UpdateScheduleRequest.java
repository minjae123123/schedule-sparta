package com.schedule.dtos;

import lombok.Getter;

@Getter
public class UpdateScheduleRequest {
    private String title;
    private String detail;
    private String name;
    private String password;
}
