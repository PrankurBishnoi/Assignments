package com.prankur.JPA3.oneToManyUni;

import javax.persistence.*;

@Entity
public class BookOneToManyUni
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String bookName;

    private String subject;

    public BookOneToManyUni(String bookName, String subject) {
        this.bookName = bookName;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "BookOneToManyUni{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    public BookOneToManyUni() {
    }
}
