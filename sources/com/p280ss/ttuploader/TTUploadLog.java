package com.p280ss.ttuploader;

/* renamed from: com.ss.ttuploader.TTUploadLog */
public class TTUploadLog {
    public static int LogTurnOn = 112;

    /* renamed from: d */
    public static final void m144200d(String str, String str2) {
    }

    /* renamed from: e */
    public static void m144201e(String str, String str2) {
    }

    /* renamed from: i */
    public static final void m144202i(String str, String str2) {
    }

    /* renamed from: k */
    public static final void m144203k(String str, String str2) {
    }

    /* renamed from: t */
    public static final void m144204t(String str, String str2) {
    }

    /* renamed from: w */
    public static final void m144205w(String str, String str2) {
    }

    public static final void turnOn(int i, int i2) {
        int i3 = ((1 << i) ^ -1) & LogTurnOn;
        LogTurnOn = i3;
        LogTurnOn = (i2 << i) | i3;
    }
}
