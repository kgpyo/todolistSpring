package com.example.todoslitApi.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Todo {
    private Long id;
    @NonNull
    private String content;
    private Date created;
    private boolean finish;
}