package com.example.todolist.Business;

import com.example.todolist.Entity.Note;

import java.util.List;

public interface NoteBusiness {
    void add(Note note);
    void update(Note note);
    void delete(Note note);
    List<Note> getAll();
}
