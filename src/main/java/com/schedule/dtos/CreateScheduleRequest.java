package com.schedule.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class CreateScheduleRequest {
    @NotBlank(message = "일정 제목은 필수입니다.")
    @Size(max = 30, message = "제목은 30자 이하여야합니다.")
    private String title;
    @NotBlank(message = "일정 내용은 필수입니다.")
    @Size(max = 200, message = "제목은 200자 이하여야합니다.")
    private String detail;
    @NotBlank(message = "작성자명은 필수입니다.")
    private String name;
    @NotBlank(message = "비밀번호는 필수입니다.")
    private String password;
}
