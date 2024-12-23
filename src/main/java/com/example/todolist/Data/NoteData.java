package com.example.todolist.Data;

import com.example.todolist.Entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteData extends JpaRepository<Note, String> { //JpaRepository,
    // otomatik olarak veritabanı işlemlerini (ekleme, silme, güncelleme, bulma) gerçekleştirebilen hazır metotlar sunar.
}
