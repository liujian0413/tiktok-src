package com.p280ss.android.ugc.bytex.coverage_lib;

/* renamed from: com.ss.android.ugc.bytex.coverage_lib.CoverageLogger */
public class CoverageLogger {
    private CoverageLogger() {
    }

    public static void Log(int i) {
        CoverageHandler.addData(i);
    }
}
