package com.example.todolist.RestApi;

import com.example.todolist.Business.NoteBusiness;
import com.example.todolist.Entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Bu sınıf, kullanıcıların notları ekleyebilmesini, güncelleyebilmesini, silebilmesini ve listeleyebilmesini sağlayan HTTP isteklerini işler.
@RequestMapping("/api/note")
@CrossOrigin
public class NoteApi {
    private final NoteBusiness noteService;

    @Autowired
    public NoteApi(NoteBusiness noteService) {
        this.noteService = noteService;
    }

    @GetMapping("/list")
    public List<Note> get() {
        return this.noteService.getAll();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Note note){
        this.noteService.delete(note);
    }

    @PostMapping("/add")
    public void add(@RequestBody Note note){
        this.noteService.add(note);
    }

    @PostMapping("/update")
    public void update(@RequestBody Note note){
        this.noteService.update(note);
    }

}
