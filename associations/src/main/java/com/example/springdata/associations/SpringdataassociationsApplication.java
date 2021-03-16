package com.example.springdata.associations;

import com.example.springdata.associations.bidirectional.BidirectionalDaoService;
import com.example.springdata.associations.manytomany.ManyToManyDaoService;
import com.example.springdata.associations.manytomany.ManyToManyRepository;
import com.example.springdata.associations.onetone.OneToOneDaoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdataassociationsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringdataassociationsApplication.class, args);
		AuthorDaoService authorDaoService = context.getBean(AuthorDaoService.class);
		//authorDaoService.addAuthorData();

		BidirectionalDaoService bidirectionalDaoService = context.getBean(BidirectionalDaoService.class);
		//bidirectionalDaoService.addAuthorBook();

		OneToOneDaoService oneToOneDaoService = context.getBean(OneToOneDaoService.class);
		//oneToOneDaoService.addOneToOneAuthorBook();

		ManyToManyDaoService manyToManyDaoService = context.getBean(ManyToManyDaoService.class);
		manyToManyDaoService.addManyToManyAuthorBook();
	}

}
