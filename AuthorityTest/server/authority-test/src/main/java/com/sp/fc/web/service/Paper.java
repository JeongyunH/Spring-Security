package com.sp.fc.web.service;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Paper {

    private Long paperId;
    private String title;
    private String tutorId;
    private List<String> studentIds;
    private State state;

    public static enum State {
        PREPARE, // 출제 중
        READY,  // 시험 시작
        END  // 시험 종료
    }

}


