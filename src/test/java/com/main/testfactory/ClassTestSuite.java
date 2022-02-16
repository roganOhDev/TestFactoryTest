package com.main.testfactory;

import com.main.testfactory.domain.TestTestService;
import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClassTestSuite extends TestSuite {
    @Autowired
    private TestTestService service;

    @BeforeEach
    public void beforeEachChild() {
        System.out.println("Achild");
    }
    @AfterEach
    public void afterEachChild() {
        System.out.println("Finchild2");
        System.out.println("");
    }

    @TestFactory
    public List<DynamicNode> test3() {
        return TestCase.flow(
                TestCase.test("testa", () -> System.out.println("Testing1")),
                TestCase.test("testb", service::get),
                TestCase.test("testbc", () -> System.out.println("Testing3")));
    }

}
