package com.main.testfactory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@SpringBootTest
@AutoConfigureMockMvc
public class TestSuite {

    @BeforeEach
    public void beforeEach() {
        System.out.println("A");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Fin");
    }

    @TestFactory
    public List<DynamicNode> test1() {
        return TestCase.flow(
                TestCase.test("test", () -> System.out.println("testing")));
    }


}
