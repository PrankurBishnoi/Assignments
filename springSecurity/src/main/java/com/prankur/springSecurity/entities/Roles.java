package com.prankur.springSecurity.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public enum Roles
{
    ADMIN(new GrantAuthorityImpl("ROLE_ADMIN")),USER(new GrantAuthorityImpl("ROLE_USER"));

    GrantAuthorityImpl role;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    Roles(GrantAuthorityImpl roleUser)
    {
        this.role = roleUser;
    }

    public GrantAuthorityImpl getRole()
    {
        return role;
    }
}
