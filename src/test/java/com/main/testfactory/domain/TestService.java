package com.main.testfactory.domain;

import org.assertj.core.api.Assertions;
import org.springframework.stereotype.Component;

@Component
public class TestService {
    public void test(){
        Assertions.assertThat("abc").isEqualTo("abc");
    }
}
