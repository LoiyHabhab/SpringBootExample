package com.conygre.spring.boot.repo;


import com.conygre.spring.boot.repos.CompactDiscRepository;
import com.conygre.spring.boot.rest.CompactDiscController;
import com.conygre.spring.boot.services.CompactDiscService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@ContextConfiguration(classes=com.conygre.spring.boot.AppConfig.class)
@TestPropertySource(locations = "classpath:application-test.properties")
public class TestCDRepository {
    @Autowired
    private TestEntityManager manager;


    @Autowired // this is a mock which is injected because of the @DataJpaTest
    private CompactDiscRepository repo;

    @Autowired
    CompactDiscService discService;


    @Autowired
    CompactDiscController controller;




}
