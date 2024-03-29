package com.koc.themeServer.course.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.koc.themeServer.course.dto.CourseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseUpdateRequest {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("courseName")
    private String courseName;
    @JsonProperty("emoji")
    private String emoji;

    public CourseDto requestToDto() {
        return CourseDto.builder()
                .id(this.id)
                .courseName(this.courseName)
                .emoji(this.emoji)
                .build();
    }
}
