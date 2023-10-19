package com.STC.StudyCode.Dto;

import com.STC.StudyCode.Entity.OverviewEntity;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OverviewDto {

    String memId;
    String content;

    public OverviewEntity toEntity() {
        return OverviewEntity.builder()
                .memId(memId)
                .content(content)
                .build();
    }
}