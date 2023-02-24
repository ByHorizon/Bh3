/*
package com.jojoldu.book.springboot.web;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.mock.env.MockEnvironment;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class ProfileControllerTest {

    @Test
    public void real_profile이_조회된다() {
    //given (이렇게 주어지고)
    String expectedProfile = "real1";
        MockEnvironment env = new MockEnvironment();
        env.addActiveProfile(expectedProfile);
        env.addActiveProfile("oauth");
        env.addActiveProfile("real-db");

        ProfileController controller = new ProfileController(env);

    //when  (이렇게 하면)
        String profile = controller.profile();
    //then  (이렇게 된다)
        assertThat(profile).isEqualTo(expectedProfile);
    }

    @Test
    public void real_profile이_없으면_첫_번째가_조회된다 () {
        //given (이렇게 주어지고)
        String expectedProfile = "oauth";
        MockEnvironment env = new MockEnvironment();
        env.addActiveProfile(expectedProfile);
        env.addActiveProfile("real-db");

        ProfileController controller = new ProfileController(env);

        //when  (이렇게 하면)
        String profile = controller.profile();
        //then  (이렇게 된다)
        assertThat(profile).isEqualTo(expectedProfile);
    }

    @Test
    public void active_profile이_없으면_default가_조회된다() {
    //given (이렇게 주어지고)
    String expectedProfile = "default";
        MockEnvironment env = new MockEnvironment();
        ProfileController controller = new ProfileController(env);
        //when  (이렇게 하면)
        String profile = controller.profile();
        //then  (이렇게 된다)
        assertThat(profile).isEqualTo(expectedProfile);

    }
}*/
