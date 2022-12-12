package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.config.auth.SecurityConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = {HelloController.class})
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void return_hello() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }

    @Test
    public void return_helloDto() throws Exception {
    //given (이렇게 주어지고)
    String name = "test";
    int amount = 1000;
    //when  (이렇게 하면)
    mvc.perform(
            get("/hello/dto")
                    .param("name",name)
                    .param("amount",String.
                            valueOf(amount)))
            .andExpect(status().isOk())
            .andExpect(result -> {jsonPath("$.name", is(name));}) //Json 응답 값을필드명으로 검증($로 필드명 명시)
            .andExpect(result -> {jsonPath("$.amount",is(amount));});
    //then  (이렇게 된다)

    }

}