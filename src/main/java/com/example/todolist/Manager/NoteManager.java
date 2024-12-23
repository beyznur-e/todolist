package com.example.todolist.Manager;

import com.example.todolist.Business.NoteBusiness;
import com.example.todolist.Data.NoteData;
import com.example.todolist.Entity.Note;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NoteManager implements NoteBusiness {
    private NoteData noteData;

    @Autowired
    public NoteManager(NoteData noteData) {
        this.noteData = noteData;
    }
    @Override
    @Transactional //Transaction işlemi bir veya birden fazla sorguların(SQL) aynı süreçte işlem görmesidir.
    // Bu sayede istenmeyen bir durum oluştuğunda bütün bu süreci geri alabiliriz(rollback), yada hepsi aynı anda onaylayabiliriz
    public void add(Note note) {
        this.noteData.save(note);
    }

    @Override
    @Transactional
    public void update(Note note) {
        this.noteData.save(note);
    }

    @Override
    @Transactional
    public void delete(Note note) {
        this.noteData.delete(note);
    }

    @Override
    @Transactional
    public List<Note> getAll() {
        return this.noteData.findAll();
    }
}
