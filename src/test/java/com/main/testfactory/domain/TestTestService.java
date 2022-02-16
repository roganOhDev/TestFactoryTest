package com.main.testfactory.domain;

import org.assertj.core.api.Assertions;
import org.springframework.stereotype.Component;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

@Component
public class TestTestService {

    private final MockMvc mvc;
    private final TestService service;

    public TestTestService(MockMvc mvc, TestService service1) {
        this.mvc = mvc;
        this.service = service1;
    }

    public void test(){
        Assertions.assertThat("abc").isEqualTo("abc");
    }

    public void get(){
        Assertions.assertThat(service.get().size()).isEqualTo(2);
    }
}
