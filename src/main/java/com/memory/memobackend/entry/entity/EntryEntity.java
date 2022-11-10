package com.memory.memobackend.entry.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class EntryEntity {

    int id;
    String title;
    String description;
    String imgPath;
}
