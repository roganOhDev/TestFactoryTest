package com.main.testfactory.domain;

import org.assertj.core.api.Assertions;
import org.springframework.stereotype.Component;
import org.springframework.test.web.servlet.MockMvc;

@Component
public class TestService {

    private final MockMvc mvc;

    public TestService(MockMvc mvc) {
        this.mvc = mvc;
    }

    public void test(){
        Assertions.assertThat("abc").isEqualTo("abc");
    }
}
