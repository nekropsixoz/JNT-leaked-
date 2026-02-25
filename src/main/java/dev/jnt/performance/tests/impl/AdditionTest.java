package dev.jnt.performance.tests.impl;

import dev.jnt.performance.tests.PerformanceTest;

public class AdditionTest extends PerformanceTest {

    @Override
    public void handle(int iteration) {
        int result = iteration + RANDOM_NUMBER;
    }

    @Override
    public String getTestName() {
        return "addition";
    }

    @Override
    public int getIterations() {
        return 1000;
    }
}
