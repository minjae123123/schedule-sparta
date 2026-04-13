package com.schedule.controller;

import com.schedule.dtos.CreateCommentRequest;
import com.schedule.dtos.CreateCommentResponse;
import com.schedule.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/schedules/{id}/comments")
public class CommentController {

    private final CommentService commentService;

    @PostMapping
    public CreateCommentResponse createComment(@PathVariable Long id,@RequestBody CreateCommentRequest request) {
        return commentService.create(id, request);
    }
}
