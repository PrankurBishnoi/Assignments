package com.prankur.JPA3.oneToManyBi;

import com.prankur.JPA3.Address;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class AuthorOneToManyBi
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @Embedded
    private Address address;

    @ElementCollection
    private Set<String> subjects;

    @OneToMany(mappedBy = "authorOneToManyBi", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<BookOneToManyBi> bookOneToManyBis;

    public AuthorOneToManyBi(String name, Address address, Set<String> subjects, Set<BookOneToManyBi> bookOneToManyBis) {
        this.name = name;
        this.address = address;
        this.subjects = subjects;
        this.bookOneToManyBis = bookOneToManyBis;
    }

    public void addBook(BookOneToManyBi bookOneToManyBi)
    {
        if (bookOneToManyBi != null)
        {
            if(bookOneToManyBis == null)
                bookOneToManyBis = new HashSet<>();
            bookOneToManyBi.setAuthorOneToManyBi(this);
            bookOneToManyBis.add(bookOneToManyBi);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<BookOneToManyBi> getBookOneToManyBis() {
        return bookOneToManyBis;
    }

    public void setBookOneToManyBis(Set<BookOneToManyBi> bookOneToManyBis) {
        this.bookOneToManyBis = bookOneToManyBis;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "AuthorOneToManyBi{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", subjects=" + subjects +
                ", bookOneToManyBis=" + bookOneToManyBis +
                '}';
    }

    public AuthorOneToManyBi() {
    }
}
