package com.example.todolist.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data //getter, setter
@NoArgsConstructor //boş contructor
@AllArgsConstructor //dolu constructor
@Entity
@Table(name = "note")
public class Note {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator") // UUID (benzersiz bir kimlik) oluşturulmasını sağlar.
    @Column(name = "id")
    private String id;

    @Column(name = "baslik")
    private String title;

    @Column(name = "icerik")
    private String contents;



}
