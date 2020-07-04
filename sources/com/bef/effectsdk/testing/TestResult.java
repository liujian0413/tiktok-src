package com.bef.effectsdk.testing;

public class TestResult {
    public int failed_test_count;
    public String report;
    public int reportable_test_count;

    public TestResult(int i, int i2, String str) {
        this.reportable_test_count = i;
        this.failed_test_count = i2;
        this.report = str;
    }
}
