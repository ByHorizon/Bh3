package com.jojoldu.book.springboot.domain.posts;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanUp(){
        postsRepository.deleteAll();
    }
    @Test
    public void 게시글저장_불러오기(){
    //given (이렇게 주어지고)
    String title = "테스트 게시글";
    String content = "테스트 본문";
    postsRepository.save(Posts.builder()
                    .title(title)
                    .content(content)
                    .author("rptedpa5@naver.com")
            .build());
    //when  (이렇게 하면)
        List<Posts> postsList = postsRepository.findAll();
        //then  (이렇게 된다)
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }
    @Test
    public void register_BaseTimeEntity() throws Exception {
    //given (이렇게 주어지고)
        LocalDateTime now = LocalDateTime.of(2022,12,07,0,0,0);
        postsRepository.save(Posts.builder()
                        .title("title")
                        .content("content")
                        .author("author")
                .build());
    //when  (이렇게 하면)
        List<Posts> postList = postsRepository.findAll();
        //then  (이렇게 된다)
        Posts posts = postList.get(0);
        System.out.println(">>>>>>>>>>>>> createDate=" + posts.getCreatedDate() + ", modifiedDate =" + posts.getModifiedDate());
        assertThat(posts.getCreatedDate()).isAfter(now);
        assertThat(posts.getModifiedDate()).isAfter(now);
    }

}