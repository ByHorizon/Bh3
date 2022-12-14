package com.jojoldu.book.springboot.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class HelloResponseDtoTest {

    @Test
    public void lom_test() throws Exception
    {
    //given (이렇게 주어지고)
    String name = "test";
    int amount = 1000;
    //when  (이렇게 하면)
    HelloResponseDto dto = new HelloResponseDto(name,amount);
    //then  (이렇게 된다)
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }

}