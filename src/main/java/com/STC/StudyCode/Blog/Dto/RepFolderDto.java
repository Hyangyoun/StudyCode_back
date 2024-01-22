package com.STC.StudyCode.Blog.Dto;

import com.STC.StudyCode.Entity.RepFolderEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RepFolderDto {
    private String folderName;
    private String memId;

    public RepFolderEntity toEntity() {
        return RepFolderEntity.builder()
                .folderName(folderName)
                .memId(memId)
                .build();
    }
}
