package com.p280ss.android.tfcc;

/* renamed from: com.ss.android.tfcc.Tfcc */
public class Tfcc {
    private static native String tfccDecrypt(int i, String str, String str2);

    private static native String tfccEncrypt(int i, String str, String str2);

    static {
        C20419a.m67758a("tfcc");
    }
}
