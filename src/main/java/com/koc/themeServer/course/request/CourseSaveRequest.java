package com.koc.themeServer.course.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.koc.themeServer.course.dto.CourseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseSaveRequest {
    @JsonProperty("courseName")
    private String courseName;
    @JsonProperty("emoji")
    private String emoji;

    public CourseDto requestToDto() {
        return CourseDto.builder()
                .courseName(this.courseName)
                .emoji(this.emoji)
                .build();
    }
}
