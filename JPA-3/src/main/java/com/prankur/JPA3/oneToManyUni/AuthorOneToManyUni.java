package com.prankur.JPA3.oneToManyUni;

import com.prankur.JPA3.Address;
import com.prankur.JPA3.oneToManyBi.BookOneToManyBi;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class AuthorOneToManyUni
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @Embedded
    private Address address;

    @ElementCollection
    private Set<String> subjects;

    @OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<BookOneToManyUni> bookOneToManyUnis;

    public AuthorOneToManyUni(String name, Address address, Set<String> subjects, Set<BookOneToManyUni> bookOneToManyUnis) {
        this.name = name;
        this.address = address;
        this.subjects = subjects;
        this.bookOneToManyUnis = bookOneToManyUnis;
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

    public Set<BookOneToManyUni> getBookOneToManyUni() {
        return bookOneToManyUnis;
    }

    public void setBookOneToManyUni(Set<BookOneToManyUni> bookOneToManyUni) {
        this.bookOneToManyUnis = bookOneToManyUni;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    public Set<BookOneToManyUni> getBookOneToManyUnis() {
        return bookOneToManyUnis;
    }

    public void setBookOneToManyUnis(Set<BookOneToManyUni> bookOneToManyUnis) {
        this.bookOneToManyUnis = bookOneToManyUnis;
    }

    @Override
    public String toString() {
        return "AuthorOneToManyUni{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", subjects=" + subjects +
                ", bookOneToManyUnis=" + bookOneToManyUnis +
                '}';
    }

    public AuthorOneToManyUni() {
    }
}
