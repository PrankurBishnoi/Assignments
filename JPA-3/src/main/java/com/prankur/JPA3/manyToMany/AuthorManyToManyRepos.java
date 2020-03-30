package com.prankur.JPA3.manyToMany;

import org.springframework.data.repository.CrudRepository;

public interface AuthorManyToManyRepos extends CrudRepository<AuthorManyToMany,Integer>
{


}
