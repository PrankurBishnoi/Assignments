package com.prankur.JPA3.oneToOne;

import com.prankur.JPA3.Address;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AuthorOneToOne
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @Embedded
    private Address address;

    @ElementCollection
    private Set<String> subjects;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id")
    private BookOneToOne bookOneToOne;

    public AuthorOneToOne(String name, Address address, Set<String> subjects) {
        this.name = name;
        this.address = address;
        this.subjects = subjects;
    }

    public AuthorOneToOne(String name, Address address) {
        this.name = name;
        this.address = address;
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

    public BookOneToOne getBookOneToOne() {
        return bookOneToOne;
    }

    public void setBookOneToOne(BookOneToOne bookOneToOne) {
        this.bookOneToOne = bookOneToOne;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "AuthorOneToOne{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", subjects=" + subjects +
                ", bookOneToOne=" + bookOneToOne +
                '}';
    }

    public AuthorOneToOne() {
    }
}
