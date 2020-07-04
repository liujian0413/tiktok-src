package com.p280ss.android.ugc.bytex.coverage_lib;

/* renamed from: com.ss.android.ugc.bytex.coverage_lib.CoverageHandler */
public class CoverageHandler {
    static volatile boolean hasInit;
    private static CoveragePlugin plugin;

    private CoverageHandler() {
    }

    static void addData(int i) {
        if (hasInit) {
            plugin.addData(i);
        }
    }

    public static void init(CoveragePlugin coveragePlugin) {
        if (!hasInit) {
            plugin = coveragePlugin;
            hasInit = true;
        }
    }
}
