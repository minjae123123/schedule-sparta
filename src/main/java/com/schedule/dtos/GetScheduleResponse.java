package com.schedule.dtos;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class GetScheduleResponse {

    private final Long id;
    private final String title;
    private final String detail;
    private final String name;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;
    private final List<GetCommentResponse> comments;

    //전체 조회 용
    public GetScheduleResponse(Long id, String title, String detail, String name, LocalDateTime createdAt, LocalDateTime modifiedAt, List<GetCommentResponse> comments) {
        this.id = id;
        this.title = title;
        this.detail = detail;
        this.name = name;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.comments = comments;
    }

    //일정 단 건 조회 용
    public GetScheduleResponse(Long id, String title, String detail, String name, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.title = title;
        this.detail = detail;
        this.name = name;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.comments = null;
    }
}
