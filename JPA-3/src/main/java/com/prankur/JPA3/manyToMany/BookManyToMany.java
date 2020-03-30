package com.prankur.JPA3.manyToMany;

import javax.persistence.*;
import java.util.Set;

@Entity
public class BookManyToMany
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String bookName;

    private String subject;

    @ManyToMany(mappedBy = "bookManyToManies")
    private Set<AuthorManyToMany> authorManyToMany;

    public BookManyToMany(String bookName, String subject) {
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

    public Set<AuthorManyToMany> getAuthorManyToMany() {
        return authorManyToMany;
    }

    public void setAuthorManyToMany(Set<AuthorManyToMany> authorManyToMany) {
        this.authorManyToMany = authorManyToMany;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "BookManyToMany{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    public BookManyToMany() {
    }
}
