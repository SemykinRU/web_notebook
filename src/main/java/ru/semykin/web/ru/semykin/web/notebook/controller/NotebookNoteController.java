package ru.semykin.web.ru.semykin.web.notebook.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notebook/topic/{topic}")
public class NotebookNoteController {

    @GetMapping(value = "/")
    public ResponseEntity<String> getAllNote(@PathVariable String topic) {
        return null;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<String> getOneNoteFromID(@PathVariable String topic, @PathVariable String id) {
        return null;
    }
}
