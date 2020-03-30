package com.prankur.JPA3.oneToOne;

import javax.persistence.*;

@Entity
public class BookOneToOne
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String bookName;

    private String subject;

    @OneToOne(mappedBy = "bookOneToOne")
    private AuthorOneToOne authorOneToOne;

    public BookOneToOne(String bookName, String subject) {
        this.bookName = bookName;
        this.subject = subject;
    }

    public BookOneToOne(String bookName) {
        this.bookName = bookName;
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

    public AuthorOneToOne getAuthorOneToOne() {
        return authorOneToOne;
    }

    public void setAuthorOneToOne(AuthorOneToOne authorOneToOne) {
        this.authorOneToOne = authorOneToOne;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "BookOneToOne{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    public BookOneToOne() {
    }
}
