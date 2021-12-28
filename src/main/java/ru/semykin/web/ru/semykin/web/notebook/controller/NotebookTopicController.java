package ru.semykin.web.ru.semykin.web.notebook.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notebook/topic")
public class NotebookTopicController {

    @GetMapping()
    public ResponseEntity<String> getAllTopic() {
        return null;
    }
}
