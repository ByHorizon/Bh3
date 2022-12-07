package com.jojoldu.book.springboot.web;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IndexControllerTest {
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void loading_main_page(){
    //given (이렇게 주어지고)
    String body = this.testRestTemplate.getForObject("/", String.class);
    //when  (이렇게 하면)
        Assertions.assertThat(body).contains("스프링 부트로 시작하는 웹서비스");
    //then  (이렇게 된다)

    }

}