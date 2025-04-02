package com.modul.demo.documentation;

import com.modul.demo.documentation.internal.Documentation;
import com.modul.demo.todo.TodoDTO;
import com.modul.demo.todo.TodoService;
import org.springframework.stereotype.Service;

@Service
public class DocumentationService {

    private final DocumentationRepository documentationRepository;
    private final TodoService todoService;

    public DocumentationService(DocumentationRepository documentationRepository, TodoService todoService) {
        this.documentationRepository = documentationRepository;
        this.todoService = todoService;
    }

    public void create(Documentation documentation) {
        todoService.create(new TodoDTO());
    }
}
