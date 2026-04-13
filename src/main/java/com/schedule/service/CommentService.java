package com.schedule.service;

import com.schedule.dtos.CreateCommentRequest;
import com.schedule.dtos.CreateCommentResponse;
import com.schedule.entity.Comment;
import com.schedule.entity.Schedule;
import com.schedule.repository.CommentRepository;
import com.schedule.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final ScheduleRepository scheduleRepository;

    @Transactional
    public CreateCommentResponse create(Long id, CreateCommentRequest request) {
        Schedule schedule = scheduleRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("없는 일정입니다."));

        if (schedule.getComments().size() >= 10) {
            throw new IllegalStateException("댓글은 최대 10개까지만 작성할 수 있습니다.");
        }

        Comment comment = new Comment(
                request.getContent(),
                request.getName(),
                request.getPassword(),
                schedule
        );

        Comment save = commentRepository.save(comment);

        return new CreateCommentResponse(
                save.getId(),
                save.getContent(),
                save.getName(),
                save.getCreatedAt(),
                save.getModifiedAt()
        );
    }
}
