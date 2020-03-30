package com.prankur.JPA3;

import com.prankur.JPA3.manyToMany.AuthorManyToMany;
import com.prankur.JPA3.manyToMany.AuthorManyToManyRepos;
import com.prankur.JPA3.manyToMany.BookManyToMany;
import com.prankur.JPA3.oneToManyBi.AuthorOneToManyBi;
import com.prankur.JPA3.oneToManyBi.AuthorOneToManyBiRepos;
import com.prankur.JPA3.oneToManyBi.BookOneToManyBi;
import com.prankur.JPA3.oneToManyUni.AuthorOneToManyUni;
import com.prankur.JPA3.oneToManyUni.AuthorOneToManyUniRepos;
import com.prankur.JPA3.oneToManyUni.BookOneToManyUni;
import com.prankur.JPA3.oneToOne.AuthorOneToOne;
import com.prankur.JPA3.oneToOne.AuthorOneToOneRepos;
import com.prankur.JPA3.oneToOne.BookOneToOne;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.HashSet;

@SpringBootApplication
public class Jpa3Application {

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = SpringApplication.run(Jpa3Application.class, args);
//		AuthorOneToManyBiRepos authorOneToManyBiRepos = applicationContext.getBean(AuthorOneToManyBiRepos.class);
//		AuthorOneToOneRepos authorOneToManyUniRepos = applicationContext.getBean(AuthorOneToOneRepos.class);
//		AuthorManyToManyRepos authorManyToManyRepos = applicationContext.getBean(AuthorManyToManyRepos.class);
		AuthorOneToOneRepos authorOneToOneRepos = applicationContext.getBean(AuthorOneToOneRepos.class);


//One TO Many Bidirectional
//		HashSet<String> subjects = new HashSet<String>();
//		subjects.add(Subject.BIOLOGY.toString());
//		subjects.add(Subject.ENGLISH.toString());
//		subjects.add(Subject.MATH.toString());
//		AuthorOneToManyBi authorOneToManyBi = new AuthorOneToManyBi();
//		authorOneToManyBi.setName("ABC");
//		authorOneToManyBi.setAddress(new Address("3", "Ghaziabad", "Uttar Pradesh"), subjects);
//
//		BookOneToManyBi book1 = new BookOneToManyBi("DEF",Subject.CHEMISTRY.toString());
//		BookOneToManyBi book2 = new BookOneToManyBi("GHI",Subject.CHEMISTRY.toString());
//
//		authorOneToManyBi.addBook(book1);
//		authorOneToManyBi.addBook(book2);
//
//		authorOneToManyBiRepos.save(authorOneToManyBi);

//One To Many Unidirectional
//		HashSet<String> subjects = new HashSet<String>();
//		subjects.add(Subject.BIOLOGY.toString());
//		subjects.add(Subject.ENGLISH.toString());
//		subjects.add(Subject.MATH.toString());
//		AuthorOneToOne authorOneToManyUni = new AuthorOneToOne();
//		authorOneToManyUni.setName("ABC");
//		authorOneToManyUni.setAddress(new Address("3", "Ghaziabad", "Uttar Pradesh"), subjects);
//
//		BookOneToOne bookOneToManyUni1 = new BookOneToOne("DEF",Subject.CHEMISTRY.toString());
//		BookOneToOne bookOneToManyUni2 = new BookOneToOne("GHI",Subject.CHEMISTRY.toString());
//		HashSet<BookOneToOne> bookOneToManyUnis = new HashSet<>();
//
//		bookOneToManyUnis.add(bookOneToManyUni1);
//		bookOneToManyUnis.add(bookOneToManyUni2);
//
//		authorOneToManyUni.setBookOneToManyUni(bookOneToManyUnis);
//
//		authorOneToManyUniRepos.save(authorOneToManyUni);



//Many To Many
//		HashSet<String> subjects = new HashSet<String>();
//		subjects.add(Subject.BIOLOGY.toString());
//		subjects.add(Subject.ENGLISH.toString());
//		subjects.add(Subject.MATH.toString());
//		AuthorManyToMany authorManyToMany = new AuthorManyToMany();
//		authorManyToMany.setName("ABC");
//		authorManyToMany.setAddress(new Address("3", "Ghaziabad", "Uttar Pradesh"), subjects);
//
//		BookManyToMany bookManyToMany1 = new BookManyToMany("DEF",Subject.CHEMISTRY.toString());
//		BookManyToMany bookManyToMany2 = new BookManyToMany("GHI",Subject.CHEMISTRY.toString());
//		HashSet<BookManyToMany> bookManyToManies = new HashSet<>();
//
//		bookManyToManies.add(bookManyToMany1);
//		bookManyToManies.add(bookManyToMany2);
//
//		authorManyToMany.setBookManyToManies(bookManyToManies);
//
//		authorManyToManyRepos.save(authorManyToMany);




// One To One
//		HashSet<String> subjects = new HashSet<String>();
//		subjects.add(Subject.BIOLOGY.toString());
//		subjects.add(Subject.ENGLISH.toString());
//		subjects.add(Subject.MATH.toString());
//		AuthorOneToOne authorOneToOne = new AuthorOneToOne("ABC", new Address("3", "Ghaziabad", "Uttar Pradesh"), subjects);
//
//		BookOneToOne bookOneToOne = new BookOneToOne("DEF",Subject.CHEMISTRY.toString());
//		bookOneToOne.setAuthorOneToOne(authorOneToOne);
//		authorOneToOne.setBookOneToOne(bookOneToOne);
//		authorOneToOneRepos.save(authorOneToOne);






	}

}
