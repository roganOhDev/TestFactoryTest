package com.main.testfactory;

import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.function.Executable;

import java.util.List;


//set global time_zone='+9:00';
//        SET time_zone = 'Asia/Seoul';
//        select @@global.time_zone, @@session.time_zone;


public class TestCase {
    public static DynamicNode test(final String displayName, final Executable executable) {
        return DynamicTest.dynamicTest(displayName, executable);
    }

    public static DynamicNode test(final String displayName, final Iterable<DynamicNode> dynamicNodes) {
        return DynamicContainer.dynamicContainer(displayName, dynamicNodes);
    }

    public static List<DynamicNode> flow(DynamicNode... dynamicNodes) {
        return List.of(dynamicNodes);
    }
}
