package com.han.todo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Data
public class ToDo {
    @NotNull
    private String id;
    @NotNull
    @NotBlank
    private String description;
    //@JsonFormat(pattern = "yyyy/MM/dd")
    private LocalDateTime created;
    //@JsonFormat(pattern = "yyyy/MM/dd")
    private LocalDateTime modified;
    private boolean completed;
    public ToDo(){
        LocalDateTime date = LocalDateTime.now();
        this.id = UUID.randomUUID().toString();
        this.created = date;
        this.modified = date;
    }
    public ToDo(String description){
        this();
        this.description = description;
    }
}