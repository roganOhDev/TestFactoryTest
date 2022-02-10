package com.main.testfactory.domain;

import org.springframework.stereotype.Component;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;


@Component
public class TestService {

    private final MockMvc mvc;

    public TestService(MockMvc mvc) {
        this.mvc = mvc;
    }

    public void test(){
        assertThat("abc").isEqualTo("abc");
    }
}
