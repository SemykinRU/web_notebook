package ru.semykin.web.ru.semykin.web.notebook.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class Note {

    private long id;

    private String name;

    private String text;

    private Timestamp date;

    private Topic topic;

}
