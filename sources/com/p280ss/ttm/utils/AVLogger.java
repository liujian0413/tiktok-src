package com.p280ss.ttm.utils;

/* renamed from: com.ss.ttm.utils.AVLogger */
public class AVLogger {
    public static int LogTurnOn = 112;

    /* renamed from: d */
    public static final void m144194d(String str, String str2) {
    }

    /* renamed from: e */
    public static void m144195e(String str, String str2) {
    }

    /* renamed from: i */
    public static final void m144196i(String str, String str2) {
    }

    /* renamed from: k */
    public static final void m144197k(String str, String str2) {
    }

    /* renamed from: t */
    public static final void m144198t(String str, String str2) {
    }

    /* renamed from: w */
    public static final void m144199w(String str, String str2) {
    }

    public static final void turnOn(int i, int i2) {
        int i3 = ((1 << i) ^ -1) & LogTurnOn;
        LogTurnOn = i3;
        LogTurnOn = (i2 << i) | i3;
    }
}
