package yte.intern.spring_data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.PageRequest;
import yte.intern.spring_data.entities.Book;
import yte.intern.spring_data.entities.User;
import yte.intern.spring_data.repositories.BookRepository;
import yte.intern.spring_data.repositories.UserResository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDataApplication.class, args);


		BookRepository bookRepository = context.getBean(BookRepository.class);
		//Optional<Book> dddOptional = bookRepository.findByTitle("12");

		//System.out.println(dddOptional.get());

		//System.out.println(bookRepository.findByAgeGreaterThanEqual(15L));

		//System.out.println(bookRepository.findByPublishDateAfter(LocalDate.parse("2000-01-01"), PageRequest.of(1,5)));

		//System.out.println(bookRepository.findByTitleContains("asd"));

		//System.out.println(bookRepository.findByAuthorAndAgeGreaterThan("234",11L));

		//System.out.println(bookRepository.countByAuthor("asdsa"));

		//System.out.println(bookRepository.existsByAuthor("234"));

		List<Book> exampleBooks = new ArrayList<>();
		exampleBooks.add(new Book(null,"asdas","asdsa",14L, LocalDate.parse("2010-04-11")));
		exampleBooks.add(new Book(null,"12","234",11L, LocalDate.parse("2003-04-11")));
		exampleBooks.add(new Book(null,"asd1231as","asd242sa",16L, LocalDate.parse("2006-04-11")));
		bookRepository.saveAll(exampleBooks);

		//UserResository userResository = context.getBean(UserResository.class);

		//userResository.save(new User("asdas"));

		//System.out.println(userResository.findAll());

		//userResository.deleteById(1L);

		//System.out.println(userResository.findAll());

		//System.out.println(userResository.findByName("asdas"));
	}


}
