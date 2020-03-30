package com.prankur.JPA3.manyToMany;

import com.prankur.JPA3.Address;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class AuthorManyToMany
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @Embedded
    private Address address;

    @ElementCollection
    private Set<String> subjects;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "authors_books", joinColumns = @JoinColumn(name = "author_id"), inverseJoinColumns = @JoinColumn(name = "book_id"))
    private Set<BookManyToMany> bookManyToManies;

    public AuthorManyToMany(String name, Address address, Set<String> subjects, Set<BookManyToMany> bookManyToManies) {
        this.name = name;
        this.address = address;
        this.subjects = subjects;
        this.bookManyToManies = bookManyToManies;
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

    public Set<BookManyToMany> getBookManyToManies() {
        return bookManyToManies;
    }

    public void setBookManyToManies(Set<BookManyToMany> bookManyToManies) {
        this.bookManyToManies = bookManyToManies;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "AuthorManyToMany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", subjects=" + subjects +
                ", bookManyToManies=" + bookManyToManies +
                '}';
    }

    public AuthorManyToMany() {
    }
}
