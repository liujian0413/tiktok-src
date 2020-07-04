package com.ttnet.org.chromium.base;

public class FieldTrialList {
    private FieldTrialList() {
    }

    public static void logActiveTrials() {
        nativeLogActiveTrials();
    }

    private static native String nativeFindFullName(String str);

    private static native String nativeGetVariationParameter(String str, String str2);

    private static native void nativeLogActiveTrials();

    private static native boolean nativeTrialExists(String str);

    public static String findFullName(String str) {
        return nativeFindFullName(str);
    }

    public static boolean trialExists(String str) {
        return nativeTrialExists(str);
    }

    public static String getVariationParameter(String str, String str2) {
        return nativeGetVariationParameter(str, str2);
    }
}
