package com.main.testfactory;


import com.main.testfactory.domain.TestService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureMockMvc
public class TestSuite {

    @Autowired
    private TestService service;

    @BeforeEach
    public void beforeEach() {
        System.out.println("A");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Fin");
        System.out.println("");
    }

    @TestFactory
    public List<DynamicNode> test1() {
        return TestCase.flow(
                TestCase.test("testa", () -> System.out.println("Testing1")),
                TestCase.test("testb", () -> System.out.println("Testing2")),
                TestCase.test("testbc", () -> System.out.println("Testing3")));
    }

    @TestFactory
    public List<DynamicNode> test2() {
        return TestCase.flow(
                TestCase.test("test", () -> System.out.println("testing2")),
                TestCase.test("test", () -> System.out.println("testing2")),
                TestCase.test("test", () -> System.out.println("testing3")));
    }

}
