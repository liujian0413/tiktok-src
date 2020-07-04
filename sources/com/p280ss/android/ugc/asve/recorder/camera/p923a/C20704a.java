package com.p280ss.android.ugc.asve.recorder.camera.p923a;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.a.a */
public final class C20704a {

    /* renamed from: a */
    public static final String[] f55922a = {"Cepheus", "MI 9 Transparent Edition", "MI 9 ROY", "MI 9"};

    /* renamed from: b */
    public static final String[] f55923b = {"PCCM00", "PCAM00"};

    /* renamed from: c */
    public static final String[] f55924c = new String[0];

    /* renamed from: a */
    public static int m68743a(String str) {
        if (m68745c(str)) {
            return 2;
        }
        if (m68744b(str)) {
            return 1;
        }
        if (m68746d(str)) {
            return 3;
        }
        return 0;
    }

    /* renamed from: b */
    private static boolean m68744b(String str) {
        for (String equals : f55922a) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m68745c(String str) {
        for (String equals : f55923b) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m68746d(String str) {
        for (String equals : f55924c) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
