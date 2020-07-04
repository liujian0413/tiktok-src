package com.ttnet.org.chromium.base1;

public class FieldTrialList {
    private FieldTrialList() {
    }

    private static native String nativeFindFullName(String str);

    private static native boolean nativeTrialExists(String str);

    public static String findFullName(String str) {
        return nativeFindFullName(str);
    }

    public static boolean trialExists(String str) {
        return nativeTrialExists(str);
    }
}
