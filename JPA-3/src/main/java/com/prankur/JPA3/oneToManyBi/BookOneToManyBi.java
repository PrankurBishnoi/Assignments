package com.prankur.JPA3.oneToManyBi;

import javax.persistence.*;

@Entity
public class BookOneToManyBi
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String bookName;

    private String subject;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private AuthorOneToManyBi authorOneToManyBi;

    public BookOneToManyBi(String bookName, String subject) {
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

    public AuthorOneToManyBi getAuthorOneToManyBi() {
        return authorOneToManyBi;
    }

    public void setAuthorOneToManyBi(AuthorOneToManyBi authorOneToManyBi) {
        this.authorOneToManyBi = authorOneToManyBi;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "BookOneToManyBi{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    public BookOneToManyBi() {
    }
}
