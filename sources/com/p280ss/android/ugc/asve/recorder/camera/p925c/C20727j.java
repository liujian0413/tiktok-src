package com.p280ss.android.ugc.asve.recorder.camera.p925c;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.c.j */
public final class C20727j {

    /* renamed from: a */
    public static final String[] f55970a = {"Cepheus", "MI 9 Transparent Edition", "MI 9 ROY", "MI 9"};

    /* renamed from: b */
    public static final String[] f55971b = new String[0];

    /* renamed from: a */
    public static int m68899a(String str) {
        for (String equals : f55970a) {
            if (equals.equals(str)) {
                return 3;
            }
        }
        for (String equals2 : f55971b) {
            if (equals2.equals(str)) {
                return 2;
            }
        }
        return 0;
    }
}
