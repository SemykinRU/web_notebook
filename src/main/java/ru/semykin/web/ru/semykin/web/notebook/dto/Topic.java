package ru.semykin.web.ru.semykin.web.notebook.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Topic {

    private List<Note> notes;

}
